package com.example.jihenedorsaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Retour extends AppCompatActivity implements View.OnClickListener {
    Button Retour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retour);
        Retour = findViewById(R.id.Retour);
        Retour.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Retour:
                startActivity(new Intent(this, Utilisateur.class));
                break;
        }
    }
}
