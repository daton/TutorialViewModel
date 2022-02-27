package com.unitec.tutorialviewmodel

import retrofit2.Call
import retrofit2.http.GET

interface ArbolServicio {

    @GET("api/arbol")
    fun buscarLozalizados(): Call<ArrayList<Arbol>>
}