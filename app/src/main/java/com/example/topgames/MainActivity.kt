package com.example.topgames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // definindo recycler
        val recyclerView: RecyclerView = findViewById(R.id.recylcerView)
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        // Data source
        val arrayList: ArrayList<TopGamesData> = ArrayList()
        arrayList.add(TopGamesData(R.drawable.card1, "Horizon Chase"))
        arrayList.add(TopGamesData(R.drawable.card2, "PUBG Mobile"))
        arrayList.add(TopGamesData(R.drawable.card3, "Head Boll"))
        arrayList.add(TopGamesData(R.drawable.card4, "Hooked on You"))
        arrayList.add(TopGamesData(R.drawable.card5, "FIFA 22 Mobile"))
        arrayList.add(TopGamesData(R.drawable.card6, "Fortnite Mobile"))

        // criando adapter
        val adapter = MyAdapter(arrayList)
        recyclerView.adapter = adapter
    }
}