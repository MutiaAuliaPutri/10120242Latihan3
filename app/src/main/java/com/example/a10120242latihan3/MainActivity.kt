package com.example.a10120242latihan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnMain: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMain = findViewById(R.id.btn_home)
        btnMain.setOnClickListener {
            val intent = Intent(this, LoginCodeActivity::class.java)
            startActivity(intent)
        }
    }

    fun onClickMyButton(view: View) {}
}