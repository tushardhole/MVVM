package com.android.easyentry.mvvm_basics.ui.quotes

import androidx.lifecycle.ViewModel
import com.android.easyentry.mvvm_basics.data.FakeQuoteDAO
import com.android.easyentry.mvvm_basics.data.Quote

class QuotesViewModel(val quoteDAO: FakeQuoteDAO) : ViewModel() {
    fun getQuotes() = quoteDAO.getQuotes()

    fun addQuote(quote: Quote) = quoteDAO.adddQuote(quote)
}