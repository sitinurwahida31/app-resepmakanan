package com.example.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ResepAyam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_ayam);
    }

    public void aympindang(View view) {
        Intent intent = new Intent(ResepAyam.this, aympindang.class);
        startActivity(intent);
    }

    public void aymkretep(View view) {
        Intent intent = new Intent(ResepAyam.this, aymkretep.class);
        startActivity(intent);
    }

    public void aymkrseng(View view) {
        Intent intent = new Intent(ResepAyam.this, aymkreseng.class);
        startActivity(intent);
    }

    public void aymgoreng(View view) {
        Intent intent = new Intent(ResepAyam.this, aymgoreng.class);
        startActivity(intent);
    }

    public void aymcola(View view) {
        Intent intent = new Intent(ResepAyam.this, aymkretep.class);
        startActivity(intent);
    }
}