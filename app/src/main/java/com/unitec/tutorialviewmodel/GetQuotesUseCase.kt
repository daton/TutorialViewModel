package com.unitec.tutorialviewmodel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}