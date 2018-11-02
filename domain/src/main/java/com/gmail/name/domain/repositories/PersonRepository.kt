package com.gmail.name.domain.repositories

import com.gmail.name.domain.entity.Person
import com.gmail.name.domain.entity.PersonSearch
import io.reactivex.Completable
import io.reactivex.Observable

interface PersonRepository : BaseRepository {

    fun get() : Observable<List<Person>>

    //FIXME Реализовать возможность получить одного студента по id
    fun getById(id: String) : Observable<Person>?

    fun search(search: PersonSearch) : Observable<List<Person>>

    fun update(person: Person) : Completable

    fun delete(personId: String) : Completable
}