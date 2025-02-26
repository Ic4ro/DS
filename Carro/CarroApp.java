package Carro;

import java.util.ArrayList;
import java.util.Scanner;

public class CarroApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> list = new ArrayList<>();

        int op = 0;
        while (op != 4) {
            System.out.println("\n:::::::MENU::::::::");
            System.out.println("1- Cadastrar Carro");
            System.out.println("2- Listar Carro");
            System.out.println("3- Remover Carro");
            System.out.println("4- Sair");
            System.out.println("Escolha a opção: ");
            op = sc.nextInt();
            sc.nextLine();  // Limpeza do buffer

            switch (op) {
                case 1:
                    // Cadastrar Camisa
                    System.out.println("Digite a Marca: ");
                    String marca = sc.nextLine();

                    System.out.println("Digite o Modelo: ");
                    String modelo = sc.nextLine();

                    System.out.println("Digite o Ano de Fabricação: ");
                    String anoDeFabricacao = sc.nextLine();

                    list.add(new Carro(marca, modelo, anoDeFabricacao));
                    System.out.println("Camisa Registrado com Sucesso.");
                    break;

                case 2:
                    // Listar Camisa
                    if (list.isEmpty()) {
                        System.out.println("Lista Vazia.");
                    } else {
                        for (Carro p : list) {
                            System.out.println("Marca: " + p.getMarca() + "\n" + "Modelo: " +p.getModelo() +"\n" + "Ano de Publicação: " +p.getAnoDeFabricacao());
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
                            System.out.println("Carro Removida com Sucesso!");
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

