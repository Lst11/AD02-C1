package com.gmail.superarch.presentation.screen.person.details

import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.os.Handler
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

        val disposable = useCases.provideGetPersonUseCase().getById(id)
                ?.subscribeBy(
                        onNext = {
                            Log.e("aaa", "Person is ${it.name} ${it.surname}")
                            this.id = it.id
                            this.name.set(it.name)
                            this.surname.set(it.surname)
                            this.imageUrl.set(it.imageUrl)
                        },
                        onError = {
                            Log.e("aaa", "PersonDetailsViewModel error: $it")
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
                ?.subscribeBy(
                        onError = { Log.e("aaa", "PersonDetailsViewModel onClickSave onError: $it") },
                        onComplete = {
                            Log.e("aaa", "PersonDetailsViewModel onClickSave onComplete")
                            Handler().postDelayed({}, 120)
                            router?.goToStudentList()
                        })
    }

    fun onClickDelete() {
        useCases.provideDeleteStudentUseCase().delete(id)
                ?.subscribeBy(
                        onError = { Log.e("aaa", "PersonDetailsViewModel onClickDelete onError: $it") },
                        onComplete = {
                            Log.e("aaa", "PersonDetailsViewModel onClickDelete onComplete")
                            Handler().postDelayed({}, 120)
                            router?.goToStudentList()
                        })
    }
}

