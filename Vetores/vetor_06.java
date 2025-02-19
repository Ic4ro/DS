package Vetores;

import java.util.Scanner;

public class vetor_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]numeros = new int[5];
        int soma=0;
        double media=0;

        for(int i=0;i<numeros.length; i++){
            System.out.println("Digite o número " + (i+1)+ ":");
            numeros[i]=sc.nextInt();
            soma+=numeros[i];
            media = soma / numeros[i];

        }
        System.out.println("A média elementos do array é: "+media);
        sc.close();
    }
    
}
