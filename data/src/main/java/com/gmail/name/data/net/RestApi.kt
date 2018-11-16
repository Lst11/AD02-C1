package com.gmail.name.data.net

import com.gmail.name.data.entity.PersonRequest
import com.gmail.name.data.entity.PersonResponse
import io.reactivex.Observable
import retrofit2.http.*

interface RestApi {

    @GET("People")
    fun getPersonList(): Observable<List<PersonResponse>>

    @GET("People/{id}")
    fun getPersonById(@Path("id") id: String): Observable<PersonResponse>

    @GET("People")
    fun searchStudent(@Query("where") name: String?): Observable<List<PersonResponse>>

    @DELETE("People/{id}")
    fun deletePerson(@Path("id") id: String): Observable<MessageResponse>

    @PUT("People/{id}")
    fun updatePerson(
            @Path("id") id: String,
            @Body personRequest: PersonRequest
    ): Observable<PersonResponse>

    @Headers("Content-Type:application/json")
    @PUT("People")
    fun putPerson(
            @Body personRequest: PersonRequest
    ): Observable<PersonResponse>



}