import java.util.ArrayList;
import java.util.Scanner;

public class TarefaApp {

    public static void main(String[] args) {
        // Criação do scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Lista para armazenar as tarefas
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        // Perguntar quantas tarefas o usuário deseja cadastrar
        System.out.print("Quantas tarefas você deseja cadastrar? ");
        int quantidadeTarefas = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner após ler o inteiro

        // Loop para cadastrar as tarefas
        for (int i = 0; i < quantidadeTarefas; i++) {
            System.out.println("\nCadastro da Tarefa " + (i + 1));

            System.out.print("Informe a descrição da tarefa: ");
            String descricao = scanner.nextLine();

            // Perguntar se a tarefa foi concluída ou não
            System.out.print("A tarefa foi concluída? (sim/não): ");
            String resposta = scanner.nextLine().toLowerCase();
            String status = resposta.equals("sim") ? "Concluído" : "Pendente";

            // Criando o objeto Tarefa e adicionando à lista
            Tarefa tarefa = new Tarefa(descricao, status);
            tarefas.add(tarefa);
        }

        // Exibir a lista de tarefas cadastradas
        System.out.println("\nLista de Tarefas:");
        for (Tarefa tarefa : tarefas) {
            // Destacar tarefas concluídas
            if (tarefa.getStatus().equals("Concluído")) {
                System.out.println(tarefa + " (Concluída)");
            } else {
                System.out.println(tarefa + " (Pendente)");
            }
        }

        // Fechar o scanner
        scanner.close();
    }
}
