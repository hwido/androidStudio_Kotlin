package com.hwido.backbuttonex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var isDouble = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() { // 뒤로가기
        Log.d("MainActivity", "backButton")

        if (isDouble == true) {
            finish()
        }

        isDouble = true
        Toast.makeText(this, "종료하려면 더블클릭", Toast.LENGTH_SHORT).show()

        Handler().postDelayed(Runnable {
            isDouble = false
        }, 2000) // 2초 후 종료
    }

}