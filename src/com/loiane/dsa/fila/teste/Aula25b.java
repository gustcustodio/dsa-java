package com.loiane.dsa.fila.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25b {
    public static void main(String[] args) {
        // * exemplo com classe anônima * //
        Queue<Paciente> filaComPrioridade = new PriorityQueue<>(
                new Comparator<Paciente>() {
                    @Override
                    public int compare(Paciente p1, Paciente p2) {
                        return Integer.compare(p1.getPrioridade(), p2.getPrioridade());
                    }
                }
        );

        filaComPrioridade.add(new Paciente("A", 2));
        filaComPrioridade.add(new Paciente("B", 1));

        System.out.println(filaComPrioridade);
    }
}
