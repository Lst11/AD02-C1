package com.gmail.superarch.presentation.screen.person.list

import android.databinding.ObservableBoolean
import android.util.Log
import com.gmail.name.domain.entity.PersonSearch
import com.gmail.superarch.fuctories.UseCaseProvider
import com.gmail.superarch.presentation.base.BaseViewModel
import com.gmail.superarch.presentation.screen.person.PersonRouter
import com.gmail.superarch.presentation.utils.ClickListener
import com.gmail.superarch.presentation.utils.PersonRecyclerViewAdapter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers

class StudentListViewModel : BaseViewModel<PersonRouter>() {

    val isProgressEnabled = ObservableBoolean(false)

    private val studentListUseCase = UseCaseProvider.provideGetStudentListUseCase()

    private val searchStudentsUseCase = UseCaseProvider.provideSearchStudentUseCase()


    private val listener = object : ClickListener {
        override fun onClick(id: String) {
            router?.goToStudentDetails(id)
        }
    }

    val adapter: PersonRecyclerViewAdapter = PersonRecyclerViewAdapter()

    init {
        adapter.listener = listener
        isProgressEnabled.set(true)
        val disposable = studentListUseCase.get()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
                .subscribeBy(
                        onNext = {
                            Log.e("aaa", "StudentListViewModel size of the list is: " + it.size)
                            adapter.items = it
                            adapter.notifyDataSetChanged()
                            isProgressEnabled.set(false)
                        },
                        onError =
                        {
                            Log.e("aaa", "StudentListViewModel doOnError deletePerson: $it")
                            isProgressEnabled.set(false)
                            router?.showError(it)
                        }
                )
        addToDisposable(disposable)
    }

    fun search(search: String) {

        if (isProgressEnabled.get()) return

        val studentSearch = PersonSearch(search)
        val disposable = searchStudentsUseCase.search(studentSearch)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeBy(
                        onNext = {
                            adapter.items = it
                            adapter?.notifyDataSetChanged()
                        },
                        onError = {
                            router?.showError(it)
                        }
                )
        addToDisposable(disposable)
    }

    fun onClickAdd() {
        router?.goToStudentDetails("")
    }
}