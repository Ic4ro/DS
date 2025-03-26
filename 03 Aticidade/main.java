import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Vaca());

        for (Animal animal : animais) {
            animal.fazerSom();
        }
    }
}