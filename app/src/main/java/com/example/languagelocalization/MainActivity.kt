package com.example.languagelocalization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var greetingTextView: TextView
    var name = "Sara"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetingTextView = findViewById(R.id.textView)
    }

    fun buttonPress(view: View) {
        greetingTextView.text = getString(R.string.great, name)
    }

}


//Anpassa appen till svenska och engelska
//1. anpassa xml - layout
//2. anpassa kotlin-fil
//3. anpassa bilder