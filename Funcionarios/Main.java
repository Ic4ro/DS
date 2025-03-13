public class Main {
    public static void main(String[] args) {
        // Criando um gerente e um programador
        Funcionario gerente = new Gerente("Carlos");
        Funcionario programador = new Programador("Ana", 3); // Exemplo com 3 projetos

        // Exibindo os salários
        System.out.println(gerente.getNome() + " - Salário do Gerente: R$ " + gerente.calcularSalario());
        System.out.println(programador.getNome() + " - Salário do Programador: R$ " + programador.calcularSalario());
    }
}