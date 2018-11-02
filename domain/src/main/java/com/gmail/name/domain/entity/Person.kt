package com.gmail.name.domain.entity

data class Person(val id: String,
                  val name: String,
                  val surname: String,
                  val url: String) : DomainEntity