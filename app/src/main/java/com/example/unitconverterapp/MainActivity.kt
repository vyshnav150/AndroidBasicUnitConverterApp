package com.example.unitconverterapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edt : EditText = findViewById(R.id.kilo_edt)
        val btn : Button = findViewById(R.id.btn)
        val resultText : TextView = findViewById(R.id.result_text)
        btn.setOnClickListener(){
            val kilos:  Double = edt.text.toString().toDouble()
            resultText.setText(""+ convertToPounds(kilos))
        }
    }
}



fun convertToPounds(kilos: Double):Double {
    var pounds = kilos * 2.20462
    return pounds

}
