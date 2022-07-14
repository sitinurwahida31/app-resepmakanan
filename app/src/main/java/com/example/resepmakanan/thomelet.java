package com.example.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class thomelet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thomelet);
    }

    public void imgback(View view) {
        Intent intent = new Intent(thomelet.this, ResepTahu.class);
        startActivity(intent);
    }
}