package com.gmail.superarch.presentation.screen.person.list

import android.databinding.ObservableBoolean
import android.util.Log
import com.gmail.name.domain.entity.PersonSearch
import com.gmail.superarch.fuctories.UseCaseProvider
import com.gmail.superarch.presentation.base.BaseViewModel
import com.gmail.superarch.presentation.screen.person.PersonRouter
import com.gmail.superarch.presentation.utils.ClickListener
import com.gmail.superarch.presentation.utils.PersonRecyclerViewAdapter
import io.reactivex.rxkotlin.subscribeBy

class StudentListViewModel : BaseViewModel<PersonRouter>() {

    val isProgressEnabled = ObservableBoolean(false)

    private val studentListUseCase = UseCaseProvider.provideGetStudentListUseCase()

    private val searchStudentsUseCase = UseCaseProvider.provideSearchStudentUseCase()


    //FIXME При клике на юзера вызывать router.goToStudentDetails()
    private val listener = object : ClickListener {
        override fun onClick(id: String) {
            router?.goToStudentDetails(id)
        }
    }

    //FIXME поменять на свой adapter
    val adapter: PersonRecyclerViewAdapter = PersonRecyclerViewAdapter()


    init {
        adapter.listener = listener
        isProgressEnabled.set(true)
        val disposable = studentListUseCase.get()
                .subscribeBy(
                        onNext = {
                            //FIXME передать данные в adapter
                            adapter.items = studentListUseCase.get().blockingSingle()
                            adapter?.notifyDataSetChanged()
//                            adapter = PersonRecyclerViewAdapter(studentListUseCase.get().blockingSingle(), listener)
                            isProgressEnabled.set(false)
                        },
                        onError = {
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
                .subscribeBy(
                        onNext = {
                            //FIXME передать данные в adapter
                            var listFilt = searchStudentsUseCase.search(studentSearch).blockingSingle()
                            adapter.items=listFilt
                            adapter?.notifyDataSetChanged()
//                            adapter = PersonRecyclerViewAdapter(searchStudentsUseCase.search(studentSearch).blockingSingle(), listener)
                            Log.e("aaa", "The list after filtr is: $listFilt")
                        },
                        onError = {
                            router?.showError(it)
                        }
                )
        addToDisposable(disposable)
    }

    fun onClickAdd(){
        router?.goToStudentDetails("")
    }
}