/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DB;

import Connection.ConnectionFactory;
import Model.Situacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author K
 */
public class SituacaoDB {
     private Connection con = null;
     
     public SituacaoDB() {
     con = ConnectionFactory.getConnection();
}
     
     public boolean insert(Situacao situacao){
         PreparedStatement stmt = null;
         String sql = "INSERT INTO cad_situacao (nome, ativo) VALUES (?,1)";
         
         try {
             stmt = con.prepareCall(sql);
             stmt.setString(1, situacao.getDescricao());
             stmt.executeUpdate();
             return true;
             
         } catch (SQLException ex) {
             Logger.getLogger(SituacaoDB.class.getName()).log(Level.SEVERE, null, ex);
         }
         return false;
         
     }
     
     public boolean update(String situacao, int situacao_id){
         PreparedStatement stmt = null;
         String sql = "UPDATE cad_situacao set nome = (?) WHERE situacao_id =(?)";
         
         try {
             stmt = con.prepareCall(sql);
             stmt.setString(1, situacao);
             stmt.setInt(2, situacao_id);
             stmt.executeUpdate();
             return true;
             
         } catch (SQLException ex) {
             Logger.getLogger(SituacaoDB.class.getName()).log(Level.SEVERE, null, ex);
         }
         return false;
     }
     
     public boolean delete(int id){
         PreparedStatement stmt = null;
         String sql = "UPDATE cad_situacao set ativo = 0 WHERE situacao_id = (?)";
         
         try {
             stmt = con.prepareCall(sql);
             stmt.setInt(1, id);
             stmt.executeUpdate();
             return true;
         } catch (SQLException ex) {
             Logger.getLogger(SituacaoDB.class.getName()).log(Level.SEVERE, null, ex);
         }
            return false;
     }
          public ArrayList<Situacao> getList(){
       PreparedStatement stmt = null;
         String sql = "SELECT * FROM cad_situacao WHERE ativo = 1";
       ArrayList <Situacao> lisCat = new ArrayList<Situacao>();
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            rs.first();
            do{
               Situacao c1 = new Situacao();
               c1.setIdSituacao(rs.getInt("situacao_id"));
               c1.setDescricao(rs.getString("nome"));
               lisCat.add(c1);
                
            }while(rs.next());
         
    
        } catch (SQLException ex) {
            
            
            
        }
        return lisCat;
}
}
