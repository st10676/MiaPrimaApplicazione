package com.example.miaprimaapplicazione;

public class Utente {
    private String nome;
    private String cognome;
    private String dataNascita;
    private String username;
    private String password;
    private String email;

    //Costruttore
    Utente(String nome, String cognome, String dataNascita, String username, String password, String email){
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public String getDataNascita(){
        return dataNascita;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getEmail(){
        return email;
    }
}
