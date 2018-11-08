package com.gmail.name.data.net

import android.util.Log
import com.gmail.name.data.entity.PersonRequest
import com.gmail.name.data.entity.PersonResponse
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RestService(private val apiUrl: String) {

    private val restApi: RestApi

    init {
        val okHttpBuilder = OkHttpClient.Builder()
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .connectTimeout(30, TimeUnit.SECONDS)
//               .addInterceptor {  } // для внесения изменений перед отправкой на сервер или наоборот


        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.HEADERS
        okHttpBuilder.addInterceptor(logging)

        val gson = Gson()
//                 = GsonBuilder()
//                .addDeserializationExclusionStrategy()
//                  .registerTypeAdapter(Student::class.java, ... )

        val retrofit = Retrofit.Builder()
                .baseUrl("https://api.backendless.com/96A20093-5821-4899-FFA9-0921A11D0E00/136461D4-1B8B-28DB-FF33-A9412F60A000/data/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpBuilder.build())
                .build()

        restApi = retrofit.create(RestApi::class.java)


        val listCall = restApi.get()
        listCall.enqueue(object : Callback<List<PersonResponse>> {
            override fun onResponse(call: Call<List<PersonResponse>>?, response: Response<List<PersonResponse>>?) {
                if (response?.isSuccessful!!) {
                    Log.e("aaa", "response: size is " + response.body()?.size)
                } else {
                    Log.e("sss", "response code " + response.code())
                }
            }

            override fun onFailure(call: Call<List<PersonResponse>>, t: Throwable) {
                Log.e("aaa", "failure $t")
            }
        })
    }

    fun getStudents(): Observable<List<PersonResponse>> {
        return restApi.getPersonList()
    }

    fun updateStudent(person: PersonRequest): Observable<PersonResponse> {
        return restApi.updateStudent(person)
    }

    fun deleteStudent(id: String): Observable<Void> {
        return restApi.deleteStudent(id)
    }

    fun getStudentById(id: String): Observable<PersonResponse> {
        return restApi.getStudentById(id)
    }
}