import java.util.Scanner;

public class MenuOperacao {
    
    public static void main(String[] args) {
        // Entrada
        Scanner scanner = new Scanner(System.in);

        int op = 0;

        while (op != 5) {
            clearConsole();  // Limpar o terminal antes de mostrar o menu

            System.out.println("\n BEM VINDO A LOJA DO PROGRAMADOR");
            
            try {
                // Pausa o programa por 1 segundo (1000 milissegundos)
                System.out.println("");
                Thread.sleep(1000);  // Pausa por 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Digite o primeiro número: ");
            int n1=scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int n2=scanner.nextInt();

            System.out.println("1- SOMA");
            System.out.println("2- SUBTRAÇÃO");
            System.out.println("3- MULTIPLICAÇÃO");
            System.out.println("4- DIVISÃO");
            System.out.println("5- SAIR");
            System.out.println("ESCOLHA UMA OPÇÃO: ");
            op = scanner.nextInt();

            switch (op) {
                case 1: 
                    int soma=n1 + n2;
                    System.out.println("\nSoma: " + soma);
                    break;

                case 2:
                    int subtracao=n1 - n2;
                    System.out.println("\nSubtração: " + subtracao);
                break;

                case 3: 
                    int multiplicacao=n1 * n2;
                    System.out.println("\nMultiplicação: " + multiplicacao);
                    break;
                    
                case 4:
                    int divisao=n1 / n2;
                    System.out.println("\nDivisão: " + divisao);
                    break; 

                case 5:
                    System.out.println("\nSaindo do programa...");
                    break; 
                
                default:
                    System.out.println("Você escolheu uma opção que não existe.");
                    break;
            }
        }

        // Após sair do laço, o programa será finalizado
        scanner.close();
    }

    // Função para limpar o terminal
    private static void clearConsole() {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                Runtime.getRuntime().exec("cls");  // Limpar no Windows
            } else {
                Runtime.getRuntime().exec("clear");  // Limpar no Linux/Mac
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
