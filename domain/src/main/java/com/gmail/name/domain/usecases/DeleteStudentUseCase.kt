package com.gmail.name.domain.usecases

import com.gmail.name.domain.executor.PostExecutorThread
import com.gmail.name.domain.repositories.PersonRepository
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single
import java.util.*

class DeleteStudentUseCase constructor(private val personRepository: PersonRepository, postExecutorThread: PostExecutorThread) : BaseUseCase(postExecutorThread) {

    fun delete(personId: String): Completable? {
        return personRepository.delete(personId)
                .observeOn(postExecutorThread)
                .subscribeOn(workExecutorThread)
    }
}