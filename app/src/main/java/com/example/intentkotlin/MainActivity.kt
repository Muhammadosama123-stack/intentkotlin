package com.example.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun changeActivity(view: View){
        val intent = Intent(applicationContext,MainActivity2::class.java)

        intent.putExtra("input", editText.text.toString())
        startActivity(intent)
    }
}