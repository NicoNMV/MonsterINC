package com.example.monstersawiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class quiz extends AppCompatActivity {

    RadioButton yes1, yes2, yes3, no1, no2, no3;
    Button find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        getSupportActionBar().hide();

        yes1 = findViewById(R.id.btnYes1);
        yes2 = findViewById(R.id.btnYes2);
        yes3 = findViewById(R.id.btnYes3);
        no1 = findViewById(R.id.btnNo1);
        no2 = findViewById(R.id.btnNo2);
        no3 = findViewById(R.id.btnNo3);
        find = findViewById(R.id.btnFind);
    }

    public void answerQuiz(View view){
        if(yes1.isChecked() == true && yes2.isChecked() == true && yes3.isChecked() == true){
            Uri uri = Uri.parse("https://pixar.fandom.com/pt/wiki/Henry_J._Waternoose");
            Intent it = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        }
        else if(no1.isChecked() == true && no2.isChecked() == true && no3.isChecked() == true){
            Uri uri = Uri.parse("https://disney.fandom.com/wiki/Randall_Boggs");
            Intent it = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        }
        else if(yes1.isChecked() == true && no2.isChecked() == true && no3.isChecked() == true){
            Uri uri = Uri.parse("https://pixar.fandom.com/wiki/James_P._Sullivan");
            Intent it = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        }
        else if(yes1.isChecked() == true && yes2.isChecked() == true && no3.isChecked() == true){
            Uri uri = Uri.parse("https://disney.fandom.com/pt-br/wiki/Roz");
            Intent it = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        }
        else if(no1.isChecked() == true && yes2.isChecked() == true && yes3.isChecked() == true){
            Uri uri = Uri.parse("https://pixar.fandom.com/pt/wiki/Yeti");
            Intent it = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        }
        else if(no1.isChecked() == true && no2.isChecked() == true && yes3.isChecked() == true){
            Uri uri = Uri.parse("https://disney.fandom.com/wiki/George_Sanderson");
            Intent it = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        }
        else if(yes1.isChecked() == true && no2.isChecked() == true && yes3.isChecked() == true){
            Uri uri = Uri.parse("https://disney.fandom.com/wiki/Thaddeus_Bile");
            Intent it = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        }
        else{
            Uri uri = Uri.parse("https://pixar.fandom.com/wiki/Claws_Ward");
            Intent it = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        }
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