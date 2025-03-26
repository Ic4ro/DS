import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);

        int opcao;
        
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar um novo livro");
            System.out.println("2 - Listar todos os livros");
            System.out.println("3 - Alterar informações de um livro");
            System.out.println("4 - Remover um livro");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título do livro:");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o autor do livro:");
                    String autor = scanner.nextLine();
                    System.out.println("Digite o ano de publicação:");
                    int anoPublicacao = scanner.nextInt();
                    System.out.println("Digite o preço do livro:");
                    double preco = scanner.nextDouble();
                    scanner.nextLine(); 

                    Livro livro = new Livro(titulo, autor, anoPublicacao, preco);
                    livros.add(livro);
                    System.out.println("Livro adicionado com sucesso!\n");
                    break;

                case 2:
                    if (livros.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.\n");
                    } else {
                        System.out.println("Livros cadastrados:");
                        for (Livro l : livros) {
                            l.exibirInformacoes();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite o título do livro que deseja alterar:");
                    String tituloAlterar = scanner.nextLine();
                    boolean encontrado = false;

                    for (Livro l : livros) {
                        if (l.getTitulo().equalsIgnoreCase(tituloAlterar)) {
                            encontrado = true;
                            System.out.println("Digite o novo título:");
                            l.setTitulo(scanner.nextLine());
                            System.out.println("Digite o novo autor:");
                            l.setAutor(scanner.nextLine());
                            System.out.println("Digite o novo ano de publicação:");
                            l.setAnoPublicacao(scanner.nextInt());
                            System.out.println("Digite o novo preço:");
                            l.setPreco(scanner.nextDouble());
                            scanner.nextLine();
                            System.out.println("Informações do livro alteradas com sucesso!\n");
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Livro não encontrado.\n");
                    }
                    break;

                case 4:
                    System.out.println("Digite o título do livro que deseja remover:");
                    String tituloRemover = scanner.nextLine();
                    encontrado = false;

                    for (Livro l : livros) {
                        if (l.getTitulo().equalsIgnoreCase(tituloRemover)) {
                            livros.remove(l);
                            encontrado = true;
                            System.out.println("Livro removido com sucesso!\n");
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Livro não encontrado.\n");
                    }
                    break;

                case 5:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
