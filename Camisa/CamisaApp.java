package Camisa;

import java.util.ArrayList;
import java.util.Scanner;

public class CamisaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Camisa> list = new ArrayList<>();

        int op = 0;
        while (op != 4) {
            System.out.println("\n:::::::MENU::::::::");
            System.out.println("1- Cadastrar Camisa");
            System.out.println("2- Listar Camisa");
            System.out.println("3- Remover Camisa");
            System.out.println("4- Sair");
            System.out.println("Escolha a opção: ");
            op = sc.nextInt();
            sc.nextLine();  // Limpeza do buffer

            switch (op) {
                case 1:
                    // Cadastrar Camisa
                    System.out.println("Digite a Cor: ");
                    String cor = sc.nextLine();

                    System.out.println("Digite o Tamanho: ");
                    String tamanho = sc.nextLine();

                    System.out.println("Digite o tipo: ");
                    String tipo = sc.nextLine();

                    list.add(new Camisa(cor, tamanho, tipo));
                    System.out.println("Camisa Registrado com Sucesso.");
                    break;

                case 2:
                    // Listar Camisa
                    if (list.isEmpty()) {
                        System.out.println("Lista Vazia.");
                    } else {
                        for (Camisa p : list) {
                            System.out.println("Cor: " + p.getCor() + "\n" + "Tamanho: " +p.getTamanho() +"\n" + "Tipo: " +p.getTipo());
                        }
                    }
                    break;

                case 3:
                    // Remover Camisa
                    if (list.isEmpty()) {
                        System.out.println("Lista Vazia.");
                    } else {
                        System.out.println("Digite o índice a ser Removido: ");
                        int indice = sc.nextInt();
                        sc.nextLine();  // Limpeza do buffer

                        if (indice >= 0 && indice < list.size()) {
                            list.remove(indice);
                            System.out.println("Camisa Removida com Sucesso!");
                        } else {
                            System.out.println("Índice Inválido! Tente novamente.");
                        }
                    }
                    break;

                case 4:
                    // Sair
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        sc.close();
    }
}

