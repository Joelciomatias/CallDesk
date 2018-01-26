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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




public class CategoriaDB {
    
    private Connection con = null;
    private Categoria categoria;

    public CategoriaDB() {
        con = ConnectionFactory.getConnection();
    }
    
   public boolean insert(Categoria categoria){
       PreparedStatement stmt = null;
       String sql = "INSERT INTO cad_categoria(descricao,ativo) VALUES (?,1)";
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
   
   public boolean delete(int categoria_id){
       PreparedStatement stmt = null;
       String sql = "UPDATE cad_categoria SET ativo = 0 WHERE categoria_id = (?)";
       
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, categoria_id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
              
              return false;
        }
       
   }
   
   public boolean update(int id, String descricao){
       PreparedStatement stmt = null;
       String sql = "UPDATE cad_categoria set descricao = (?) WHERE categoria_id = (?);";
       
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, descricao);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
              
              return false;
        }
       
   }
  
   
   public ArrayList<Categoria> getList(){
       PreparedStatement stmt = null;
         String sql = "SELECT * FROM cad_categoria WHERE ativo = 1";
       ArrayList <Categoria> lisCat = new ArrayList<Categoria>();
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            rs.first();
            do{
               Categoria c1 = new Categoria();
               c1.setId(rs.getInt("categoria_id"));
               c1.setDescricao(rs.getString("descricao"));
               lisCat.add(c1);
              
            }while(rs.next());
         
    
        } catch (SQLException ex) {
            
           
            
        }
        return lisCat;
   }

   
}
