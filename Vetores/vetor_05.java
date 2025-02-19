package Vetores;

import java.util.Scanner;

public class vetor_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
        System.out.println("Digite a quantidade de nomes que deseja inserir: ");
        int quantidade = sc.nextInt();  
        
        String[] nomes = new String[quantidade];  
        
 
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = sc.next();  
        }
        
    
        System.out.println("\nNomes inseridos: ");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        
        System.out.println("\nQuantidade de nomes inseridos: " + nomes.length);  
        
        sc.close();
    }
}
