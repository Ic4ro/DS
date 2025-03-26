public class Assistente extends Funcionario {

    // Construtor da subclasse Assistente
    public Assistente(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
    }

    public double calcularBonus() {
        return salario * 0.05;
    }
}
