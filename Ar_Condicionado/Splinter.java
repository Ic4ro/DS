package Ar_Condicionado;
class Splinter extends ArCondicionado {
    private String tipoTamanho;

    public Splinter(String codigo, String marca, int btu, boolean temDefeito, String tipoDefeito, String tipoTamanho) {
        super("Splinter", codigo, marca, btu, temDefeito, tipoDefeito);
        this.tipoTamanho = tipoTamanho;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tamanho: " + tipoTamanho);
    }
}