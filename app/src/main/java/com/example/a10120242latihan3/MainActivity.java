package com.example.a10120242latihan3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import butterknife.ButterKnife;
import butterknife.OnClick;
import static com.example.a10120242latihan3.DoneActivity.ID_EXTRA_MSG_EXIT;

import java.net.DatagramSocket;

public class MainActivity extends AppCompatActivity{

    private DatagramSocket ButterKnife;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        if (getIntent().getBooleanExtra(ID_EXTRA_MSG_EXIT, false)) {
            finish();
        }
    }
    @OnClick(R.id.btnWalkthroughStart)
    void mulai() {
        Intent intent = new Intent(this, LoginCodeActivity.class);
        startActivity(intent);
    }
}

//10120242
//Mutia
//IF-6
//Tanggal Pengerjaan : 27-04-2023

