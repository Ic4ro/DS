package Veiculo;
public class VeiculoApp {
    public static void main(String[] args) {

        Carro c1 = new Carro("Argo", "Fiat", 2015, 4);
      
        Moto m1 = new Moto("Fan", "Honda", 2025, 130);
    
        c1.exibirInfo();
        m1.exibirInfo();
    
    }
}