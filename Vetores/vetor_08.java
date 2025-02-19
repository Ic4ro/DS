package Vetores;

public class vetor_08 {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 3, 19, 1, 8, 80, 6, 4, 55};

        
        System.out.print("Números do vetor: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();  

        int maior = numeros[0];  
        int menor = numeros[0];  

        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];  
            }
            if (numeros[i] < menor) {
                menor = numeros[i];  
            }
        }

        
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
