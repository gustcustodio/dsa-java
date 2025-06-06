package com.loiane.dsa.vetor.teste;

import com.loiane.dsa.vetor.Lista;

public class Exercicios {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista<>(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("B");
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

        // * exercício 03 - implementação do método remove * //
        // System.out.println(vetor);
        // System.out.println(vetor.remove("B"));
        // System.out.println(vetor);
        // System.out.println(vetor.remove("B"));
        // System.out.println(vetor);
        // System.out.println(vetor.remove("B"));

        // * exercício 04 - implementação do método obtem * //
        // System.out.println(vetor);
        // System.out.println(vetor.obtem(0));
        // System.out.println(vetor.obtem(4));
        // System.out.println(vetor.obtem(6));
        // System.out.println(vetor.obtem(8));
        // System.out.println(vetor.obtem(10));
    }
}
