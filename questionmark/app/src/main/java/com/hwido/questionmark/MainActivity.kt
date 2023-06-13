package com.hwido.questionmark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ? -> null 일 수 있음
        // ! -> null 이 아님

        val value : String? = "a"
        val value2 : String? = null

        Log.d("MainActivity", value2!!) // error : NullPointerException
    }
}