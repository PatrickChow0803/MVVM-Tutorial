package com.patrickchow.myapplication.ui.quotes

import androidx.lifecycle.ViewModel
import com.patrickchow.myapplication.data.Quote
import com.patrickchow.myapplication.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository): ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuotes(quote: Quote) = quoteRepository.addQuote(quote)
}