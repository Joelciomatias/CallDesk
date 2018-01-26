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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class UsuarioDB {

    private Connection con = null;

    public UsuarioDB() {
        con = ConnectionFactory.getConnection();
    }

    public boolean insert(Usuario usuario) {
        PreparedStatement stmt = null;
        String sql = "INSERT INTO usuario (nome, email, ramal, setor, senha, tipo, ativo) VALUES (?, ?, ?, ?, ?, ?,?)";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setInt(3, usuario.getRamal());
            stmt.setString(4, usuario.getSetor());
            stmt.setString(5, usuario.getSenha());
            stmt.setInt(6, usuario.getTipo());
            stmt.setInt(7, 1);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao incluir o usuario " + usuario.getNome() + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

     public boolean verificaEmail(String email) {
        PreparedStatement stmt = null;
        String sql = "SELECT email FROM usuario WHERE email = (?)";
        boolean result = false;
        try {
            stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery(sql);
            if(rs != null){
                result = true;
                System.out.println("tem");
            }else{
                result = false;
            }
            
        } catch (SQLException ex) {
            
            
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return result;
    }
     
    public boolean delete(int id) {

        PreparedStatement stmt = null;
        String sql = "UPDATE usuario set ativo = 0 WHERE usuario_id =(?)";

        try {
            stmt = con.prepareCall(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir o usuario" + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public ArrayList<Usuario> realizarLogin(String email, String senha){
    /* public void realizarLogin(String email, String senha){
        PreparedStatement stmt = null;
        String sql = "SELECT * FROM usuario WHERE email = (?) AND senha =(?)";
        
        try{
            stmt = con.prepareCall(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            stmt.executeQuery();
            
            
            
        }catch(SQLException ex){
            System.err.println("Login ou senha invalidos" + ex);
            
        }
        if(sql == null){
            System.err.println("Login ou senha invalidos");
        }
        */
          PreparedStatement stmt = null;
        String sql = "SELECT * FROM usuario WHERE email = (?) and senha = (?)";
        ResultSet rs = null;
        boolean check = false;
        ArrayList<Usuario> login = new ArrayList<Usuario>();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
           if(rs.next()){
              check = true;
              Usuario user = new Usuario();
              user.setId(rs.getInt("usuario_id"));
              user.setNome(rs.getString("nome"));
              user.setTipo(rs.getInt("tipo"));
              login.add(user);
              
            }else{
               return null;
           }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDB.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return login;
        
    }
    
    public List<Usuario> read(){
        PreparedStatement stmt = null;
        String sql = "SELECT * FROM usuario WHERE ativo = 1";
        ResultSet rs = null;
        List<Usuario> userList = new ArrayList<Usuario>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
           while(rs.next()){
                Usuario user = new Usuario();
                user.setId(rs.getInt("usuario_id"));
                user.setNome(rs.getString("nome"));
                user.setSetor(rs.getString("setor"));
                user.setEmail(rs.getString("email"));
                user.setRamal(rs.getInt("ramal"));
                userList.add(user);
               
            };
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDB.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return userList;
        
    }
    
    public boolean update(int id,String nome, String setor, String email, int ramal, String senha, int tipo){
         PreparedStatement stmt = null;
        String sql = "UPDATE usuario set nome =(?),  email=(?), ramal=(?), setor =(?),  senha = (?),  tipo =(?)"
                + "WHERE usuario_id = (?)";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setInt(3, ramal);
            stmt.setString(4, setor);
            stmt.setString(5, senha);
            stmt.setInt(6, tipo);
            stmt.setInt(7, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar o cadastro " + nome + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
        
}
