package com.loiane.dsa.vetor.teste;

import com.loiane.dsa.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");

        System.out.println(vetor);
        System.out.println(vetor.getTamanho());

        vetor.remove(0);

        System.out.println(vetor);
        System.out.println(vetor.getTamanho());
    }
}
