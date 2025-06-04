package com.loiane.dsa.vetor.teste;

import com.loiane.dsa.vetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetorObjetos = new VetorObjetos(3);

        Contato c1 =
                new Contato("Contato 1", "1234-5678", "contato1@email.com");
        Contato c2 =
                new Contato("Contato 2", "2345-6789", "contato2@email.com");
        Contato c3 =
                new Contato("Contato 3", "3456-7890", "contato3@email.com");

        vetorObjetos.adiciona(c1);
        vetorObjetos.adiciona(c2);
        vetorObjetos.adiciona(c3);

        System.out.println("Tamanho = " + vetorObjetos.getTamanho());
        System.out.println(vetorObjetos);
    }
}
