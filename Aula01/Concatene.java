import java.util.Scanner;

public class Concatene {
    
    public static void main(String[]args) {
        
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite uma p1: ");
            String p1=sc.next();
            System.out.println("Digite uma p2: ");
            // System.out.println(nome);
            String p2=sc.next();
            System.out.println("Palavra: "+p1+ p2);

        sc.close();
    }
}