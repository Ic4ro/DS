import java.util.Scanner;

public class AlunoApp {

    public static void main(String[] args) {
        // Criação do scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar o nome do aluno
        System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();

        // Criar um objeto aluno com o nome informado
        Aluno aluno = new Aluno(nome);

        // Perguntar quantas notas o usuário deseja inserir
        System.out.print("Quantas notas deseja cadastrar? ");
        int quantidadeNotas = scanner.nextInt();

        // Loop para cadastrar as notas
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            aluno.adicionarNota(nota); // Adicionando a nota ao aluno
        }

        // Exibir o nome do aluno e sua média final
        System.out.println("\n" + aluno);

        // Fechar o scanner
        scanner.close();
    }
}
