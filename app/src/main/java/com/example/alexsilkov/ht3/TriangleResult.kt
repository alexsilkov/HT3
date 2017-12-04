package com.example.alexsilkov.ht3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TriangleResult : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle_result)

        var areaRes: TextView = findViewById(R.id.triangle_area_result)
        var perRes: TextView = findViewById(R.id.triangle_per_result)

        areaRes.text = "Triangle's area = " + intent.getStringExtra(Intent.EXTRA_TEXT)
        perRes.text = "Triangle's perimeter = " + intent.getStringExtra(Intent.EXTRA_SUBJECT)
    }
}
