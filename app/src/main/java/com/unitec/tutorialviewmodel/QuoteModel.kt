package com.unitec.tutorialviewmodel

import com.google.gson.annotations.SerializedName

/*
Tutorial de
https://cursokotlin.com/mvvm-en-android-con-kotlin-implementando-retrofit-corrutinas-y-clean-architecture/
 */
data class QuoteModel(
    @SerializedName("quote") val quote: String,
    @SerializedName("author") val author: String
)
