import java.util.Scanner;

public class ClienteApp {
    
    public static void main(String[] args) {
        // Criação do scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar dados ao usuário
        System.out.print("Informe o nome do cliente: ");
        String nome = scanner.nextLine();
        
        System.out.print("Informe o email do cliente: ");
        String email = scanner.nextLine();
        
        System.out.print("Informe o telefone do cliente: ");
        String telefone = scanner.nextLine();
        
        // Criação do objeto cliente com o construtor que recebe os parâmetros
        Cliente cliente = new Cliente(nome, email, telefone);
        
        // Exibir as informações do cliente
        System.out.println("\nInformações do cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Telefone: " + cliente.getTelefone());
        
        // Fechar o scanner
        scanner.close();
    }
}
