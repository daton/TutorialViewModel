package com.unitec.tutorialviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UsuarioModel: ViewModel() {
private val usuarios:MutableLiveData<List<Usuario>> by lazy{
       MutableLiveData<List<Usuario>>().also {
             cargarUsuarios()
       }
    }

    fun getUsuarios(): LiveData<List<Usuario>> {
        return usuarios
    }
    private fun cargarUsuarios(){
// Aqui se hacen operaciones asincronicas por ejemplo con Coroutines hermosas

    }
}