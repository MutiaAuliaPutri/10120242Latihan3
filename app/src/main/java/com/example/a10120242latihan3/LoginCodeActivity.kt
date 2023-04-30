package com.example.a10120242latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginCodeActivity : AppCompatActivity() {
    private lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_code)
        btnLogin = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener {
            val intent = Intent(this, BiodataActivity::class.java)
            startActivity(intent)
        }

    }
}