package Interface_Grafica;

import javax.swing.JOptionPane;

public class Idade {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Digite sua idade: ");
        
        try {
            int idade = Integer.parseInt(input);

            if (idade >= 18) {
                JOptionPane.showMessageDialog(null, "Você é maior de idade","Mensagem" , JOptionPane.INFORMATION_MESSAGE);
            
            } else {
                JOptionPane.showMessageDialog(null, "Você é menor de idade","Mensagem" , JOptionPane.INFORMATION_MESSAGE);
            }

            JOptionPane.showMessageDialog(null, "Idade: " + idade + "!", "Idade", JOptionPane.PLAIN_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
