package com.example.monstersawiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class mike extends AppCompatActivity {
    TextView NameBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mike);

        // Esconde barra superior
        getSupportActionBar().hide();

        // Declara o elemento pelo ID
        NameBack = findViewById(R.id.txtNameBack);

        // Recebe a informação da intent anterior
        Intent intentDisplay = getIntent();
        String messageDisplay = intentDisplay.getStringExtra(menuID.EXTRA_MESSAGE);

        // Define o texto da TextView
        NameBack.setText(messageDisplay);

    }
}