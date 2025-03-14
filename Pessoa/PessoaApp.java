package Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoaApp {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> list = new ArrayList<>();

        int op = 0;
        while (op != 4) {
            System.out.println("\n:::::::MENU::::::::");
            System.out.println("1- Cadastrar");
            System.out.println("2- Listar");
            System.out.println("3- Remover");
            System.out.println("4- Sair");
            System.out.println("Escolha a opção: ");
            op = sc.nextInt();
            sc.nextLine();  // Limpeza do buffer

            switch (op) {
                case 1:
                    // Cadastrar
                    System.out.println("Digite o Nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o Telefone: ");
                    String telefone = sc.nextLine();

                    list.add(new Pessoa(nome, telefone));
                    System.out.println("Cadastro Registrado com Sucesso.");
                    break;

                case 2:
                    // Listar
                    if (list.isEmpty()) {
                        System.out.println("Lista Vazia.");
                    } else {
                        for (Pessoa p : list) {
                            System.out.println("Nome: " + p.getNome() + "\n" + "Telefone: " + p.getTelefone());
                        }
                    }
                    break;

                case 3:
                    // Remover
                    if (list.isEmpty()) {
                        System.out.println("Lista Vazia.");
                    } else {
                        System.out.println("Digite o índice a ser Removido: ");
                        int indice = sc.nextInt();
                        sc.nextLine();  // Limpeza do buffer

                        if (indice >= 0 && indice < list.size()) {
                            list.remove(indice);
                            System.out.println("Contato Removido com Sucesso!");
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
