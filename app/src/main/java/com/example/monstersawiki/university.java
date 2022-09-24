package com.example.monstersawiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class university extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);

        // esconde barra superior
        getSupportActionBar().hide();

    }
    public void openLocalUniversity(View view){
        // abre intent implicita de pesquisa de localização
        Uri location= Uri.parse("geo:0,0?q=Sather+Gate");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent );
    }


    // intents que abrem outras activities
    public void openID(View view){
        Intent intent = new Intent(this, menuID.class);
        startActivity(intent);
    }
    public void openCharacter(View view){
        Intent intent = new Intent(this, character.class);
        startActivity(intent);
    }
    public void openStory(View view){
        Intent intent = new Intent(this, story.class);
        startActivity(intent);
    }
    public void openDoor(View view){
        Intent intent = new Intent(this, door.class);
        startActivity(intent);
    }
    public void openUniversity(View view){
        Intent intent = new Intent(this, university.class);
        startActivity(intent);
    }
    public void openHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}