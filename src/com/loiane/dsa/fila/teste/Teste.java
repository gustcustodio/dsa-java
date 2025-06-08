package com.loiane.dsa.fila.teste;

import com.loiane.dsa.fila.Fila;

public class Teste {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.estaVazia());

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());

        System.out.println(fila);
        System.out.println(fila.espiar());
        System.out.println(fila.desenfileirar());
        System.out.println(fila);
        System.out.println(fila.desenfileirar());
        System.out.println(fila);
    }
}
