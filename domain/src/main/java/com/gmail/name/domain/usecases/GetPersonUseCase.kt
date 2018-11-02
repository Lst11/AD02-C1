package com.gmail.name.domain.usecases

import com.gmail.name.domain.entity.Person
import com.gmail.name.domain.repositories.PersonRepository
import io.reactivex.Observable

class GetPersonUseCase(private val personRepository: PersonRepository) : BaseUseCase() {

    fun getById(id: String) : Observable<Person>? {
        return personRepository.getById(id)
    }
}
