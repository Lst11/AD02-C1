package com.gmail.name.data.repositories

import android.util.Log
import com.gmail.name.domain.entity.Person
import com.gmail.name.domain.entity.PersonSearch
import com.gmail.name.domain.repositories.PersonRepository
import io.reactivex.Completable
import io.reactivex.Observable

class PersonRepositoryImpl : PersonRepository {
    private var list = PersonListSingleton.list

    override fun get(): Observable<List<Person>> {
        return Observable.just(list)
    }


    override fun search(search: PersonSearch): Observable<List<Person>> {
        val filteredList: ArrayList<Person> = ArrayList<Person>()
        Log.e("aaa", "PersonRepositoryImpl: text to search is ${search.name}")
        list.forEach {
            if (it.name.contains(search.name, true) || it.surname.contains(search.name, true)) {
                filteredList.add(it)
            }
        }
        return Observable.just(filteredList)
    }

    override fun getById(id: String): Observable<Person>? {
        for (person in list) {
            if (person.id.equals(id)) {
                return Observable.just(person)
            }
        }
        return null
    }

    override fun update(personNew: Person): Completable {
        var indexForUpdate: Int? = null
        list.forEachIndexed { index, person ->
            if (personNew.id.equals(person.id)) {
                Log.e("aaa", "Person id for update is: ${person.id}")
                indexForUpdate = index
            }
        }
        if (indexForUpdate == null && personNew.name.isNotEmpty() || personNew.surname.isNotEmpty()) createNewPerson(personNew.name, personNew.surname, personNew.url)
        else list.set(indexForUpdate!!, personNew)


        return Completable.complete()
    }

    override fun delete(personId: String): Completable {
        var indexForDel: Int? = null
        list.forEachIndexed { index, person ->
            if (personId.equals(person.id)) {
                Log.e("aaa", "Person id for deleting is: $personId")
                indexForDel = index
            }
        }
        indexForDel?.let { list.removeAt(it) }
        Log.e("aaa", "Delete $indexForDel person")
        return Completable.complete()
    }

    private fun createNewPerson(name: String, surname: String, imageUrl: String) {

        val idNew: Int = list[list.size - 1].id.toInt() + 1
        val personNew = Person(idNew.toString(), name, surname, "")
        Log.e("aaa", "Person for add is: $personNew")
        Log.e("aaa", "New id is: ${personNew.id}")

        list.add(personNew)
        Log.e("aaa", "New id is: $list")

    }

}