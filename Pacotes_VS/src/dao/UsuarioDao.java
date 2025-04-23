package dao;

import java.util.ArrayList;

import modelo.Usuario;

public class UsuarioDao {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    // Construtor: Adiciona usuários "Pré-cadastrados"
    public UsuarioDao() {
        usuarios.add(new Usuario("admin", "admin123"));
        usuarios.add(new Usuario("usuario", "1234"));
    }

    // Verifica se o login e senha informados existem na lista
    public boolean autenticar(String login, String senha) {
        for (Usuario u: usuarios) {
            if(u.getLogin().equals(login) && u.getSenha().equals(senha)) {
                return true; // usuário encontrado 
            }
        }
        return false; //não encontrado
    }
    
}
