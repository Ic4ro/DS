public class main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Carlos Silva", 5000.00, "Gerente");

        Assistente assistente = new Assistente("Ana Costa", 2500.00, "Assistente");

        System.out.println(gerente.getNome() + " (" + gerente.getCargo() + ") - Bônus: R$ " + gerente.getBonus());
        System.out.println(
                assistente.getNome() + " (" + assistente.getCargo() + ") - Bônus: R$ " + assistente.calcularBonus());
    }
}
