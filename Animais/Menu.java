// Menu.java
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Animal> animais;
    private Scanner scanner;

    public Menu() {
        this.animais = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    // Exibe o menu e processa a escolha do usuário
    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar novo animal");
            System.out.println("2 - Fazer um animal emitir som");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha do nextInt

            switch (opcao) {
                case 1:
                    adicionarNovoAnimal();
                    break;
                case 2:
                    fazerAnimalEmitirSom();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);
    }

    // Adiciona um novo animal
    private void adicionarNovoAnimal() {
        System.out.print("Digite o tipo do animal (Cachorro ou Gato): ");
        String tipo = scanner.nextLine();

        System.out.print("Digite o nome do animal: ");
        String nome = scanner.nextLine();

        if (tipo.equalsIgnoreCase("Cachorro")) {
            animais.add(new Cachorro(nome));
            System.out.println("Cachorro adicionado!");
        } else if (tipo.equalsIgnoreCase("Gato")) {
            animais.add(new Gato(nome));
            System.out.println("Gato adicionado!");
        } else {
            System.out.println("Tipo de animal não reconhecido.");
        }
    }

    // Faz um animal emitir som
    private void fazerAnimalEmitirSom() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }

        System.out.println("\nAnimais cadastrados:");
        for (int i = 0; i < animais.size(); i++) {
            System.out.println((i + 1) + ". " + animais.get(i).nome);
        }

        System.out.print("Escolha um animal para ouvir o som: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        if (escolha > 0 && escolha <= animais.size()) {
            animais.get(escolha - 1).fazerSom();
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
