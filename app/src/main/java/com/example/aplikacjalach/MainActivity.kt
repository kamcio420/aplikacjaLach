package com.example.aplikacjalach

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addButton = findViewById<Button>(R.id.button)
        val changeButton = findViewById<Button>(R.id.button2)

        val input = findViewById<TextInputEditText>(R.id.inputText)
        val output = findViewById<TextView>(R.id.textView)

        addButton.setOnClickListener {
            output.text = output.text.toString() + input.text.toString()
        }

        changeButton.setOnClickListener {
            output.text = "Kamil Lach"
        }
    }
}