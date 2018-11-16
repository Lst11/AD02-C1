package com.gmail.name.domain.usecases

import com.gmail.name.domain.entity.Person
import com.gmail.name.domain.executor.PostExecutorThread
import com.gmail.name.domain.repositories.PersonRepository
import io.reactivex.Completable

class UpdateStudentUseCase(private val personRepository: PersonRepository, postExecutorThread: PostExecutorThread) : BaseUseCase(postExecutorThread) {

    fun update(person: Person): Completable {
        return personRepository.update(person)
                .observeOn(postExecutorThread)
                .subscribeOn(workExecutorThread)
    }
}