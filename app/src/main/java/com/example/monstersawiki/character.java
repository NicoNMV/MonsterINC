package com.example.monstersawiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class character extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        getSupportActionBar().hide();
    }
    public void openID(View view){
        Intent intent = new Intent(this, menuID.class);
        startActivity(intent);
    }
}