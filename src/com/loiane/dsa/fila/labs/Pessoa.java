package com.loiane.dsa.fila.labs;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private Integer prioridade;

    public Pessoa(String nome, Integer prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Pessoa o) {
        if (prioridade > o.prioridade) {
            return 1;
        } else if (prioridade < o.prioridade) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }
}
