package com.example.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tmpkeju extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmpkeju);
    }

    public void imgback(View view) {
        Intent intent = new Intent(tmpkeju.this, ResepSayur.class);
        startActivity(intent);
    }
}