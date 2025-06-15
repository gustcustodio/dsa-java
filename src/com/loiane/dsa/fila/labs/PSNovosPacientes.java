package com.loiane.dsa.fila.labs;

import com.loiane.dsa.fila.FilaComPrioridade;

import java.util.Random;

public class PSNovosPacientes implements Runnable {
    private FilaComPrioridade<Pessoa> fila;
    private Integer count = 7;
    private Random prioridade = new Random();

    public PSNovosPacientes(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            try {
                Thread.sleep(8000);
                Pessoa p = new Pessoa("" + count, prioridade.nextInt(3));
                fila.enfileira(p);
                count++;
                System.out.println(p + " chegou ao Pronto Socorro.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
