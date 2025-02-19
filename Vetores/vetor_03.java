package Vetores;

public class vetor_03 {
    
    public static void main(String[] args) {
        // Declarando a inicialização dos arrays.
        String[] alunos = {"Ana", "Bruno", "Carlos", "Diana"};
        double[] notas = {8.5, 7.0, 9.2, 6.8};

        // Percorrendo os arrays e exibindo dados. 
        for (int i = 0; i < alunos.length; i++) {
            System.out.println((i+1) +" "+ "Aluno: " + alunos[i] + " - Nota: " + notas[i]);
        }
    }
}
