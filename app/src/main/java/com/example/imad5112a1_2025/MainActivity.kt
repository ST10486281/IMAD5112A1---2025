package com.example.imad5112a1_2025

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get references to UI elements in the layout
        val textView = findViewById<TextView>(R.id.textView)
        val editTextText = findViewById<EditText>(R.id.editTextText)
        val button = findViewById<Button>(R.id.button)       // Button to generate suggestion
        val button2 = findViewById<Button>(R.id.button2)     // Button to reset message

        // Set what happens when the "suggestion" button is clicked
        button?.setOnClickListener {
            val string = editTextText.text.toString()  // Get user input from EditText
            Log.d("Input", string)

            var result: String = ""                    // Initialize result string

            // Determine suggestion based on input time
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
                result = "Please enter a valid option."  // Default message for invalid input
            }

            Log.d("Result", result)

            textView.text = result  // Show the result in the TextView
        }

        // Set what happens when the "reset" button is clicked
        button2?.setOnClickListener {
            textView.text = "Enter time to see suggestion"  // Reset TextView message
            Log.d("Text reset to default message", "")
        }
    }
}
