package com.android.easyentry.mvvm_basics.data

data class Quote(val quoteText: String, val quoteAuthor: String) {

    override fun toString(): String {
        return "$quoteText - $quoteAuthor"
    }
}