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
        val button2 = findViewById<Button>(R.id.button2)




        button?.setOnClickListener {

            val string = editTextText.text.toString()

            var result: String = ""





            if(string == "morning"){
                result = "Eggs"
            } else if(string == "mid-morning") {
                result = "Fruit"
            } else if(string == "afternoon") {
                result = "Sandwich"
            } else if(string == "mid-afternoon") {
                result = "Cake"
            } else if(string == "dinner") {
                result = "Pasta"
            } else {
                result = "Please enter a valid time."
            }

            textView.text = result


        }


        button2?.setOnClickListener {

            textView.text = "Enter time to see suggestion"

        }
    }
}