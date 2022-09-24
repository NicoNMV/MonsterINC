package com.example.monstersawiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class menuID extends AppCompatActivity {

    // Define chave
    public final static String EXTRA_MESSAGE = ".MESSAGE";

    // Declara elementos
    EditText edit1;
    RadioButton s, b, m;
    Button create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_id);

        // Esconde barra superior
        getSupportActionBar().hide();

        // Elementos pelo ID
        edit1 = findViewById(R.id.txtName);
        s = findViewById(R.id.sulley);
        b = findViewById(R.id.boo);
        m = findViewById(R.id.mike);
        create = findViewById(R.id.btnCreate);

    }

    // Botão Criar
    public void createID(View view) {
        // condições sobre qual activity abrir
        if (s.isChecked() == true && b.isChecked() == false && m.isChecked() == false) {

            // Intent para a outra activity
            Intent intent = new Intent(this, sulley.class);

            // Define a mensagem que será enviada até a outra activity
            String message = edit1.getText().toString();

            intent.putExtra(EXTRA_MESSAGE, message);

            // inicia próxima intent
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

    // Intents para as outras activities
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