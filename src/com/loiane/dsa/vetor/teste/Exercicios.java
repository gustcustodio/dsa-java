package com.loiane.dsa.vetor.teste;

import com.loiane.dsa.vetor.Lista;

public class Exercicios {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista<>(5);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");

        // * exercício 01 - implementação do método contém * //
        System.out.println(vetor.contem("A"));
        System.out.println(vetor.contem("E"));

    }
}
