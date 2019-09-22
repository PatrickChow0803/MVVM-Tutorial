package com.patrickchow.myapplication.utilities

import com.patrickchow.myapplication.data.FakeDatabase
import com.patrickchow.myapplication.data.QuoteRepository
import com.patrickchow.myapplication.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuoteViewModelFactory(): QuotesViewModelFactory{
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}