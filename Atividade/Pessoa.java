package Atividade;
import java.io.*;
import java.util.Scanner;

public class Pessoa {

    private static final String NOME_ARQUIVO = "pessoas.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar pessoa");
            System.out.println("2. Listar pessoas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir nova linha

            switch (opcao) {
                case 1:
                    cadastrarPessoa(sc);
                    break;
                case 2:
                    listarPessoas();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 3);

        sc.close();
    }

    private static void cadastrarPessoa(Scanner sc) {
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        String idade = sc.nextLine();

        try (BufferedWriter escrito = new BufferedWriter(new FileWriter(NOME_ARQUIVO, true))) {
            escrito.write(nome + "," + idade);
            escrito.newLine();
            System.out.println("Cadastro salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o cadastro: " + e.getMessage());
        }
    }

    private static void listarPessoas() {
        System.out.println("\nLista de Pessoas:");
        System.out.println("----------------------------");
        System.out.printf("%-20s | %s\n", "Nome", "Idade");
        System.out.println("----------------------------");

        try (BufferedReader leitor = new BufferedReader(new FileReader(NOME_ARQUIVO))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 2) {
                    System.out.printf("%-20s | %s\n", dados[0], dados[1]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado. Nenhum cadastro feito ainda.");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
