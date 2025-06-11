package com.loiane.dsa.pilha.labs;

import java.util.LinkedList;
import java.util.Queue;

public class Exercicio04 {
    public static void main(String[] args) {
        Queue<Livro> livros = new LinkedList<>();

        livros.add(
                new Livro(
                        "Introduction to Algorithms",
                        "Thomas H. Cormen",
                        "9780262046305",
                        2022
                ));

        livros.add(
                new Livro(
                        "Algorithms",
                        "Robert Sedgewick",
                        "9780321573513",
                        2011
                ));

        livros.add(
                new Livro(
                        "Data Structures and Algorithm Analysis in Java",
                        "Mark Allen Weiss",
                        "9780132576277",
                        2011
                )
        );

        livros.add(
                new Livro(
                        "The Algorithm Design Manual",
                        "Steven S. Skiena",
                        "9783030542559",
                        2020
                )
        );

        livros.add(
                new Livro(
                        "Grokking Algorithms",
                        "Aditya Bhargava",
                        "9781617292231",
                        2016
                )
        );

        livros.add(
                new Livro(
                        "Data Structures and Algorithms Made Easy",
                        "Narasimha Karumanchi",
                        "9788193245279",
                        2016
                )
        );

        System.out.println("A pilha de livros está vazia? " + livros.isEmpty());
        System.out.println("Qual é o tamanho da pilha? " + livros.size());
        System.out.println("Qual é o livro que está no topo da pilha? "
                + livros.peek().getNomeDoLivro());
        System.out.println("Retirando um livro da pilha... " + livros.poll().getNomeDoLivro());
        System.out.println(livros);
    }
}
