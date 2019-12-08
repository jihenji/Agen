package com.example.jihenedorsaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resultat extends AppCompatActivity implements View.OnClickListener {
    Button Reserver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);
        Reserver = findViewById(R.id.Reserver);
        Reserver.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Reserver:
                startActivity(new Intent(this, Retour.class));
                break;
        }
    }}
