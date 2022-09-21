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

        getSupportActionBar().hide();

        NameBack = findViewById(R.id.txtNameBack);

        Intent intentDisplay = getIntent();
        String messageDisplay = intentDisplay.getStringExtra(menuID.EXTRA_MESSAGE);

        NameBack.setText(messageDisplay);

    }
}