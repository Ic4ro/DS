public class Multiplos {
    public static void main(String[] args) {
        int contador = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {  
                contador++;
            }
        }

        System.out.println("Quantidade de números entre 1 e 100 que são múltiplos de 3: " + contador);
    }
}
