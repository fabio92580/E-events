package com.example.fdeci.navbar;

/**
 * Created by fdeci on 17/06/2017.
 */

public class Evento {


    private String nome;
    private String descrizione;

    public Evento(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione=descrizione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }


}
