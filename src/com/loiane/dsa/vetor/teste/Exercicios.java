package com.loiane.dsa.vetor.teste;

import com.loiane.dsa.vetor.Lista;

public class Exercicios {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista<>(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("A");
        vetor.adiciona("E");
        vetor.adiciona("D");
        vetor.adiciona("A");
        vetor.adiciona("F");

        // * exercício 01 - implementação do método contem * //
        // System.out.println(vetor.contem("A"));
        // System.out.println(vetor.contem("E"));

        // * exercício 02 - implementação do método ultimoIndice * //
        // System.out.println(vetor);
        // System.out.println(vetor.getTamanho());
        // System.out.println(vetor.ultimoIndice("D"));

    }
}
