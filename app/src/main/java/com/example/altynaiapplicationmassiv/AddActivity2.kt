package com.example.altynaiapplicationmassiv

import android.accounts.AuthenticatorDescription
import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.Intents
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.altynaiapplicationmassiv.Constants.Companion.notes
import com.example.altynaiapplicationmassiv.Constants.Companion.counter

class AddActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var back:ImageButton
        lateinit var nameET:EditText
        lateinit var descriptionET:EditText
        lateinit var addBtn:Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add2)
        back = findViewById(R.id.backBtn)
        nameET = findViewById(R.id.name)
        descriptionET = findViewById(R.id.description)
        val flag = false
        addBtn = findViewById(R.id.addDone)
        addBtn.setOnClickListener {
            notes.add(
                Wish(
                    counter,nameET.text.toString(),descriptionET.text.toString(),
                    flag
                )
            )
            counter++
            Log.d("DDDD","Added wish: ${notes}")
        }
        back.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }

        }
    }
