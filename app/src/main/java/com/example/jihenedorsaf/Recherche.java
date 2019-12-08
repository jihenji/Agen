package com.example.jihenedorsaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;

public class Recherche extends AppCompatActivity implements View.OnClickListener {
    Spinner Ville, Agence, Model;
    SeekBar prix;
    Button Rechercher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recherche);
        Ville = findViewById(R.id.spinner1);
        Agence = findViewById(R.id.spinner);
        Model = findViewById(R.id.spinner2);
        prix = findViewById(R.id.seekBar);
        Rechercher = findViewById(R.id.Rechercher);
        Rechercher.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Rechercher:
                startActivity(new Intent(this, Resultat.class));
                break;
        }
    }
}
