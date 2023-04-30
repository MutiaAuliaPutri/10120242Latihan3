package com.example.a10120242latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class BiodataActivity : AppCompatActivity() {
    private lateinit var btnBiodata: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)
        btnBiodata = findViewById(R.id.btn_biodata)
        btnBiodata.setOnClickListener {
            val intent = Intent(this, DoneActivity::class.java)

            val Input = findViewById<EditText>(R.id.editText).text.toString()
            intent.putExtra("editText", Input)
            startActivity(intent)
        }
    }
}