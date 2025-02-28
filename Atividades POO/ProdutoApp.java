import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoApp {

    public static void main(String[] args) {
        // Criação do scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Lista para armazenar os produtos
        ArrayList<Produto> produtos = new ArrayList<>();

        // Perguntar quantos produtos o usuário deseja cadastrar
        System.out.print("Quantos produtos você deseja cadastrar? ");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner após ler o inteiro

        // Loop para cadastrar os produtos
        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println("\nCadastro do Produto " + (i + 1));

            System.out.print("Informe o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Informe o preço do produto: ");
            double preco = scanner.nextDouble();

            System.out.print("Informe a quantidade do produto: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner após ler o inteiro

            // Criando o produto e adicionando na lista
            Produto produto = new Produto(nome, preco, quantidade);
            produtos.add(produto);
        }

        // Exibir a lista de produtos cadastrados
        System.out.println("\nLista de produtos cadastrados:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        // Fechar o scanner
        scanner.close();
    }
}
