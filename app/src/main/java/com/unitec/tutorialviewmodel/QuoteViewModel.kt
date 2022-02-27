package com.unitec.tutorialviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class QuoteViewModel : ViewModel() {

    var getQuotesUseCase = GetQuotesUseCase()

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote() {
     //   val currentQuote = QuoteProvider.random()
     //   quoteModel.postValue(currentQuote)
    }

    fun onCreate() {
        viewModelScope.launch {
            val result = getQuotesUseCase()
            if(!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
            }
        }
    }
}