package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var helloTextView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloTextView = findViewById(R.id.helloTxtView) as TextView
        helloTextView!!.text = "Hello World";

        helloTextView!!.setOnClickListener({
            Toast.makeText(applicationContext, "Welcome to Kotlin!", Toast.LENGTH_LONG).show();
        })
    }
}