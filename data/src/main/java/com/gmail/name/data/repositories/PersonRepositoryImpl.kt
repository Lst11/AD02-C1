package com.gmail.name.data.repositories

import android.util.Log
import com.gmail.name.data.entity.transformToDomain
import com.gmail.name.data.net.RestService
import com.gmail.name.domain.entity.Person
import com.gmail.name.domain.entity.PersonSearch
import com.gmail.name.domain.repositories.PersonRepository
import io.reactivex.Completable
import io.reactivex.Observable

class PersonRepositoryImpl : PersonRepository {

    val restServise = RestService("https://api.backendless.com/96A20093-5821-4899-FFA9-0921A11D0E00/136461D4-1B8B-28DB-FF33-A9412F60A000/data/")

    override fun get(): Observable<List<Person>> {


        Log.e("aaa", "in get")
        return restServise.getStudents()
                .doOnNext { list -> Log.e("aaa", list.size.toString()) }
                .map { list ->
                    list.map { person ->
                        person.transformToDomain()
                    }
                }
    }


    override fun search(search: PersonSearch): Observable<List<Person>> {

//        restServise.getStudents().subscribeBy(onNext = {
//            val size = it.size
//            Log.e("aaa", "size is $size")
//        })


        Log.e("aaa", "in search")

        return restServise.getStudents()
                .map { list ->
                    list.map { student ->
                        student.transformToDomain()
                    }
                }
    }

    override fun getById(id: String): Observable<Person>? {

        val person: Observable<Person> = restServise.getStudentById(id)
                .map { student ->
                    student.transformToDomain()
                }
        return person

    }

    override fun update(personNew: Person): Completable {

        return Completable.complete()
    }

    override fun delete(personId: String): Completable {
        return Completable.complete()
    }

    private fun createNewPerson(name: String, surname: String, imageUrl: String) {

//        val idNew: Int = listRest[listRest.size - 1].id.toInt() + 1
//        val personNew = Person(idNew.toString(), name, surname, "")
//        Log.e("aaa", "Person for add is: $personNew")
//        Log.e("aaa", "New id is: ${personNew.id}")
//
////        listRest.add(personNew)
//        Log.e("aaa", "New id is: $listRest")

    }

}