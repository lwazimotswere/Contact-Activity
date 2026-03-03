package com.example.mycontact

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val firstName = "Lwazi"
        val lastName = "Motswere"
        val address = "8 Ice Cream Road, Rondebosch"
        val isMale = "Yes"
        val dayOfBirth = "19"
        val monthOfBirth = "July"
        val yearOfBirth = "2005"

        printIn ("Hi my name is", firstName, lastName, "I live in", address)

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



    }

    private fun printIn(
        string: String,
        firstName: String,
        lastName: String,
        string4: String,
        address: String
    ) {
    }
}