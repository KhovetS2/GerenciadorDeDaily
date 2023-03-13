package conexoes;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
    
    public static void main(String[] args) throws SQLException {
        Connection conexao = new Conection().getConnection();
        System.out.println("Conexão Aberta");
        conexao.close();
    }
}
