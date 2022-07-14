package com.example.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class syrcapcay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syrcapcay);
    }
    public void imgback(View view) {
        Intent intent = new Intent(syrcapcay.this, ResepSayur.class);
        startActivity(intent);
    }
}