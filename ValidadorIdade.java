import java.util.Scanner;

public class ValidadorIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite sua idade: ");
            String entrada = scanner.nextLine(); 

            int idade = Integer.parseInt(entrada);

            if (idade <= 0) {
                System.out.println("Erro: A idade deve ser maior que zero.");
            } else {
                System.out.println("Idade cadastrada com sucesso: " + idade);
            }

        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, digite um número inteiro válido para a idade.");
        } finally {
            System.out.println("Programa finalizado.");
        }

        scanner.close();
    }
}
