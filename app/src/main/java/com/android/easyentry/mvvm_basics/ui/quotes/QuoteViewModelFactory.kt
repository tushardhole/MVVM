package com.android.easyentry.mvvm_basics.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.android.easyentry.mvvm_basics.data.FakeQuoteDAO

class QuoteViewModelFactory(private val quoteDAO: FakeQuoteDAO) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quoteDAO) as T
    }
}