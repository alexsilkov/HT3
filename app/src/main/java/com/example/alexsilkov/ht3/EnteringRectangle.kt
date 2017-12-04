package com.example.alexsilkov.ht3

import Modal.Circle
import Modal.Figure
import Modal.Rectangle
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class EnteringRectangle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entering_rectangle)

        var editA: EditText = findViewById(R.id.edittext_Rectangle_Height)
        var editB: EditText = findViewById(R.id.edittext_Rectangle_Width)
        val btnRect: Button = findViewById(R.id.button_Rectangle)
        var newRec: Figure = Rectangle()
        var areaText:String
        var perText:String

        btnRect.setOnClickListener(View.OnClickListener {
            if (editA.getText().toString().equals("")||(editB.getText().toString().equals(""))) {
                Toast.makeText(applicationContext, "Please, enter your parameters", Toast.LENGTH_SHORT).show()
            }
            else {
                newRec.a = editA.text.toString().toDouble()
                newRec.b = editB.text.toString().toDouble()
                newRec.countArea()
                newRec.countPer()
                areaText = newRec.area.toString()
                perText = newRec.perimeter.toString()
                var newintent = Intent(applicationContext,RectangleResult::class.java)
                newintent.putExtra(Intent.EXTRA_TEXT,areaText)
                newintent.putExtra(Intent.EXTRA_SUBJECT,perText)
                startActivity(newintent)
            }
        })
    }
}
