import java.util.ArrayList;
import java.util.Scanner;

public class FuncionarioApp {

    public static void main(String[] args) {
        // Criação do scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Lista para armazenar os funcionários
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        // Perguntar quantos funcionários o usuário deseja cadastrar
        System.out.print("Quantos funcionários você deseja cadastrar? ");
        int quantidadeFuncionarios = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner após ler o inteiro

        // Loop para cadastrar os funcionários
        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.println("\nCadastro do Funcionário " + (i + 1));

            System.out.print("Informe o nome do funcionário: ");
            String nome = scanner.nextLine();

            System.out.print("Informe o cargo do funcionário: ");
            String cargo = scanner.nextLine();

            System.out.print("Informe o salário do funcionário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer do scanner após ler o valor do salário

            // Criando o objeto Funcionario e adicionando à lista
            Funcionario funcionario = new Funcionario(nome, cargo, salario);
            funcionarios.add(funcionario);
        }

        // Exibir a lista de funcionários cadastrados
        System.out.println("\nLista de Funcionários Cadastrados:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);  // Chama o toString() automaticamente
        }

        // Fechar o scanner
        scanner.close();
    }
}
