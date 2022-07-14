package com.example.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Allkategori(View view) {
        Intent intent = new Intent(MainActivity.this, AllKategori.class);
        startActivity(intent);
    }

    public void nasrem(View view) {
        Intent intent = new Intent(MainActivity.this, nasram.class);
        startActivity(intent);
    }

    public void nastimb(View view) {
        Intent intent = new Intent(MainActivity.this, nastim.class);
        startActivity(intent);
    }

    public void thkrispi(View view) {
        Intent intent = new Intent(MainActivity.this, thkrispi.class);
        startActivity(intent);
    }

    public void tmpcaisim(View view) {
        Intent intent = new Intent(MainActivity.this, tmpcaisim.class);
        startActivity(intent);
    }

    public void aympindang(View view) {
        Intent intent = new Intent(MainActivity.this, aympindang.class);
        startActivity(intent);
    }

    public void aymcola(View view) {
        Intent intent = new Intent(MainActivity.this, aymcola.class);
        startActivity(intent);
    }

    public void tmposeng(View view) {
        Intent intent = new Intent(MainActivity.this, tmposeng.class);
        startActivity(intent);
    }

    public void thmercon(View view) {
        Intent intent = new Intent(MainActivity.this, thmercon.class);
        startActivity(intent);
    }

    public void ktgsayur(View view) {
        Intent intent = new Intent(MainActivity.this, ResepSayur.class);
        startActivity(intent);
    }

    public void ktgayam(View view) {
        Intent intent = new Intent(MainActivity.this, ResepAyam.class);
        startActivity(intent);
    }

    public void ktgtahu(View view) {
        Intent intent = new Intent(MainActivity.this, ResepTahu.class);
        startActivity(intent);
    }

    public void ktgtempe(View view) {
        Intent intent = new Intent(MainActivity.this, ResepTempe.class);
        startActivity(intent);
    }
}