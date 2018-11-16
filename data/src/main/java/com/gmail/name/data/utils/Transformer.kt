package com.gmail.name.data.utils

import com.gmail.name.data.entity.PersonRequest
import com.gmail.name.domain.entity.Person

object Transformer {
    fun transformIdToRequest(id: String?): String {
        return "id=${id}"
    }

    fun transformNameToRequest(name: String?): String {
        return "name LIKE'${name}%'"
    }

    fun transformPersonToRequest(person: Person): PersonRequest {
        return PersonRequest(person.id, person.name, person.surname, person.imageUrl)
    }
}