package com.example.altynaiapplicationmassiv

import android.os.Bundle
import android.os.ParcelFileDescriptor
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EditActivity : AppCompatActivity() {
    lateinit var nameText: EditText
    lateinit var descriptorText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
        nameText = findViewById(R.id.nameApp)
        descriptorText = findViewById(R.id.descriptionUp)
        val itemName = intent.getStringExtra("itemName")
        val description = intent.getStringExtra("itenDescription")
        nameText.setText(itemName.toString())
        nameText.setText(itemName.toString())

        }
    }
