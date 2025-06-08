package com.loiane.dsa.fila;

import com.loiane.dsa.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {
    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento) {
        super.adiciona(elemento);
    }

    public T desenfileirar() {
        if (this.estaVazia()) {
            return null;
        }

        T aux = this.elementos[0];

        super.remove(0);

        return aux;
    }

    public T espiar() {
        if (this.estaVazia()) {
            return null;
        }

        return this.elementos[0];
    }
}
