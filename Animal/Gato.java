package Animal;
public class Gato extends Animal{
    private String cor;

    public Gato(String nome, int patas, String cor) {
        super(nome, patas);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void exibirSom(){
        System.out.println("Miau");
    }
    public void exibirInfo(){
        System.out.println("\nNome: " + getNome()+ "\nPatas: " + getPatas()+ "\nCor: "+ getCor());
        
    }
}
