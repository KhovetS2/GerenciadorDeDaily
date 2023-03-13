/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import conexoes.Conection;
import modelo.Daily;

/**
 *
 * @author Fatec
 */
public class DailyDao {

    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet rs;
    private ArrayList<Daily> lista = new ArrayList<>();


    public DailyDao() {
        this.conexao = new Conection().getConnection();
    }

    public void adicionar(Daily daily) {
        String sql = "INSERT INTO daily(conteudo, dataRealizada, usuario_id) VALUES(?, ?, ?)";
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, daily.getConteudo());
            stmt.setDate(2, daily.getData());
            stmt.setInt(3, daily.getUsuarios_id());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null,"Daily Realizada com Sucesso!");

        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }
    }

    /**
     *
     * @return
     */

    public ArrayList<Daily> pesquisarDaily() {
        String sql = "select daily.id, Conteudo, dataRealizada, nome, cargo from daily inner join usuario on usuario.id = daily.usuario_id";
        try {
            this.conexao = new Conection().getConnection();
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Daily objDaily = new Daily();
                objDaily.setId(rs.getInt("id"));
                objDaily.setConteudo(rs.getString("conteudo"));
                objDaily.setData(rs.getDate("dataRealizada"));
                objDaily.setNome(rs.getString("nome"));
                objDaily.setCargo(rs.getString("cargo"));

                this.lista.add(objDaily);
            }
            
        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }

        return this.lista;
    }

    public ArrayList<Daily> pesquisarDaily(int id) {
        String sql = "select daily.id, Conteudo, dataRealizada, nome, cargo from daily inner join usuario on usuario.id = daily.usuario_id where usuario_id = ?";
        try {
            this.conexao = new Conection().getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Daily objDaily = new Daily();
                objDaily.setId(rs.getInt("id"));
                objDaily.setConteudo(rs.getString("conteudo"));
                objDaily.setData(rs.getDate("dataRealizada"));
                objDaily.setNome(rs.getString("nome"));
                objDaily.setCargo(rs.getString("cargo"));

                this.lista.add(objDaily);
            }
            
        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }

        return this.lista;
    }

    public void alterarDaily(Daily daily) {
        String sql = "UPDATE daily SET conteudo= ?, dataRealizada = ? WHERE id = ?";
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, daily.getConteudo());
            stmt.setDate(2, daily.getData());
            stmt.setInt(3, daily.getId());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null,"Daily Alterada com Sucesso!");

        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }
    }

    public void deletarDaily(int id) {
        String sql = "DELETE FROM daily WHERE id = ?";
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null,"Daily Deletada com Sucesso!");

        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }
    }


    


}
