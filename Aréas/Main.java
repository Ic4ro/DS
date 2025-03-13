public class Main {
    
    public static void main(String[] args) {
        
        Circulo cir = new Circulo(10);

        Retangulo ret = new Retangulo(5, 10);

        System.out.println("Circulo: "+cir.calcularArea());

        System.out.println("Retângulo: "+ret.calcularArea());
    }
}
