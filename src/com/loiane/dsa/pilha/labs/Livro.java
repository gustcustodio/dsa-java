package com.loiane.dsa.pilha.labs;

public class Livro {
    private String nomeDoLivro;
    private String nomeDoAutor;
    private String isbn;
    private int anoDeLancamento;

    public Livro() {
    }

    public Livro(String nomeDoLivro, String nomeDoAutor, String isbn, int anoDeLancamento) {
        this.nomeDoLivro = nomeDoLivro;
        this.nomeDoAutor = nomeDoAutor;
        this.isbn = isbn;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public String getNomeDoAutor() {
        return nomeDoAutor;
    }

    public void setNomeDoAutor(String nomeDoAutor) {
        this.nomeDoAutor = nomeDoAutor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nomeDoLivro='" + nomeDoLivro + '\'' +
                ", nomeDoAutor='" + nomeDoAutor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", anoDeLancamento=" + anoDeLancamento +
                '}';
    }
}
