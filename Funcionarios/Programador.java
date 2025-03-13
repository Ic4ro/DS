class Programador extends Funcionario {
    private static final double SALARIO_BASE = 5000.00;
    double bonusPorProjeto;

    // Construtor para inicializar o nome e o número de projetos
    public Programador(String nome, int projetos) {
        super(nome);
        // Define o bônus com base no número de projetos
        this.bonusPorProjeto = 200.00 * projetos;
    }

    @Override
    public double calcularSalario() {
        return SALARIO_BASE + bonusPorProjeto;
    }
}