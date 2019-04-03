package com.android.easyentry.mvvm_basics.ui.quotes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.android.easyentry.mvvm_basics.R
import com.android.easyentry.mvvm_basics.data.Quote
import com.android.easyentry.mvvm_basics.utils.InjectorUtils
import kotlinx.android.synthetic.main.activity_quotes.*

class QuotesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)
        initializeUI()
    }

    fun initializeUI() {
        val factory = InjectorUtils.provideQuoteViewModelViewFactory()
        val quotesViewModel =
            ViewModelProviders.of(this, factory)
                .get(QuotesViewModel::class.java)

        quotesViewModel.getQuotes()
            .observe(this, Observer { quotes ->
                val stringBuilder = StringBuilder()
                quotes.forEach({
                    stringBuilder.append("$it\n\n")
                })

                all_quotes.text = stringBuilder.toString()
            })

        submit_quote.setOnClickListener {
            quotesViewModel.addQuote(Quote(quote_input.text.toString(), quote_author.text.toString()))
            quote_input.setText("")
            quote_author.setText("")
        }
    }
}
