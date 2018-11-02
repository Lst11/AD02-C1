package com.gmail.name.domain.usecases

import com.gmail.name.domain.entity.Person
import com.gmail.name.domain.repositories.PersonRepository
import io.reactivex.Completable

class UpdateStudentUseCase(private val personRepository: PersonRepository) : BaseUseCase() {

    fun update(person: Person) : Completable {
        return personRepository.update(person)
    }
}