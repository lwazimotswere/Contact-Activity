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

        println("Hi my name is, $firstName, $lastName, I live in $address")

        // The current year
        val currentYear = 2026

        // Changing year of birth to integer
        val birthYear = yearOfBirth.toInt()

        // Calculate age
        val age = currentYear - birthYear

        // Years until age 100
        val yearsTo100 = 100 - age

        // Age in months
        val ageMonths = age * 12

        // Age in days (skip leap years)
        val ageDays = age * 365

        //Remainer when age divided by 5
        val remainder = age % 5

        println("Current age: $age")
        println("Years until 100: $yearsTo100")
        println("Age in months: $ageMonths")
        println("Age in days: $ageDays")
        println("Remainder when age divided by 5: $remainder")

        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}


