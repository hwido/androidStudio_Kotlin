package com.hwido.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.hwido.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var listFragment = FirstFragment.newInstance("Fragment", "2022")

        val fManager = supportFragmentManager
//        val transaction = fManager.beginTransaction()
//        transaction.add(binding.fragFrame.id, listFragment)
//        transaction.commit()

        fManager.commit {
            add(binding.fragFrame.id, listFragment)
        }
    }
}