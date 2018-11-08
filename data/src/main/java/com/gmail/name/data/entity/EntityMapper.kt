package com.gmail.name.data.entity

import com.gmail.name.domain.entity.Person

fun PersonResponse.transformToDomain(): Person {
    return Person(id = id, name = name, surname = surname, imageUrl = imageUrl)
}
