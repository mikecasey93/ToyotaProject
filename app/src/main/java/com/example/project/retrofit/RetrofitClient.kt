package com.example.project.retrofit

import com.example.project.data.ApiDetails
import com.example.project.data.EndPoint
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    const val BASE_URL = "https://xkcd.com/"

    val retrofitInstance: EndPoint by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(EndPoint::class.java)
    }
}