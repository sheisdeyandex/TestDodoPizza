package com.test.tz.data.repository

import com.test.tz.data.models.MainModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiPostInterface {
    @POST("token")
    fun postToken(@Body token:MainModel): Call<String>
    companion object {
        var BASE_URL = "https://google.com/"
        fun create() : ApiPostInterface {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiPostInterface::class.java)
        }
    }
}