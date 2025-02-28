import java.util.ArrayList;

public class Aluno {

    // Atributos privados
    private String nome;
    private ArrayList<Double> notas;

    // Construtor
    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    // Getter e Setter para o nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para adicionar uma nota
    public void adicionarNota(double nota) {
        this.notas.add(nota);
    }

    // Método para calcular a média das notas
    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0.0; // Se não houver notas, a média será 0
        }

        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size(); // Média das notas
    }

    @Override
    public String toString() {
        return "Nome: " + nome + 
             "\nMédia: " + calcularMedia();
    }
}
