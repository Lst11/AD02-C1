package com.gmail.superarch.presentation.screen.person.details

import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.util.Log
import com.gmail.superarch.fuctories.UseCaseProvider
import com.gmail.superarch.presentation.base.BaseViewModel
import com.gmail.superarch.presentation.screen.person.PersonRouter
import io.reactivex.rxkotlin.subscribeBy


class PersonDetailsViewModel : BaseViewModel<PersonRouter>() {

    private val useCases = UseCaseProvider

    val isProgressEnabled = ObservableBoolean(false)

    private var studentId: String? = null

    var id = ("")
    var name = ObservableField<String>("")
    var surname = ObservableField<String>("")
    var imageUrl = ObservableField<String>("")

    fun setStudentId(id: String) {

        if (studentId != null) return

        studentId = id

        //FIXME Тут будет вызо UseCase, который возвращает одного студента по id
        val disposable = useCases.provideGetPersonUseCase().getById(id)
                ?.subscribeBy(
                        onNext = {
                            this.id = it.id
                            name.set(it.name)
                            surname.set(it.surname)
                            imageUrl.set(it.url)
                        },
                        onError = {
                            isProgressEnabled.set(false)
                            router?.showError(it)
                        }
                )
        disposable?.let { addToDisposable(it) }
    }

    fun onClickSave() {
        val person = com.gmail.name.domain.entity.Person(id, name.get() ?: "", surname.get()
                ?: "", imageUrl.get() ?: "")
        Log.e("aaa", "Changing data is: $person")
        useCases.provideUpdateStudentUseCase().update(person)
        router?.goToStudentList()
    }

    fun onClickDelete() {
        useCases.provideDeleteStudentUseCase().delete(id)
        router?.goToStudentList()
    }
}