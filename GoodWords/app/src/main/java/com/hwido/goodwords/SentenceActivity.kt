package com.hwido.goodwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("A1.")
        sentenceList.add("A2.")
        sentenceList.add("A3.")
        sentenceList.add("A4.")
        sentenceList.add("A5.")
        sentenceList.add("A6.")
        sentenceList.add("A7.")
        sentenceList.add("A8.")

        val sentenceAdapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceAdapter
    }
}