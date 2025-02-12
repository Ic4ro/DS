import java.util.Scanner;

public class MenuCanetas {

    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int op=8;

        while (op!=4) {
            System.out.println("\n===MENU===");
            System.out.println("1- CANETA ESFEROGRÁFICA");
            System.out.println("2- CANETA GEL");
            System.out.println("3- CANETA TINTEIRO");
            System.out.println("4- SAIR");
            System.out.println("ESCOLHA UMA CANETA: ");
            op=sc.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Caneta Esferográfica: Econômica e de longa duração");
                    break;
                case 2:
                    System.out.println("Caneta Gel: Tinta mais pigmentada e escrita suave");
                    break;
                case 3:
                    System.out.println("Caneta Tinteiro: Clássica e elegante, usada para caligrafia");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    break;
            }
        }
        sc.close();
    }
}
