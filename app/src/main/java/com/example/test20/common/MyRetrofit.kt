package com.example.test20.common

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MyRetrofit {
    fun getRetrofit() : Retrofit = Retrofit.Builder().
            baseUrl("url")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
}