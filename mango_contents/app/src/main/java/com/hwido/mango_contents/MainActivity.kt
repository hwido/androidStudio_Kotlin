package com.hwido.mango_contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bookmarkButton = findViewById<TextView>(R.id.bookmarkBtn)
        bookmarkButton.setOnClickListener {
            val intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }

        items.add(
            ContentsModel(
                "url1",
                "ImageUrl1",
                "뉴욕택시디저트"
            )
        )

        items.add(
            ContentsModel(
                "url2",
                "ImageUrl2",
                "동경산책"
            )
        )

        items.add(
            ContentsModel(
                "url3",
                "ImageUrl3",
                "피자보이시나"
            )
        )

        items.add(
            ContentsModel(
                "url4",
                "ImageUrl4",
                "경원치킨"
            )
        )

        items.add(
            ContentsModel(
                "url5",
                "ImageUrl5",
                "titleText5"
            )
        )

        items.add(
            ContentsModel(
                "url6",
                "ImageUrl6",
                "titleText6"
            )
        )

        items.add(
            ContentsModel(
                "url7",
                "ImageUrl7",
                "titleText7"
            )
        )

        items.add(
            ContentsModel(
                "url8",
                "ImageUrl8",
                "titleText8"
            )
        )

        val recyclerview = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)
        recyclerview.adapter = rvAdapter

        rvAdapter.itemClick = object : RVAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {
                val intent = Intent(baseContext, ViewActivity::class.java)
                intent.putExtra("url", items[position].url)
                intent.putExtra("title", items[position].titleText)
                intent.putExtra("imageUrl", items[position].ImageUrl)
                startActivity(intent)
            }

        }

        recyclerview.layoutManager = GridLayoutManager(this, 2)
    }
}