package com.example.monstersawiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class boo extends AppCompatActivity {

    TextView NameBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boo);

        // esconde barra superior
        getSupportActionBar().hide();

        // Declara o elemento pelo ID
        NameBack = findViewById(R.id.txtNameBack);

        // recebe a informação da intent anterior
        Intent intentDisplay = getIntent();
        String messageDisplay = intentDisplay.getStringExtra(menuID.EXTRA_MESSAGE);

        // define texto da TextView
        NameBack.setText(messageDisplay);

    }
}