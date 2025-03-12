package Ar_Condicionado;
import java.util.Scanner;

public class ArCondicionadoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        ControladorArCondicionado controlador = new ControladorArCondicionado();

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar Ar Condicionado");
            System.out.println("2 - Gerar Relatório");
            System.out.println("3 - Fechar Programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    controlador.cadastrarArCondicionado();
                    break;
                case 2:
                    controlador.gerarRelatorio();
                    break;
                case 3:
                    controlador.fecharPrograma();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
        
        scanner.close();
    }
}
    

