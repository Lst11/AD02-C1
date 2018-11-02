package com.gmail.name.domain.usecases

import com.gmail.name.domain.entity.Person
import com.gmail.name.domain.repositories.PersonRepository
import io.reactivex.Observable

class GetStudentsUseCase(private val personRepository: PersonRepository) : BaseUseCase() {

    fun get() : Observable<List<Person>> {
        return personRepository.get()
    }
}
