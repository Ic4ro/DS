public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
        this.bonus = calcularBonus();
    }

    public double calcularBonus() {
        return salario * 0.10;
    }

    public double getBonus() {
        return bonus;
    }
}
