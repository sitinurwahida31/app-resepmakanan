package com.example.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ResepTahu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_tahu);
    }

    public void thbubuk(View view) {
        Intent intent = new Intent(ResepTahu.this, thbubuk.class);
        startActivity(intent);
    }

    public void thkrispi(View view) {
        Intent intent = new Intent(ResepTahu.this, thkrispi.class);
        startActivity(intent);
    }

    public void thmercon(View view) {
        Intent intent = new Intent(ResepTahu.this, thmercon.class);
        startActivity(intent);
    }

    public void thomelet(View view) {
        Intent intent = new Intent(ResepTahu.this, thomelet.class);
        startActivity(intent);
    }

    public void thtiram(View view) {
        Intent intent = new Intent(ResepTahu.this, thtiram.class);
        startActivity(intent);
    }
}