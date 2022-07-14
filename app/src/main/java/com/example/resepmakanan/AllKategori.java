package com.example.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AllKategori extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_kategori);
    }

    public void ResepNasi(View view) {
        Intent intent = new Intent(AllKategori.this, ResepNasi.class);
        startActivity(intent);
    }

    public void DagingSapi(View view) {
    }

    public void DagingAyam(View view) {
        Intent intent = new Intent(AllKategori.this, ResepAyam.class);
        startActivity(intent);
    }

    public void Seafood(View view) {
    }

    public void Sayur(View view) {
        Intent intent = new Intent(AllKategori.this, ResepSayur.class);
        startActivity(intent);
    }

    public void Tahu(View view) {
        Intent intent = new Intent(AllKategori.this, ResepTahu.class);
        startActivity(intent);
    }

    public void Tempe(View view) {
        Intent intent = new Intent(AllKategori.this, ResepTempe.class);
        startActivity(intent);
    }
}