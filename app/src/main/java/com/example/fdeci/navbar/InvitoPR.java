package com.example.fdeci.navbar;

/**
 * Created by fdeci on 17/06/2017.
 */

public class InvitoPR {


    private String nomePR;
    private String nomeEvento;
    private String messaggio;
    private int img;

    public InvitoPR(String nomePR, String nomeEvento, String messaggio, int img) {
        this.nomePR = nomePR;
        this.nomeEvento=nomeEvento;
        this.messaggio=messaggio;
        this.img=img;
    }

    public String getNomePR() {
        return nomePR;
    }

    public void setNomePR(String nomePR) {
        this.nomePR = nomePR;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento (String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }


    public int getImg() {
        return img;
    }
}
