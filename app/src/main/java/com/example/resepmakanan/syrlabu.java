package com.example.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class syrlabu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syrlabu);
    }
    public void imgback(View view) {
        Intent intent = new Intent(syrlabu.this, ResepSayur.class);
        startActivity(intent);
    }
}