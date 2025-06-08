package com.loiane.dsa.vetor.teste;

import com.loiane.dsa.vetor.Lista;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lista<Contato> lista = new Lista<>(20);

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

    private static void adicionarContatoNoFinal(Scanner sc, Lista<Contato> lista) {
        String nome = leInformaccao("\nDigite o nome do contato: ", sc);
        String telefone = leInformaccao("Digite o telefone do contato: ", sc);
        String email = leInformaccao("Digite o email do contato: ", sc);

        Contato contato = new Contato(nome, telefone, email);
        lista.adiciona(contato);

        System.out.println("\nContato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoEmPosicao(Scanner sc, Lista<Contato> lista) {
        String nome = leInformaccao("\nDigite o nome do contato: ", sc);
        String telefone = leInformaccao("Digite o telefone do contato: ", sc);
        String email = leInformaccao("Digite o email do contato: ", sc);

        Contato contato = new Contato(nome, telefone, email);

        int pos = leInformacaoInt("Entre com a posição que deseja adicionar o contato: ", sc);

        try {
            lista.adiciona(pos, contato);

            System.out.println("\nContato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContatoPosicao(Scanner sc, Lista<Contato> lista) {
        int pos = leInformacaoInt("\nEntre com a posição a ser pesquisada: ", sc);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("\nContato encontrado: ");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(Scanner sc, Lista<Contato> lista) {
        int pos = leInformacaoInt("\nEntre com a posição a ser pesquisada: ", sc);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("\nContato existe, seguem dados:");
            System.out.println(contato);

            System.out.println("\nFazendo pesquisa do contato encontrado:");
            pos = lista.busca(contato);

            System.out.println("Contato encontrado na posição " + pos);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner sc, Lista<Contato> lista) {
        int pos = leInformacaoInt("\nEntre com a posição a ser pesquisada: ", sc);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("\nContato existe, seguem dados:");
            System.out.println(contato);

            System.out.println("\nFazendo pesquisa do último índice do contato encontrado:");
            pos = lista.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição " + pos);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner sc, Lista<Contato> lista) {
        int pos = leInformacaoInt("\nEntre com a posição a ser pesquisada: ", sc);

        try {
            Contato contato = lista.busca(pos);

            boolean existe = lista.contem(contato);

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

    private static void excluirPorPosicao(Scanner sc, Lista<Contato> lista) {
        int pos = leInformacaoInt("\nEntre com a posição a ser removida: ", sc);

        try {
            lista.remove(pos);

            System.out.println("Contato excluído!");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirContato(Scanner sc, Lista<Contato> lista) {
        int pos = leInformacaoInt("\nEntre com a posição a ser removida: ", sc);

        try {
            Contato contato = lista.busca(pos);

            lista.remove(contato);

            System.out.println("Contato excluído!");
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void imprimeTamanhoVetor(Lista<Contato> lista) {
        System.out.println("\nTamanho do vetor é de: " + lista.getTamanho());
    }

    private static void limparVetor(Lista<Contato> lista) {
        lista.limpar();

        System.out.println("\nTodos os contatos da lista foram excluídos!");
    }

    private static void imprimirLista(Lista<Contato> lista) {
        System.out.println(lista);
    }

    protected static String leInformaccao(String msg, Scanner sc) {
        System.out.print(msg);
        String entrada = sc.nextLine();

        return entrada;
    }

    protected static int leInformacaoInt(String msg, Scanner sc) {
        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {
            try {
                System.out.print(msg);
                String entrada = sc.nextLine();
                num = Integer.parseInt(entrada);
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite novamente.");
            }
        }

        return num;
    }

    protected static int obterOpcaoMenu(Scanner sc) {
        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida) {
            System.out.println("\nMenu de opções:");
            System.out.println("1. Adicionar contato no final da lista");
            System.out.println("2. Adicionar contato em uma posição específica");
            System.out.println("3. Obter contato de uma posição específica");
            System.out.println("4. Consultar contato");
            System.out.println("5. Consultar último índice da lista");
            System.out.println("6. Verificar se contato existe");
            System.out.println("7. Excluir por posição");
            System.out.println("8. Excluir contato");
            System.out.println("9. Verificar tamanho da lista");
            System.out.println("10. Excluir todos os contatos da lista");
            System.out.println("11. Imprimir lista");
            System.out.println("0. Sair\n");

            try {
                System.out.print("Digite a opção desejada: ");
                entrada = sc.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite novamente.\n\n");
            }
        }

        return opcao;
    }

    protected static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
        Contato contato;

        for (int i = 1; i <= quantidade; i++) {

            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("1111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.adiciona(contato);
        }
    }
}
