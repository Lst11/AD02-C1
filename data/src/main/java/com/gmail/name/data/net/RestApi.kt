package com.gmail.name.data.net

import com.gmail.name.data.entity.PersonDeleteRequest
import com.gmail.name.data.entity.PersonRequest
import com.gmail.name.data.entity.PersonResponse
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.*

interface RestApi {

    @GET("People")
    fun getPersonList(): Observable<List<PersonResponse>>


    @GET("People/{id}")
    fun getStudentById(@Path("id") id: String): Observable<PersonResponse>

    //https://tut.by/api/students/21314/
    @POST("students")
    fun updateStudent(@Body student: PersonRequest): Observable<PersonResponse>

    //https://tut.by/api/students/21314/
    @DELETE("students/{id}/")
    fun deleteStudent(@Path("id") id: String): Observable<Void>

    //https://tut.by/api/students/21314/
    @DELETE("students/{id}/")
    fun deleteStudent(@Body student: PersonDeleteRequest): Observable<Void>






    @GET("People")
    fun get(): Call<List<PersonResponse>>

}