package Vetores;

public class vetor_07 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 100};

        int maior = numeros[0];  


        System.out.print("Números do vetor: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
     
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];  
            }
        
        }

        // Exibe os resultados
        System.out.println("\nMaior valor: " + maior);

    }
}
