package com.android.easyentry.mvvm_basics.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeQuoteDAO {
    private val list = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        quotes.value = list
    }

    fun adddQuote(quote: Quote) {
        list.add(quote)
        quotes.value = list
    }

    fun getQuotes() = quotes as LiveData<List<Quote>>
}