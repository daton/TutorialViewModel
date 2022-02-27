package com.unitec.tutorialviewmodel

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.jackson.JacksonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://reforesta.herokuapp.com/")
            .addConverterFactory(JacksonConverterFactory.create())
            .build()
    }
}