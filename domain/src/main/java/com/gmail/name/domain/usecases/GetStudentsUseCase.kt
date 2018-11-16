package com.gmail.name.domain.usecases

import com.gmail.name.domain.entity.Person
import com.gmail.name.domain.executor.PostExecutorThread
import com.gmail.name.domain.repositories.PersonRepository
import io.reactivex.Observable

class GetStudentsUseCase constructor(private val personRepository: PersonRepository, postExecutorThread: PostExecutorThread) : BaseUseCase(postExecutorThread) {

    fun get(): Observable<List<Person>> {
        return personRepository.get()
                .observeOn(postExecutorThread)
                .subscribeOn(workExecutorThread)
    }
}
