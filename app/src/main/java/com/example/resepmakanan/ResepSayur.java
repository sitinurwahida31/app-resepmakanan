package com.example.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ResepSayur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_sayur);
    }

    public void syrasam(View view) {
        Intent intent = new Intent(ResepSayur.this, syrasam.class);
        startActivity(intent);
    }

    public void syrbobor(View view) {
        Intent intent = new Intent(ResepSayur.this, syrbobor.class);
        startActivity(intent);
    }

    public void syrcapcay(View view) {
        Intent intent = new Intent(ResepSayur.this, syrcapcay.class);
        startActivity(intent);
    }

    public void syrlabu(View view) {
        Intent intent = new Intent(ResepSayur.this, syrlabu.class);
        startActivity(intent);
    }

    public void syrtoge(View view) {
        Intent intent = new Intent(ResepSayur.this, syrtoge.class);
        startActivity(intent);
    }
}