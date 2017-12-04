package com.example.alexsilkov.ht3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CircleResult : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle_result)

        var areaRes:TextView = findViewById(R.id.circle_area_result)
        var perRes:TextView = findViewById(R.id.circle_per_result)

        areaRes.text = "Circle's area = " + intent.getStringExtra(Intent.EXTRA_TEXT)
        perRes.text = "Circumfernce = " + intent.getStringExtra(Intent.EXTRA_SUBJECT)
    }
}
