package com.example.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Nasgor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasgor);
    }

    public void imgback(View view) {
        Intent intent = new Intent(Nasgor.this, ResepNasi.class);
        startActivity(intent);
    }
}