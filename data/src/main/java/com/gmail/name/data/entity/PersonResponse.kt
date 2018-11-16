package com.gmail.name.data.entity

import com.google.gson.annotations.SerializedName

class PersonResponse(
        @SerializedName("objectId")
        val id: String,

        @SerializedName("name")
        val name: String,

        @SerializedName("surname")
        val surname: String,

        @SerializedName("imageUrl")
        val imageUrl: String) : DataEntity