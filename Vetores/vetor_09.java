package Vetores;
import java.util.Scanner;

public class vetor_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int tamanhoMaximo = 5;
        int[] numeros = new int[tamanhoMaximo];
        int indiceAtual = 0;  
        
        while (true) {
            System.out.println("\nMenu de opções:");
            System.out.println("1 - Adicionar número");
            System.out.println("2 - Exibir números");
            System.out.println("3 - Remover número");
            System.out.println("4 - Finalizar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    if (indiceAtual < tamanhoMaximo) {
                        System.out.print("Digite o número a ser adicionado: ");
                        int numero = scanner.nextInt();
                        numeros[indiceAtual] = numero;
                        indiceAtual++;
                        System.out.println("Número adicionado com sucesso!");
                    } else {
                        System.out.println("Não há espaço disponível para adicionar mais números.");
                    }
                    break;
                
                case 2:
                    if (indiceAtual == 0) {
                        System.out.println("Não há números cadastrados.");
                    } else {
                        System.out.println("Números armazenados:");
                        for (int i = 0; i < indiceAtual; i++) {
                            System.out.println("Índice " + i + ": " + numeros[i]);
                        }
                    }
                    break;
                
                case 3:
                    if (indiceAtual == 0) {
                        System.out.println("Não há números para remover.");
                    } else {
                        System.out.print("Digite o índice do número a ser removido: ");
                        int indiceRemover = scanner.nextInt();
                        
                        if (indiceRemover >= 0 && indiceRemover < indiceAtual) {
                            for (int i = indiceRemover; i < indiceAtual - 1; i++) {
                                numeros[i] = numeros[i + 1];
                            }
                            numeros[indiceAtual - 1] = 0;  
                            indiceAtual--; 
                            System.out.println("Número removido com sucesso!");
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    }
                    break;
                
                case 4:
                  
                    System.out.println("Programa finalizado.");
                    scanner.close();
                    return;  
                
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
