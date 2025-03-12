package Ar_Condicionado;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ControladorArCondicionado {

 private List<ArCondicionado> aparelhos = new ArrayList<>();
        
public void cadastrarArCondicionado(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escolha o tipo de ar condionado (1- Splinter, 2- Portátil): ");
    int tipo = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Digite o código: ");
    String codigo = scanner.nextLine();

    System.out.print("Digite a marca: ");
    String marca = scanner.nextLine();      

    System.out.println("Digite o BTU: ");
    int btu = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Há defeito? (sim/não): ");
    String respostaDefeito = scanner.nextLine();
    boolean temDefeito = respostaDefeito.equalsIgnoreCase("sim");

    String tipoDefeito = "";
    if (temDefeito) {
        System.out.println("Qual o tipo de defeito? ");
        tipoDefeito = scanner.nextLine();
    }

    if (tipo == 1) {
        System.out.println("Digite o tamando do Splinter (ex: Pequeno, Médio, Grande): ");
        String tipoTamanho = scanner.nextLine();
        aparelhos.add(new Splinter(codigo, marca, btu, temDefeito, tipoDefeito, tipoTamanho));

    } else if (tipo == 2){
        System.out.println("Digite a voltagem do portátil: ");
        int voltagem = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a cor do portátil: ");
        String cor = scanner.nextLine();
        aparelhos.add(new Portatil(codigo, marca, btu, temDefeito, tipoDefeito, voltagem, cor));
        }
    }

    public void gerarRelatorio() {
        if (aparelhos.isEmpty()) {
            System.out.println("Não há aparelhos cadastrados.");
        } else {
            System.out.println("\nRelatório de Ar Condicionados Cadastrados:");
            for (ArCondicionado aparelho : aparelhos) {
                aparelho.exibirInformacoes();
                System.out.println("----------------------------------");
            }
        }
    }

    public void fecharPrograma() {
        System.out.println("Programa encerrado.");
    
    }
}