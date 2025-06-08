package com.loiane.dsa.pilha;

import com.loiane.dsa.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }
}
