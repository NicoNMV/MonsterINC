package com.example.monstersawiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class character extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        getSupportActionBar().hide();
    }
    public void openCena1(View view){
        Uri uri = Uri.parse("https://youtu.be/wV_FMbJ2e6w");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
    }
    public void openCena2(View view){
        Uri uri = Uri.parse("https://youtu.be/uBFhZThWq98");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
    }
    public void openCena3(View view){
        Uri uri = Uri.parse("https://youtu.be/qe72QwfbzTo");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
    }

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
