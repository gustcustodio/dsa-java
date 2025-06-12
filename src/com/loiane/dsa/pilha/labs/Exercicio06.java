package com.loiane.dsa.pilha.labs;

import com.loiane.dsa.pilha.Pilha;

public class Exercicio06 {
    public static void main(String[] args) {
        imprimeResultado("((A+B)");
        imprimeResultado("A+B(");
        imprimeResultado(")A+B(-C");
        imprimeResultado("(A+B))-(C+D");
        imprimeResultado("((A+B)+D)");
        imprimeResultado("{[()]}[](){()}");
        imprimeResultado("{[(]}[](){()}");
        imprimeResultado("A + B + C - D)");
    }

    public static void imprimeResultado(String expressao) {
        System.out.println("A condição " + expressao + " é válida? " + testeExpressao(expressao));
    }

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static boolean testeExpressao(String expressao) {
        Pilha<Character> pilha = new Pilha<>();
        int index = 0;
        char simbolo, topo;

        while (index < expressao.length()) {
            simbolo = expressao.charAt(index);

            if (ABRE.indexOf(simbolo) > -1) {
                pilha.empilha(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {
                if (pilha.estaVazia()) {
                    return false;
                } else {
                    topo = pilha.desempilha();
                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }
            }

            index++;
        }

        return pilha.estaVazia();
    }
}
