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
        final int POS = 0;

        if (this.estaVazia()) {
            return null;
        }

        T aux = this.elementos[POS];

        super.remove(POS);

        return aux;
    }

    public T espiar() {
        if (this.estaVazia()) {
            return null;
        }

        return this.elementos[0];
    }
}
