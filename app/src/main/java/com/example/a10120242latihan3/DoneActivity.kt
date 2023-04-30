package com.example.a10120242latihan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.util.Log
import android.widget.TextView

class DoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_done)
        val Input = intent.getStringExtra("editText")
        val tampil = "Beres! Sekarang kamu \nudah bisa ngecek\npenggunaan HP mu\ntiap hari buat bantu kamu\nngatur waktu :)"
        Log.d("debug", tampil)
        val searchText = "kamu"
        val containsSearchText = tampil.contains(searchText)
        val replacedText = tampil.replace(searchText, Input.toString(), false)
        val validasi = findViewById<TextView>(R.id.textView8)
        validasi.text = replacedText
    }
}