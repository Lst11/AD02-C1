package com.gmail.name.data.entity

import com.google.gson.annotations.SerializedName

data class PersonDeleteRequest(@SerializedName("id")
                           val id: String)