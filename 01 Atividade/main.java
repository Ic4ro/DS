public class main {
    public static void main(String[] args) {

        Produto produto = new Produto("Camiseta", 50, 10);
        double valorTotal = produto.calcularValorTotal();

        System.out.println("O valor total do estoque de " + produto.getNome() + " é: R$" + valorTotal);

    }
}
