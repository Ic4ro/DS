/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroanimais.controle;

import com.mycompany.registroanimais.dao.AnimaisDAO;
import com.mycompany.registroanimais.modelo.Animais;
import java.util.ArrayList;

/**
 *
 * @author aluno.den
 */
public class ControleAnimais {
    private AnimaisDAO dao = new AnimaisDAO();

    public void cadastrar(String nome, String especie, int idade) {
        Animais a = new Animais(nome, especie, idade);
        dao.inserir(a);

    }

    public ArrayList<Animais> listar() {
        return dao.listar();
    }

    public void atualizar(int id, String nome, String especie, int idade) {
        Animais a = new Animais(id, nome, especie, idade);
    }
    public void remover(int id) {
        dao.remover(id);
    }
    
    public ArrayList<Animais> buscarPorNome(String nome) {
        return dao.buscarPorNome(nome);
    }

}
