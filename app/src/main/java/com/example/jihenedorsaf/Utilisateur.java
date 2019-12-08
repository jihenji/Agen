package com.example.jihenedorsaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Utilisateur extends AppCompatActivity implements View.OnClickListener {
    Button MesReservation;
    Button Rechercher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utilisateur);

        MesReservation = findViewById(R.id.Reservation);
        Rechercher =  findViewById(R.id.Rechercher);

        MesReservation.setOnClickListener(this);
        Rechercher.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Reservation:
                startActivity(new Intent(this, Resultat.class));
                break;
            case R.id.Rechercher:
                startActivity(new Intent(this, Recherche.class));
                break;

        }
    }
}
