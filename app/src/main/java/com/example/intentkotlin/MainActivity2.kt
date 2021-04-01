package com.example.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent = intent
        val received:String = intent.getStringExtra("input")
        textView2.text= received

    }
    fun goBack(view: View){
        val intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
    }
}