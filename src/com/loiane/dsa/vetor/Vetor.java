package com.loiane.dsa.vetor;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // * método adiciona - não escala bem * //
    /*
    public void adiciona(String elemento) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == null) {
                elementos[i] = elemento;
                break;
            }
        }
    }
    */
    // * melhoria no método adiciona - opção 1 * //
    /*
    public void adiciona(String elemento) throws Exception {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new
                    Exception("Vetor já está cheio, não é possível adicionar mais elementos.");
        }
    }
    */

    // * melhoria no método adiciona - opção 2 * //
    public boolean adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            sb.append(this.elementos[i]);
            sb.append(", ");
        }

        if (this.tamanho > 0) {
            sb.append(this.elementos[this.tamanho - 1]);
        }

        sb.append("]");

        return sb.toString();
    }
}
