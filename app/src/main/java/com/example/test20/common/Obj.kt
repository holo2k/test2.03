package com.example.test20.common

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object Obj {
    fun getRetrofit() : ApiRet{
        val Retrofit = Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val api = Retrofit.create(ApiRet::class.java)
        return api
    }
}
