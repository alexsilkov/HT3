package com.example.alexsilkov.ht3

import Modal.Circle
import Modal.Figure
import Modal.Triangle
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class EnteringTriangle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entering_triangle)


        var editA: EditText = findViewById(R.id.edittext_Triangle1)
        var editB: EditText = findViewById(R.id.edittext_Triangle2)
        var editC: EditText = findViewById(R.id.edittext_Triangle3)
        val btnTriangle: Button = findViewById(R.id.button_Triangle)
        var newTriangle: Figure = Triangle()
        var areaText:String
        var perText:String

        btnTriangle.setOnClickListener(View.OnClickListener {
            if ((editA.getText().toString().equals("")) || (editB.getText().toString().equals("")) ||((editC.getText().toString().equals("")))) {
                Toast.makeText(applicationContext, "Please, enter your parameters", Toast.LENGTH_SHORT).show()
            }
            else {
                newTriangle.a = editA.text.toString().toDouble()
                newTriangle.b = editB.text.toString().toDouble()
                newTriangle.c = editC.text.toString().toDouble()
                if ((newTriangle.a + newTriangle.b <= newTriangle.c) || (newTriangle.b+newTriangle.c <= newTriangle.a)
                        || (newTriangle.c + newTriangle.a <= newTriangle.b)) {
                    Toast.makeText(applicationContext,"Wrong parameters!",Toast.LENGTH_SHORT).show()
                }
                else {
                    newTriangle.countArea()
                    newTriangle.countPer()
                    areaText = newTriangle.area.toString()
                    perText = newTriangle.perimeter.toString()
                    var newintent = Intent(applicationContext, TriangleResult::class.java)
                    newintent.putExtra(Intent.EXTRA_TEXT, areaText)
                    newintent.putExtra(Intent.EXTRA_SUBJECT, perText)
                    startActivity(newintent)
                }
            }
        })
    }
}
