package com.gmail.name.data.net

import android.util.Log
import com.gmail.name.data.entity.PersonRequest
import com.gmail.name.data.entity.PersonResponse
import com.gmail.name.data.entity.transformToDomain
import com.gmail.name.data.utils.Transformer
import com.google.gson.Gson
import io.reactivex.Completable
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RestService(apiUrl: String) {

    private val restApi: RestApi

    init {
        val okHttpBuilder = OkHttpClient.Builder()
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .connectTimeout(30, TimeUnit.SECONDS)

        val logging = HttpLoggingInterceptor()
        okHttpBuilder.addInterceptor(logging)

        val retrofit = Retrofit.Builder()
                .baseUrl(apiUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(Gson()))
                .client(okHttpBuilder.build())
                .build()
        restApi = retrofit.create(RestApi::class.java)
    }

    fun getPeople(): Observable<List<PersonResponse>> {
        return restApi.getPersonList()
    }

    fun updateStudent(personRequest: PersonRequest): Completable {
        Log.e("aaa", "updateStudent ${personRequest.name} ${personRequest.surname} - id: ${personRequest.id}: url: ${personRequest.imageUrl}")
        if (personRequest.id.isNotEmpty()) {
            val temp = restApi.updatePerson(personRequest.id, personRequest)
                    .map {
                        it.transformToDomain()
                    }
            return Completable.fromObservable(temp)
        } else return addPerson(personRequest)
    }

    fun deletePerson(id: String): Completable {
        val temp = restApi.deletePerson(id)
        return Completable.fromObservable(temp)
    }

    fun getStudentById(id: String): Observable<PersonResponse> {
        Log.e("aaa", "id to search is: $id")
        return restApi.getPersonById(id)
                .doOnError { Log.e("aaa", it.toString()) }
    }

    fun searchStudent(name: String): Observable<List<PersonResponse>> {
        return restApi.searchStudent(Transformer.transformNameToRequest(name))
    }

    fun addPerson(personRequest: PersonRequest): Completable {
        val temp = restApi.putPerson(personRequest)
                .doOnError { Log.e("aaa", "PersonRequest addPerson $it") }
                .map {
                    it.transformToDomain()
                }
        return Completable.fromObservable(temp)
    }
}
