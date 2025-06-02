package com.loiane.dsa.vetor.teste;

import com.loiane.dsa.vetor.Vetor;

public class Aula07 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");

        System.out.println(vetor);

        vetor.adiciona(3, "D");
        System.out.println(vetor);

        vetor.adiciona(0, "A");
        System.out.println(vetor);
    }
}
