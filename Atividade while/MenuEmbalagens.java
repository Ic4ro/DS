import java.util.Scanner;

public class MenuEmbalagens {

    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int op=8;

        while (op!=4) {
            System.out.println("\n===MENU===");
            System.out.println("1- CAIXA DE PAPELÃO");
            System.out.println("2- SACOLA PLÁSTICA");
            System.out.println("3- EMBALAGEM DE VIDRO");
            System.out.println("4- SAIR");
            System.out.println("ESCOLHA UMA EMBALAGEM: ");
            op=sc.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Caixa de papelão: Ideal para transporte e armazenamento");
                    break;
                case 2:
                    System.out.println("Sacola plástica: Leve e prática, mas pouco sustentável");
                    break;
                case 3:
                    System.out.println("Embalagem de vidro: Resistente e reutilizável");
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
