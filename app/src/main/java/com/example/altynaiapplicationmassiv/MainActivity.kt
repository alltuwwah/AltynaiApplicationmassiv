package com.example.altynaiapplicationmassiv

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.altynaiapplicationmassiv.Constants.Companion.notes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var button: ImageButton
       lateinit var recyclerView: RecyclerView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.addBtn)
        recyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(notes)
        button.setOnClickListener {
            val intent = Intent(this, AddActivity2::class.java)
            startActivity(intent)
        }

        }
    }
