package Ar_Condicionado;
class Portatil extends ArCondicionado {
    private int voltagem;
    private String cor;

    public Portatil(String codigo, String marca, int btu, boolean temDefeito, String tipoDefeito, int voltagem, String cor) {
        super("Portátil", codigo, marca, btu, temDefeito, tipoDefeito);
        this.voltagem = voltagem;
        this.cor = cor;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Voltagem: " + voltagem);
        System.out.println("Cor: " + cor);
    }
}