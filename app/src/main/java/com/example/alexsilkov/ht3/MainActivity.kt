package com.example.alexsilkov.ht3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intentForCircle = Intent(applicationContext, EnteringCircle::class.java)
        val intentForRectangle = Intent(applicationContext,EnteringRectangle::class.java)
        val intentForTriangle = Intent(applicationContext,EnteringTriangle::class.java)
        val figure = arrayOf("Not selected", "Circle", "Rectangle", "Triangle")
        var spFigure: Spinner = findViewById(R.id.spinner_for_figures)
        spFigure.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, figure)

        spFigure.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(applicationContext, "Please, select a figure", Toast.LENGTH_SHORT).show()
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (position == 0) {
                    Toast.makeText(applicationContext,"Please, select a figure",Toast.LENGTH_SHORT).show()
                }
                else if (position == 1) {
                    startActivity(intentForCircle)
                }
                else if (position ==2){
                    startActivity(intentForRectangle)
                }
                else if (position ==3){
                    startActivity(intentForTriangle)
                }
            }
        }
    }
}
