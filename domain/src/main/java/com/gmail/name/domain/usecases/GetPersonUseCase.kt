package com.gmail.name.domain.usecases

import com.gmail.name.domain.entity.Person
import com.gmail.name.domain.executor.PostExecutorThread
import com.gmail.name.domain.repositories.PersonRepository
import io.reactivex.Observable
import java.util.concurrent.TimeUnit

class GetPersonUseCase(private val personRepository: PersonRepository, postExecutorThread: PostExecutorThread) : BaseUseCase(postExecutorThread) {

    fun getById(id: String): Observable<Person>? {
        return personRepository.getById(id)
                ?.observeOn(postExecutorThread)
                ?.subscribeOn(workExecutorThread)
    }
}
