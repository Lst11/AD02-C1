package com.gmail.name.domain.usecases

import com.gmail.name.domain.entity.Person
import com.gmail.name.domain.entity.PersonSearch
import com.gmail.name.domain.repositories.PersonRepository
import io.reactivex.Observable

class SearchStudentsUseCase(private val personRepository: PersonRepository) : BaseUseCase() {

    fun search(searchPerson: PersonSearch) : Observable<List<Person>> {
        return personRepository.search(searchPerson)
    }
}