package com.example.miaprimaapplicazione;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utente utente = new Utente(nome.getText().toString(), cognome.getText().toString(), dataNascita.getText().toString(), username.getText().toString(), password.getText().toString(), email.getText().toString());
                //Uso del log
                Log.d("Registrazione", "Nome: " + nome.getText().toString() + " Cognome: " + cognome.getText().toString() + " DataNascita: " + dataNascita.getText().toString() + " Username: " + username.getText().toString() + " Password: " + password.getText().toString() + " Email: " + email.getText().toString());

                //Uso del Toast, messaggio di registrazione avvenuta con successo
                Toast.makeText(RegisterActivity.this, "Registrazione avvenuta con successo!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}