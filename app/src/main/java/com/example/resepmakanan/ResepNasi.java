package com.example.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ResepNasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_nasi);
    }

    public void Nasgor(View view) {
    }

    public void nasgor(View view) {
        Intent intent = new Intent(ResepNasi.this, Nasgor.class);
        startActivity(intent);
    }

    public void naspec(View view) {
        Intent intent = new Intent(ResepNasi.this, naspec.class);
        startActivity(intent);
    }

    public void nasrem(View view) {
        Intent intent = new Intent(ResepNasi.this, nasram.class);
        startActivity(intent);
    }

    public void nascam(View view) {
        Intent intent = new Intent(ResepNasi.this, nascam.class);
        startActivity(intent);
    }

    public void nastimb(View view) {
        Intent intent = new Intent(ResepNasi.this, nastim.class);
        startActivity(intent);
    }
}