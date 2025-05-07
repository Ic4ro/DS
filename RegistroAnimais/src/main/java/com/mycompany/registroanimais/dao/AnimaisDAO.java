/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroanimais.dao;

import com.mycompany.registroanimais.ConexaoMySQL;
import com.mycompany.registroanimais.modelo.Animais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author aluno.den
 */
public class AnimaisDAO {

    public void inserir(Animais animais) {
        String sql = "INSERT INTO animais (nome, especie, idade) VALUES (?, ?, ?)";
        try (Connection conn = ConexaoMySQL.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, animais.getNome());
            stmt.setString(2, animais.getEspecie());
            stmt.setInt(3, animais.getIdade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Animais> listar() {
        ArrayList<Animais> lista = new ArrayList<>();
        String sql = "SELECT * FROM animais";
        try (Connection conn = ConexaoMySQL.conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Animais a = new Animais(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("especie"),
                        rs.getInt("idade")
                );
                lista.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Animais> buscarPorNome(String nome) {
        ArrayList<Animais> lista = new ArrayList<>();
        String sql = "SELECT * FROM animais WHERE nome LIKE ?";

        try (Connection conn = ConexaoMySQL.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Animais a = new Animais(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("especie"),
                        rs.getInt("idade")
                );
                lista.add(a);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public void atualizar(Animais animais) {
        String sql = "UPDATE animais SET nome = ?, especie = ?, idade = ? WHERE id = ?";
        try (Connection conn = ConexaoMySQL.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, animais.getNome());
            stmt.setString(2, animais.getEspecie());
            stmt.setInt(3, animais.getIdade());
            stmt.setInt(4, animais.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void remover(int id) {
        String sql = "DELETE FROM animais WHERE id = ?";
        try (Connection conn = ConexaoMySQL.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(4, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
