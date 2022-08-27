package com.example.hackeruapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("HackerU", "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getName(name: String): String {
        var name = name
        return name
    }

    fun onButtonClick(view: View) {
        val textView: TextView = findViewById(R.id.hello_text)
        val editTextCon = getEditText()
        textView.text = "Hello ${editTextCon}!"
    }


    fun getEditText(): String {
        val editText: EditText = findViewById(R.id.edit_text_to_button)
        return editText.text.toString()
    }

}