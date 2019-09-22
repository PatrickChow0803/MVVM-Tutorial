package com.patrickchow.myapplication.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeQuoteDao {
    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()

    //Used to have quotes reflect quoteList
    init {
        quotes.value = quoteList
    }

    //Add to the list of quotes and update the quotes LiveData
    fun addQuote(quote: Quote){
        quoteList.add(quote)
        quotes.value = quoteList
    }

    //Return all the quotes, which quotes does.
    //We are casting this as LiveData because we don't want to be able
    //to modify quotes outside of FakeQuoteDao
    fun getQuotes() = quotes as LiveData<List<Quote>>

}