package com.gmail.name.domain.usecases

import com.gmail.name.domain.repositories.PersonRepository
import io.reactivex.Completable

class DeleteStudentUseCase(private val personRepository: PersonRepository) : BaseUseCase() {

    fun delete(personId: String) : Completable {
        return personRepository.delete(personId)
    }
}