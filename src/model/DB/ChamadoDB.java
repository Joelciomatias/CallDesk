/*
 * Nessa classe são tratadas todas as operaçõs no DB em relação ao chamado
 * Autor: Lucas Knabben
 * Data da criação: 04/11/2017
 */
package Model.DB;

import Connection.ConnectionFactory;
import Model.Chamado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ChamadoDB {
    private Connection con = null;

    public ChamadoDB() {
         con = ConnectionFactory.getConnection();
    }
    
    public boolean insert(Chamado chamado){
        PreparedStatement stmt  = null;
        String sql = "INSERT INTO chamado (titulo, descricao,  status,  categoria_id, usuario_id)  values (?, ?, ?, ?, ?)";
        
       
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, chamado.getTitulo());
            stmt.setString(2, chamado.getDescricao());
            stmt.setInt(3, chamado.getStatus());
            stmt.setInt(4, 1);
            stmt.setInt(5, 1);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir o chamado:" +chamado.getTitulo() +ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
    
    public void delete(int id){
         
        PreparedStatement stmt  = null;
        String sql = "DELETE from chamado WHERE chamado_id = (?) ";
        
        try {
            stmt = con.prepareCall(sql);
            stmt.setInt(1, id);
            
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir o chamado" +ex);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    
}
