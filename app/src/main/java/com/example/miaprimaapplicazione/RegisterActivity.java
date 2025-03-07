package com.example.miaprimaapplicazione;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //collegamento con elementi grafici
        EditText nome = findViewById(R.id.NomeInserimento);
        EditText cognome = findViewById(R.id.CognomeInserimento);
        EditText dataNascita = findViewById(R.id.DataNascitaInserimento);
        EditText username = findViewById(R.id.UsernameInserimento);
        EditText password = findViewById(R.id.PasswordInserimento);
        EditText email = findViewById(R.id.EmailInserimento);
    }
}