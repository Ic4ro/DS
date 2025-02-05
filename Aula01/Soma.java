import java.util.Scanner;

public class Soma {
    public static void main(String[]args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");

        int n1=sc.nextInt();

        System.out.println("Digite so segundo numero: ");

        int n2=sc.nextInt();

        int soma=n1+n2;
        int subtracao=n1-n2;
        int multiplicacao=n1*n2;
        int divisao=n1/n2;


        System.out.println("Soma: "+soma);
        System.out.println("Subtração: "+subtracao);
        System.out.println("Divisão: "+divisao);
        System.out.println("Multiplicação: "+multiplicacao);
        sc.close();


    }
}