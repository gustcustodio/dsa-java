package com.loiane.dsa.pilha.labs;

import com.loiane.dsa.pilha.Pilha;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o " + (i + 1) + "º número: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println("Empilhando o número " + num + ".");
                pilha.empilha(num);
            } else if (pilha.estaVazia()) {
                System.out.println("A pilha está vazia.");
            } else {
                int desempilhado = pilha.desempilha();
                System.out.println
                        ("Número ímpar! Desempilhando um elemento da pilha: " + desempilhado + ".");
            }
        }

        System.out.println();

        while (!pilha.estaVazia()) {
            System.out.println("Número " + pilha.desempilha() + " desempilhado.");
        }

        System.out.println("\nTodos os elementos foram desempilhados.");
    }
}

