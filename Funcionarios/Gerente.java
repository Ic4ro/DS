class Gerente extends Funcionario {
    private static final double SALARIO_FIXO = 8000.00;

    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public double calcularSalario() {
        return SALARIO_FIXO;
    }
}