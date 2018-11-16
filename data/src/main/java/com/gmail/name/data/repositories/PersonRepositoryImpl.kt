package com.gmail.name.data.repositories

import android.util.Log
import com.gmail.name.data.entity.transformToDomain
import com.gmail.name.data.net.RestService
import com.gmail.name.data.utils.Transformer
import com.gmail.name.domain.entity.Person
import com.gmail.name.domain.entity.PersonSearch
import com.gmail.name.domain.repositories.PersonRepository
import io.reactivex.Completable
import io.reactivex.Observable

class PersonRepositoryImpl : PersonRepository {

    private val restServise = RestService("https://api.backendless.com/96A20093-5821-4899-FFA9-0921A11D0E00/136461D4-1B8B-28DB-FF33-A9412F60A000/data/")

    override fun get(): Observable<List<Person>> {
        return restServise.getPeople()
                .map { list ->
                    list.map { person ->
                        person.transformToDomain()
                    }
                }
    }

    override fun search(search: PersonSearch): Observable<List<Person>> {
        Log.e("aaa", "search : $search")
        return restServise.searchStudent(search.name)
                .map { list ->
                    list.map { person ->
                        person.transformToDomain()
                    }
                }
    }

    override fun getById(id: String): Observable<Person>? {
        return restServise.getStudentById(id)
                .map {
                    it.transformToDomain()
                }
    }

    override fun update(person: Person): Completable {
        return restServise.updateStudent(Transformer.transformPersonToRequest(person))
    }

    override fun delete(personId: String): Completable {
        return restServise.deletePerson(personId)
    }
}