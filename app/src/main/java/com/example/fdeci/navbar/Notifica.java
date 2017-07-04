package com.example.fdeci.navbar;

/**
 * Created by fdeci on 17/06/2017.
 */

public class Notifica {


    private String nome;
    private String descrizione;
    private String categoria;
    private int img;

    public Notifica(String nome, String descrizione, String categoria, int img) {
        this.nome = nome;
        this.descrizione=descrizione;
        this.categoria=categoria;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getImg() {
        return img;
    }
}
