package dao;


import java.sql.*;

import javax.swing.JOptionPane;

import conexoes.Conection;
import modelo.Usuarios;


public class UsuarioDao {

    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet rs;

    public UsuarioDao() {
    }

    public boolean adicionar(Usuarios usuario) {
        String sql = "INSERT INTO usuario(nome, cargo, senha) VALUES(?, ?, ?)";
        this.conexao = new Conection().getConnection();
        try {
            stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCargo());
            stmt.setString(3, usuario.getSenha());
            stmt.execute();
            System.out.println("Usuario"+"\n"+"testando se funfa");
            stmt.close();
            JOptionPane.showMessageDialog(null, "Usuário criado com sucesso");
            return true;

        } catch (SQLException exception) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Erro ao tentar criar usuário");
            throw new RuntimeException(exception);
        }
    }

    public Boolean logar(Usuarios usuario) {
        String sql = "SELECT * FROM usuario WHERE nome = '"+usuario.getNome()+"' AND senha = '"+usuario.getSenha()+"' ";
        this.conexao = new Conection().getConnection();
        try {
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Logado com sucesso");
                usuario.setId(rs.getInt("id"));
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Senha ou Usuario incorretos");
                return false;
            }

        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }
    }



}
