package com.example.listview_nizar

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            var listView = findViewById<ListView>(R.id.ListView)
            var list = mutableListOf<Universitas>()

        list.add(Universitas("Universitas Teknologi Bandung", "UTB" + "Bandung", R.drawable.sttb))

        list.add(Universitas("Telkom University", "TEL U" + "Bandung", R.drawable.telkom))

        list.add(Universitas("Universitas Komputer", "UNIKOM" + "Bandung", R.drawable.unikom))

        list.add(Universitas("Universitas Islam Bandung", "UNISBA" + "Bandung", R.drawable.unisba))

        listView.adapter = UnivAdapter( this, R.layout.listuniversitas, list)


    }
    }
