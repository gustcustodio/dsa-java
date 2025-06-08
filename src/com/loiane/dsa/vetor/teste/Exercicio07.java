package com.loiane.dsa.vetor.teste;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio07 extends Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Contato> lista = new ArrayList<>(20);

        criarContatosDinamicamente(5, lista);

        int opcao = 1;

        while (opcao != 0) {
            opcao = obterOpcaoMenu(sc);

            switch (opcao) {
                case 1:
                    adicionarContatoNoFinal(sc, lista);
                    break;
                case 2:
                    adicionarContatoEmPosicao(sc, lista);
                    break;
                case 3:
                    obtemContatoPosicao(sc, lista);
                    break;
                case 4:
                    obtemContato(sc, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(sc, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(sc, lista);
                    break;
                case 7:
                    excluirPorPosicao(sc, lista);
                    break;
                case 8:
                    excluirContato(sc, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimirLista(lista);
                    break;
                default:
                    break;
            }
        }

        System.out.println("\nSaindo do programa...");
    }

    private static void adicionarContatoNoFinal(Scanner sc, ArrayList<Contato> lista) {
        String nome = leInformaccao("\nDigite o nome do contato: ", sc);
        String telefone = leInformaccao("Digite o telefone do contato: ", sc);
        String email = leInformaccao("Digite o email do contato: ", sc);

        Contato contato = new Contato(nome, telefone, email);
        lista.add(contato);

        System.out.println("\nContato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoEmPosicao(Scanner sc, ArrayList<Contato> lista) {
        String nome = leInformaccao("\nDigite o nome do contato: ", sc);
        String telefone = leInformaccao("Digite o telefone do contato: ", sc);
        String email = leInformaccao("Digite o email do contato: ", sc);

        Contato contato = new Contato(nome, telefone, email);

        int pos = leInformacaoInt("Entre com a posição que deseja adicionar o contato: ", sc);

        try {
            lista.add(pos, contato);

            System.out.println("\nContato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContatoPosicao(Scanner sc, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("\nEntre com a posição a ser pesquisada: ", sc);

        try {
            Contato contato = lista.get(pos);
            System.out.println("\nContato encontrado: ");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(Scanner sc, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("\nEntre com a posição a ser pesquisada: ", sc);

        try {
            Contato contato = lista.get(pos);

            System.out.println("\nContato existe, seguem dados:");
            System.out.println(contato);

            System.out.println("\nFazendo pesquisa do contato encontrado:");
            pos = lista.indexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner sc, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("\nEntre com a posição a ser pesquisada: ", sc);

        try {
            Contato contato = lista.get(pos);

            System.out.println("\nContato existe, seguem dados:");
            System.out.println(contato);

            System.out.println("\nFazendo pesquisa do último índice do contato encontrado:");
            pos = lista.lastIndexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner sc, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("\nEntre com a posição a ser pesquisada: ", sc);

        try {
            Contato contato = lista.get(pos);

            boolean existe = lista.contains(contato);

            if (existe) {
                System.out.println("Contato existe, seguem dados:");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe!");
            }
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPorPosicao(Scanner sc, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("\nEntre com a posição a ser removida: ", sc);

        try {
            lista.remove(pos);

            System.out.println("Contato excluído!");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirContato(Scanner sc, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("\nEntre com a posição a ser removida: ", sc);

        try {
            Contato contato = lista.get(pos);

            lista.remove(contato);

            System.out.println("Contato excluído!");
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {
        System.out.println("\nTamanho do vetor é de: " + lista.size());
    }

    private static void limparVetor(ArrayList<Contato> lista) {
        lista.clear();

        System.out.println("\nTodos os contatos da lista foram excluídos!");
    }

    private static void imprimirLista(ArrayList<Contato> lista) {
        System.out.println(lista);
    }

    private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {

        Contato contato;

        for (int i = 1; i <= quantidade; i++) {

            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("1111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.add(contato);
        }
    }
}
