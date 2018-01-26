/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DB;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.NivelAcesso;

/**
 *
 * @author K
 */
public class NivelAcessoDB {
    private Connection con = null;
    
    public NivelAcessoDB(){
        con = ConnectionFactory.getConnection();
    }
    
      public ArrayList<NivelAcesso> getList(){
       PreparedStatement stmt = null;
         String sql = "SELECT * FROM cad_tipo";
       ArrayList <NivelAcesso> listaNivel = new ArrayList<NivelAcesso>();
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            rs.first();
            while(rs.next()){
                NivelAcesso n1 = new NivelAcesso();
                int id = rs.getInt("nivel_id");
                String descricao = rs.getString("descricao");
                n1.setId(id);
                n1.setDescricao(descricao);
                listaNivel.add(n1);
                JOptionPane.showMessageDialog(null, n1.getId());
            }
         
    
        } catch (SQLException ex) {
            
           
            
        }
        return listaNivel;
   }
}
