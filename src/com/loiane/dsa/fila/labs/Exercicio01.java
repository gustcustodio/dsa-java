package com.loiane.dsa.fila.labs;

import com.loiane.dsa.fila.Fila;

public class Exercicio01 {
    public static void main(String[] args) {
        Fila<Documento> filaImpressora = new Fila<>();

        filaImpressora.enfileira(new Documento("A", 2));
        filaImpressora.enfileira(new Documento("B", 4));
        filaImpressora.enfileira(new Documento("C", 6));
        filaImpressora.enfileira(new Documento("D", 8));
        filaImpressora.enfileira(new Documento("E", 10));

        while (!filaImpressora.estaVazia()) {
            Documento doc = filaImpressora.desenfileirar();
            System.out.println("Imprimindo documento " + doc.getNome());
            try {
                Thread.sleep(200L * doc.getNumDeFolhas());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Todos os documentos foram impressos!");
    }
}

