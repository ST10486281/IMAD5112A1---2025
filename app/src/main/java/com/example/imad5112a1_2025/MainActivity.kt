package com.example.imad5112a1_2025

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val textView = findViewById<TextView>(R.id.textView)
        val editTextText = findViewById<EditText>(R.id.editTextText)
        val button = findViewById<Button>(R.id.button)




        button?.setOnClickListener {
            var greeting: String = ""


            greeting = "Welcome, ${editTextText.text}"
            textView.text = greeting

        }
    }
}