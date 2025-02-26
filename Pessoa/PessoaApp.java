public class PessoaApp {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Icaro", "0711878");

        Pessoa p2 = new Pessoa("Jonas", "2313131");

        System.out.println("Nome: " + p1.getNome()+ "\n" + "Telefone: " + p1.getTelefone());
        System.out.println("Nome: " + p2.getNome()+ "\n" + "Telefone: " + p2.getTelefone());
    }

}
