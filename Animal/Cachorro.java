package Animal;
public class Cachorro extends Animal{
    private String Raca;

    public Cachorro(String nome, int patas, String raca) {
        super(nome, patas);
        Raca = raca;
    }

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String raca) {
        Raca = raca;
    }
        
    public void exibirSom(){
        System.out.println("AuAu");
        
    }
    public void exibirInfo(){
        System.out.println("\nNome: " + getNome()+ "\nPatas: " + getPatas()+ "\nRaça: "+ getRaca());
        
    }
}
