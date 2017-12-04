package com.example.alexsilkov.ht3

import Modal.Circle
import Modal.Figure
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class EnteringCircle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entering_circle)


        var editRadius:EditText = findViewById(R.id.edittext_Circle)
        val btnCircle:Button = findViewById(R.id.button_Circle)
        var newCircle:Figure = Circle()
        var areaText:String
        var perText:String

        btnCircle.setOnClickListener(View.OnClickListener {
            if (editRadius.getText().toString().equals("")) {
                Toast.makeText(applicationContext, "Please, enter your parameters", Toast.LENGTH_SHORT).show()
        }
            else {
                newCircle.a = editRadius.text.toString().toDouble()
                newCircle.countArea()
                newCircle.countPer()
                areaText = newCircle.area.toString()
                perText = newCircle.perimeter.toString()
                var newintent = Intent(applicationContext,CircleResult::class.java)
                newintent.putExtra(Intent.EXTRA_TEXT,areaText)
                newintent.putExtra(Intent.EXTRA_SUBJECT,perText)
                startActivity(newintent)
            }
    })
  }
}
