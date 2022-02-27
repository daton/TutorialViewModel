package com.unitec.tutorialviewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ArbolModel():ViewModel() {


    private val retrofit = RetrofitHelper.getRetrofit()
    private val arboles:MutableLiveData<List<Arbol>> by lazy{
MutableLiveData<List<Arbol>>().also {
    cargarArboles()
       }
    }
    fun getArboles(): LiveData<List<Arbol>> {
        return arboles
    }
    private fun cargarArboles(){
// Aqui se hacen operaciones asincronicas por ejemplo con Coroutines hermosas
                GlobalScope.launch(Dispatchers.IO){
                 var x=retrofit.create(ArbolServicio::class.java)
                     .buscarLozalizados().execute().body()
                    launch(Dispatchers.Main) {
                        arboles.value=x
                    }

                }


    }
}