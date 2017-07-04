package com.example.fdeci.navbar;

/**
 * Created by fdeci on 17/06/2017.
 */

public class EventoFabio {


    private String nome;
    private String descrizione;
    private int img;

    public EventoFabio(String nome, String descrizione, int img) {
        this.nome = nome;
        this.descrizione=descrizione;
        this.img=img;
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





    public int getImg() {
        return img;
    }
}
