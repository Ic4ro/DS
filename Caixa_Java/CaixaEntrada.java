package Caixa_Java;
import javax.swing.JOptionPane;

public class CaixaEntrada {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!", "Saudação", JOptionPane.PLAIN_MESSAGE);

    }
}