package com.example.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ResepTempe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_tempe);
    }

    public void tmpcaisim(View view) {
        Intent intent = new Intent(ResepTempe.this, tmpcaisim.class);
        startActivity(intent);
    }

    public void tmposeng(View view) {
        Intent intent = new Intent(ResepTempe.this, tmposeng.class);
        startActivity(intent);
    }

    public void tmpkrispi(View view) {
        Intent intent = new Intent(ResepTempe.this, tmpkripik.class);
        startActivity(intent);
    }

    public void tmpento(View view) {
        Intent intent = new Intent(ResepTempe.this, tmpento.class);
        startActivity(intent);
    }

    public void tmpkeju(View view) {
        Intent intent = new Intent(ResepTempe.this, tmpkeju.class);
        startActivity(intent);
    }
}