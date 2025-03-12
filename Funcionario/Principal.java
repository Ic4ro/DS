package Funcionario;
public class Principal {
    
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Icaro", 19, 1500);

        Gerente ger = new Gerente("Jonas", 25, 2000, 250);

        System.out.println("===Funcionário===");
        System.out.println("Nome: "+func.getNome()+ "\nIdade: " +func.getIdade()+ "\nSalário: "+func.getSalario());
        System.out.println();
        System.out.println("===Gerente===");
        System.out.println("Nome: "+ger.getNome()+ "\nIdade: " +ger.getIdade()+ "\nSalário: "+ger.getSalario()+"\nBonûs: "+ger.getBonus());
        
    }
}
