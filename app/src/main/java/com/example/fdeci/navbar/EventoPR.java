package com.example.fdeci.navbar;

/**
 * Created by fdeci on 17/06/2017.
 */

public class EventoPR {


    private String nomePR;
    private String nomeEvento;

    public EventoPR(String nomePR, String nomeEvento) {
        this.nomePR = nomePR;
        this.nomeEvento=nomeEvento;
    }

    public String getNomePR() {
        return nomePR;
    }

    public void setNomePR(String nome) {
        this.nomePR = nomePR;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }


}
