package com.loiane.dsa.pilha.teste;

import java.util.Stack;

public class Aula18 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Está vazia? " + stack.empty());

        stack.push(1); // empilha()
        stack.push(2); // empilha()
        stack.push(3); // empilha()

        System.out.println("Está vazia? " + stack.empty()); // estaVazia()
        System.out.println("Tamanho: " + stack.size()); // tamanho
        System.out.println("Pilha: " + stack);
        System.out.println("Elemento do topo: " + stack.peek()); // topo()
        System.out.println("Elemento removido do topo: " + stack.pop()); // desempilha()
        System.out.println("Pilha atualizada: " + stack);
    }
}
