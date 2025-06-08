package com.loiane.dsa.fila.teste;

import com.loiane.dsa.fila.Fila;

public class Aula21 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.espiar());

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila.espiar());
    }
}
