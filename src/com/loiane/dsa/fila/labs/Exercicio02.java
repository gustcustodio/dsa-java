package com.loiane.dsa.fila.labs;

import com.loiane.dsa.fila.Fila;
import com.loiane.dsa.fila.FilaComPrioridade;

public class Exercicio02 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        FilaComPrioridade<Integer> filaComPrioridade = new FilaComPrioridade<>();

        final int MAX_PRIORIDADE = 3;

        fila.enfileira(1);
        //fila.enfileira(2);
        //fila.enfileira(3);
        //fila.enfileira(10);
        //fila.enfileira(11);
        //fila.enfileira(12);

        filaComPrioridade.enfileira(4);
        filaComPrioridade.enfileira(5);
        filaComPrioridade.enfileira(6);
        filaComPrioridade.enfileira(7);
        filaComPrioridade.enfileira(8);
        filaComPrioridade.enfileira(9);

        while (!filaComPrioridade.estaVazia()) {
            int count = 0;
            while (!filaComPrioridade.estaVazia() && count < MAX_PRIORIDADE) {
                System.out.println("Senha COM prioridade: " + filaComPrioridade.desenfileirar());
                count++;
            }

            if (!fila.estaVazia()) {
                System.out.println("Senha SEM prioridade: " + fila.desenfileirar());
            }
        }

        while (!fila.estaVazia()) {
            System.out.println("Senha SEM prioridade: " + fila.desenfileirar());
        }
    }
}
