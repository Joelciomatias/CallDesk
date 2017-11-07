/*
 * Nessa classe são tratadas todas as operaçõs no DB em relação ao usuario
 * Autor: Lucas Knabben
 * Data da criação: 04/11/2017
 */
package Model.DB;

import Connection.ConnectionFactory;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UsuarioDB {
    private Connection con = null;
    
    public UsuarioDB(){
        con = ConnectionFactory.getConnection();
    }
    
    public boolean insert(Usuario usuario){
        PreparedStatement stmt = null;
        String sql = "INSERT INTO usuario (nome, email, ramal, setor) VALUES (?, ?, ?, ?)";
        
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getRamal());
            stmt.setString(4, usuario.getSetor());
            stmt.executeUpdate();
            System.out.println("Usuario cadastrado com sucesso !");
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao incluir o usuario " +usuario.getNome() +ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        /*
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
     */   
    }
    }

