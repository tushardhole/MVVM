package com.android.easyentry.mvvm_basics.data

class FakeDatabase private constructor() {


    var quoteDAO = FakeQuoteDAO()
        private set

    companion object {
        @Volatile
        var INSTANCE: FakeDatabase? = null
            private set

        fun getInstance() {
            synchronized(this) {
                INSTANCE ?: FakeDatabase()
            }
        }
    }
}