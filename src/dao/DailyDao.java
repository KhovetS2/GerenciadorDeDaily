/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
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

}
