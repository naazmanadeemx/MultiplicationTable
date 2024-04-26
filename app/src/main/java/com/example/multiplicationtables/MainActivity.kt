package com.example.multiplicationtables

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val tableNumberEditText = findViewById<EditText>(R.id.tableNumberEditText)
        multiplyButton.setOnClickListener {
            // create the explicit intent
            val intent = Intent(this, MultiplicationTableTwo::class.java)
            //add the table number to the intent
            intent.putExtra("tableNumber",
                            tableNumberEditText.text.toString())
            //start the activity
            startActivity(intent)
        }

    }
}