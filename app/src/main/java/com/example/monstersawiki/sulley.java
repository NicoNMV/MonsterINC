package com.example.monstersawiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class sulley extends AppCompatActivity {

    // Declara elemento
    TextView NameBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sulley);

        // esconde barra superior
        getSupportActionBar().hide();

        // elemento pelo ID
        NameBack = findViewById(R.id.txtNameBack);

        // recupera informação da intent anterior
        Intent intentDisplay = getIntent();
        String messageDisplay = intentDisplay.getStringExtra(menuID.EXTRA_MESSAGE);

        // define texto da TextView
        NameBack.setText(messageDisplay);

    }
}