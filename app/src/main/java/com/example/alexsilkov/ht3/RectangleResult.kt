package com.example.alexsilkov.ht3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RectangleResult : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle_result)


        var areaRes: TextView = findViewById(R.id.rec_area_result)
        var perRes: TextView = findViewById(R.id.rec_per_result)

        areaRes.text = "Rectangle's area = " + intent.getStringExtra(Intent.EXTRA_TEXT)
        perRes.text = "Rectangle's perimeter = " + intent.getStringExtra(Intent.EXTRA_SUBJECT)
    }
}
