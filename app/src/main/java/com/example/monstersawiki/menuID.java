package com.example.monstersawiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class menuID extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = ".MESSAGE";

    EditText edit1;
    RadioButton s, b, m;
    Button create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_id);

        getSupportActionBar().hide();

        edit1 = findViewById(R.id.txtName);
        s = findViewById(R.id.sulley);
        b = findViewById(R.id.boo);
        m = findViewById(R.id.mike);
        create = findViewById(R.id.btnCreate);

    }

    public void createID(View view) {
        if (s.isChecked() == true && b.isChecked() == false && m.isChecked() == false) {
            Intent intent = new Intent(this, sulley.class);

            String message = edit1.getText().toString();

            intent.putExtra(EXTRA_MESSAGE, message);

            startActivity(intent);
        } else if (s.isChecked() == false && b.isChecked() == true && m.isChecked() == false) {
            Intent intent = new Intent(this, boo.class);

            String message = edit1.getText().toString();

            intent.putExtra(EXTRA_MESSAGE, message);

            startActivity(intent);
        } else {
            Intent intent = new Intent(this, mike.class);

            String message = edit1.getText().toString();

            intent.putExtra(EXTRA_MESSAGE, message);

            startActivity(intent);

        }
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