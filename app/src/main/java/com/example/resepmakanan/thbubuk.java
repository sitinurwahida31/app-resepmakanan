package com.example.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class thbubuk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thbubuk);
    }
    public void imgback(View view) {
        Intent intent = new Intent(thbubuk.this, ResepTahu.class);
        startActivity(intent);
    }
}