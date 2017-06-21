package com.example.fdeci.navbar;

/**
 * Created by fdeci on 17/06/2017.
 */

public class PropostaEvento {


    private String nome;
    private String proposta;

    public PropostaEvento(String nome, String proposta) {
        this.nome = nome;
        this.proposta=proposta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProposta() {
        return proposta;
    }

    public void setProposta(String proposta) {
        this.proposta = proposta;
    }


}
