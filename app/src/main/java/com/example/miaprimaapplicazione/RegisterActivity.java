package com.example.miaprimaapplicazione;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //collegamento con elementi grafici
        EditText nome = findViewById(R.id.NomeInserimento);
        EditText cognome = findViewById(R.id.CognomeInserimento);
        EditText dataNascita = findViewById(R.id.DataNascitaInserimento);
        EditText username = findViewById(R.id.UsernameInserimento);
        EditText password = findViewById(R.id.PasswordInserimento);
        EditText email = findViewById(R.id.EmailInserimento);
        Button register = findViewById(R.id.button3);

        //Listener per il pulsante Register
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utente utente = new Utente(nome.getText().toString(), cognome.getText().toString(), dataNascita.getText().toString(), username.getText().toString(), password.getText().toString(), email.getText().toString());

                //Conversione dell'oggetto utente in formato JSON
                Gson gson = new Gson();
                String utenteJson = gson.toJson(utente);
                Log.d("utenteJson", utenteJson);

                //Invio dell'oggetto utente tramite Intent
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                intent.putExtra("utente", utenteJson);
                startActivity(intent);

                //Uso del log
                Log.d("Registrazione", "Nome: " + nome.getText().toString() + " Cognome: " + cognome.getText().toString() + " DataNascita: " + dataNascita.getText().toString() + " Username: " + username.getText().toString() + " Password: " + password.getText().toString() + " Email: " + email.getText().toString());

                //Uso del Toast, messaggio di registrazione avvenuta con successo
                Toast.makeText(RegisterActivity.this, "Registrazione avvenuta con successo!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}