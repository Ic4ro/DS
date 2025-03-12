package Ar_Condicionado;
public class ArCondicionado {
    private String modelo;
    private String codigo;
    private String marca;
    private int btu;
    private boolean temDefeito;
    private String tipoDefeito;
    
    public ArCondicionado(String modelo, String codigo, String marca, int btu, boolean temDefeito, String tipoDefeito) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.marca = marca;
        this.btu = btu;
        this.temDefeito = temDefeito;
        this.tipoDefeito = tipoDefeito;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getBtu() {
        return btu;
    }

    public void setBtu(int btu) {
        this.btu = btu;
    }

    public boolean isTemDefeito() {
        return temDefeito;
    }

    public void setTemDefeito(boolean temDefeito) {
        this.temDefeito = temDefeito;
    }

    public String getTipoDefeito() {
        return tipoDefeito;
    }

    public void setTipoDefeito(String tipoDefeito) {
        this.tipoDefeito = tipoDefeito;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Código: " + codigo);
        System.out.println("Marca: " + marca);
        System.out.println("BTU: " + btu);
        System.out.println("Defeito: " + (temDefeito ? "Sim (" + tipoDefeito + ")" : "Não"));
    }
}

