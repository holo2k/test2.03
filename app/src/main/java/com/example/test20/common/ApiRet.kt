package com.example.test20.common

import com.example.test20.login
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiRet {
    @POST("/user/login")
    fun getAuth(@Body hashMap: HashMap<String,String>): Call<login>
}