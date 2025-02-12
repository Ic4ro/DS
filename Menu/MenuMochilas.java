import java.util.Scanner;

public class MenuMochilas {

    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int op=8;

        while (op!=4) {
            System.out.println("\n===MENU===");
            System.out.println("1- MOCHILA ESCOLAR");
            System.out.println("2- MOCHILA DE VIAGEM");
            System.out.println("3- MOCHILA ESPORTIVA");
            System.out.println("4- SAIR");
            System.out.println("ESCOLHA UMA MOCHILA: ");
            op=sc.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Mochila Escolar: Compacta e ideal para estudantes");
                    break;
                case 2:
                    System.out.println("Mochila de Viagem: Espaçosa, ideal para longas jornadas");
                    break;
                case 3:
                    System.out.println("Mochila Esportiva: Leve, resistente e ergonômica");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Tente novamente com um número menor.");
                    break;
            }
        }
        sc.close();
    }
}
