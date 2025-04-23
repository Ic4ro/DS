/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacote.controle;

import com.mycompany.pacote.dao.UsuarioDao;

/**
 *
 * @author aluno.den
 */
public class ControleUsuario {
    private UsuarioDao dao = new UsuarioDao();
    
    public boolean  autenticar(String login, String senha) {
        return dao.autenticar(login, senha);
    }
    
}
