package com.loiane.dsa.pilha.labs;

import com.loiane.dsa.pilha.Pilha;

public class Exercicio03 {
    public static void main(String[] args) {
        Pilha<Livro> livros = new Pilha<>(20);

        livros.empilha(
                new Livro(
                        "Introduction to Algorithms",
                        "Thomas H. Cormen",
                        "9780262046305",
                        2022
                ));

        livros.empilha(
                new Livro(
                        "Algorithms",
                        "Robert Sedgewick",
                        "9780321573513",
                        2011
                ));

        livros.empilha(
                new Livro(
                        "Data Structures and Algorithm Analysis in Java",
                        "Mark Allen Weiss",
                        "9780132576277",
                        2011
                )
        );

        livros.empilha(
                new Livro(
                        "The Algorithm Design Manual",
                        "Steven S. Skiena",
                        "9783030542559",
                        2020
                )
        );

        livros.empilha(
                new Livro(
                        "Grokking Algorithms",
                        "Aditya Bhargava",
                        "9781617292231",
                        2016
                )
        );

        livros.empilha(
                new Livro(
                        "Data Structures and Algorithms Made Easy",
                        "Narasimha Karumanchi",
                        "9788193245279",
                        2016
                )
        );

        System.out.println("A pilha de livros está vazia? " + livros.estaVazia());
        System.out.println("Qual é o tamanho da pilha? " + livros.tamanho());
        System.out.println("Qual é o livro que está no topo da pilha? "
                + livros.topo().getNomeDoLivro());
        System.out.println("Retirando um livro da pilha... " + livros.desempilha().getNomeDoLivro());
        System.out.println(livros);
    }
}
