package com.android.easyentry.mvvm_basics.utils

import com.android.easyentry.mvvm_basics.data.FakeQuoteDAO
import com.android.easyentry.mvvm_basics.ui.quotes.QuoteViewModelFactory

object InjectorUtils {

    fun provideQuoteViewModelViewFactory(): QuoteViewModelFactory {
        return QuoteViewModelFactory(FakeQuoteDAO())
    }
}