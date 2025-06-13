package com.loiane.dsa.pilha.labs;

import java.util.Stack;

public class Exercicio07 {
    public static void main(String[] args) {
        imprimeResultado(2);

        imprimeResultado(4);

        imprimeResultado(10);

        imprimeResultado(25);

        imprimeResultado(10035);

        imprimeResultadoQualquerBase(333, 8);

        imprimeResultadoQualquerBase(500, 16);

        imprimeResultadoQualquerBase(2222, 16);
    }

    public static void imprimeResultado(int numero) {
        System.out.println(numero + " em binário é: " + decimalBinario(numero));
    }

    public static void imprimeResultadoQualquerBase(int numero, int base) {
        System.out.println(numero + " na base " + base +
                " é: " + decimalQualquerBase(numero, base));
    }

    public static String decimalBinario(int numero) {
        Stack<Integer> pilha = new Stack<>();
        StringBuilder numBinario = new StringBuilder();
        int resto;

        while (numero > 0) {
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2;
        }

        while (!pilha.isEmpty()) {
            numBinario.append(pilha.pop());
        }

        return numBinario.toString();
    }

    public static String decimalQualquerBase(int numero, int base) {
        Stack<Integer> pilha = new Stack<>();
        StringBuilder numBase = new StringBuilder();
        String bases = "0123456789ABCDEF";
        int resto;

        while (numero > 0) {
            resto = numero % base;
            pilha.push(resto);
            numero /= base;
        }

        while (!pilha.isEmpty()) {
            numBase.append(bases.charAt(pilha.pop()));
        }

        return numBase.toString();
    }
}
