package com.unitec.tutorialviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel

/*
Tutorial de
https://cursokotlin.com/mvvm-en-android-con-kotlin-implementando-retrofit-corrutinas-y-clean-architecture/
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val modelo:ArbolModel by viewModels()
        modelo.getArboles().observe(this, Observer<List<Arbol>> { arboles->
            //Aqui enviamos o actualizamos en la interface de usuario UI
            Log.i("XX","arboles ${arboles.size}")
       })





    }
}