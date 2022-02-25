package com.unitec.tutorialviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val modelo:UsuarioModel by viewModels()
        modelo.getUsuarios().observe(this, Observer<List<Usuario>> { usuarios->
            //Aqui enviamos o actualizamos en la interface de usuario UI

        })

    }
}