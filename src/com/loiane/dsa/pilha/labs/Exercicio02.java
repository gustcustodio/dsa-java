package com.loiane.dsa.pilha.labs;

import com.loiane.dsa.pilha.Pilha;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha<Integer> pilhaPar = new Pilha<>();
        Pilha<Integer> pilhaImpar = new Pilha<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int num = sc.nextInt();

            if (num == 0) {

                Integer desempilhado = pilhaPar.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha par está vazia");
                } else {
                    System.out.println("Desempilhando da pilha par: " + desempilhado + ".");
                }

                desempilhado = pilhaImpar.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha ímpar está vazia");
                } else {
                    System.out.println("Desempilhando na pilha ímpar: " + desempilhado + ".");
                }

            } else if (num % 2 == 0) {
                System.out.println("Empilhando o número " + num + " na pilha de pares.");
                pilhaPar.empilha(num);
            } else {
                System.out.println("Empilhando o número " + num + " na pilha de ímpares.");
                pilhaImpar.empilha(num);
            }
        }

        System.out.println();

        while (!pilhaPar.estaVazia()) {
            System.out.println("Desempilhando da pilha par: " + pilhaPar.desempilha() + ".");
        }

        while (!pilhaImpar.estaVazia()) {
            System.out.println("Desempilhando da pilha ímpar: " + pilhaImpar.desempilha() + ".");
        }

        System.out.println("\nAs pilhas estão vazias.");
    }
}
