/*
 * Nessa classe são tratadas todas as operaçõs no DB em relação a categoria dos
 * chamados
 * Autor: Lucas Knabben
 * Data da criação: 04/11/2017
 */
package Model.DB;

import Connection.ConnectionFactory;
import Model.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoriaDB {
    
    private Connection con = null;

    public CategoriaDB() {
        con = ConnectionFactory.getConnection();
    }
    
   public boolean insert(Categoria categoria){
       PreparedStatement stmt = null;
       String sql = "INSERT INTO cad_categoria(descricao) VALUES (?)";
       try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, categoria.getDescricao());
            stmt.executeUpdate();
            return true;
                    } catch (SQLException ex) {
            System.err.println("Erro" +ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
   }
}
