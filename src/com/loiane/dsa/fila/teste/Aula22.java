package com.loiane.dsa.fila.teste;

import com.loiane.dsa.fila.Fila;

public class Aula22 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila);

        System.out.println(fila.desenfileirar());

        System.out.println(fila);

        System.out.println(fila.desenfileirar());

        System.out.println(fila);

        System.out.println(fila.desenfileirar());

        System.out.println(fila);
    }
}
