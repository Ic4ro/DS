public class main {
    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira("Samsung", 150.0, 400);

        Microondas microondas = new Microondas("LG", 1200.0, 10);

        geladeira.ligar();
        microondas.ligar();
    }
}
