/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacote.dao;

import com.mycompany.pacote.modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author aluno.den
 */
public class UsuarioDao {
     private ArrayList<Usuario> usuarios = new ArrayList<>();

    // Construtor: Adiciona usuários "Pré-cadastrados"
    public UsuarioDao() {
        usuarios.add(new Usuario("admin", "admin123"));     
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
