package com.loiane.dsa.pilha.labs;

import com.loiane.dsa.pilha.Pilha;

public class Exercicio05 {
    public static void main(String[] args) {
        imprimeResultado("ADA");

        imprimeResultado("ABCD");

        imprimeResultado("ABCCBA");

        imprimeResultado("Maria");

        imprimeResultado("saias");
    }

    public static void imprimeResultado(String palavra) {
        System.out.println(palavra + " é palíndromo? " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra) {
        Pilha<Character> pilha = new Pilha<>();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }

        StringBuilder palavraInversa = new StringBuilder();
        while (!pilha.estaVazia()) {
            palavraInversa.append(pilha.desempilha());
        }

        return palavraInversa.toString().equalsIgnoreCase(palavra);
    }
}
