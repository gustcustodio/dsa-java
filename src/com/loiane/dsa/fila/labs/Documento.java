package com.loiane.dsa.fila.labs;

public class Documento {
    private String nome;
    private Integer numDeFolhas;

    public Documento(String nome, Integer numDeFolhas) {
        this.nome = nome;
        this.numDeFolhas = numDeFolhas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumDeFolhas() {
        return numDeFolhas;
    }

    public void setNumDeFolhas(Integer numDeFolhas) {
        this.numDeFolhas = numDeFolhas;
    }
}
