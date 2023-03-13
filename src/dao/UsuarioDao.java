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

    
    public Usuarios getUsuarioById(int id) {
        Usuarios usuarios = new Usuarios();
        String sql = "SELECT * FROM usuario WHERE id = ?";
        this.conexao = new Conection().getConnection();
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1,""+id );
            rs = stmt.executeQuery();
            if (rs.next()) {
                usuarios.setId(rs.getInt("id"));
                usuarios.setNome(rs.getString("nome"));
                usuarios.setCargo(rs.getString("cargo"));
                usuarios.setSenha(rs.getString("senha"));
                return usuarios;
            }else{
                JOptionPane.showMessageDialog(null, "Usuário com esse id não foi encontrado");
                return null;
            }
        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }
}
}
