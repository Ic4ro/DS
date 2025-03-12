package Animal;
public class AnimalApp {
    
    public static void main(String[] args) {
     
        Cachorro dog = new Cachorro("Thor", 4, "Poodle");

        Gato cat = new Gato("Garfield", 4, "Azul");
    
        dog.exibirInfo();
        dog.exibirSom();
        cat.exibirInfo();
        cat.exibirSom();
    }
}
