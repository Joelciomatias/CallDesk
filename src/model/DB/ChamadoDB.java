/*
 * Nessa classe são tratadas todas as operaçõs no DB em relação ao chamado
 * Autor: Lucas Knabben
 * Data da criação: 04/11/2017
 */
package Model.DB;

import Connection.ConnectionFactory;
import Model.Categoria;
import Model.Chamado;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.LinhasDaTBL;


public class ChamadoDB {
    private Connection con = null;

    public ChamadoDB() {
         con = ConnectionFactory.getConnection();
    }
    
    public boolean insert(Chamado chamado){
        PreparedStatement stmt  = null;
        String sql = "INSERT INTO chamado (titulo, descricao,  situacao_id, data,  categoria_id, usuario_id, ativo)  values (?, ?, ?, ?, ?, ?, 1)";
        
       
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, chamado.getTitulo());
            stmt.setString(2, chamado.getDescricao());
            stmt.setInt(3, chamado.getSituacao());
            stmt.setString(4, chamado.getData());
            stmt.setInt(5, chamado.getIDCategoria());
            stmt.setInt(6, 1);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir o chamado:" +chamado.getTitulo() +ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
    
    public boolean delete(int id){
         
        PreparedStatement stmt  = null;
        String sql = "DELETE from chamado WHERE chamado_id = (?) ";
        
        try {
            stmt = con.prepareCall(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir o chamado" +ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    public void solucaoChamado(Chamado chamado ){
        
         PreparedStatement stmt  = null;
        String sql = "UPDATE chamado set tecnico_id=(?), solucao=(?) where chamado_id  = (?)";
        
        try {
            stmt = con.prepareCall(sql);
            stmt.setInt(1, chamado.getIDUsuario());
            stmt.setString(2, chamado.getSolucao());
            stmt.setInt(3, chamado.getId());
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir o chamado" +ex);
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<LinhasDaTBL> listarChamados(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
            String sql ="SELECT ch.chamado_id , ch.titulo, ch.data, cad.descricao, situ.nome, user.nome\n" +
    "      from chamado ch, cad_categoria cad, usuario user  JOIN cad_situacao situ \n" +
    "      WHERE ch.categoria_id = cad.categoria_id  AND ch.situacao_id = situ.situacao_id\n" +
    "      AND ch.usuario_id = user.usuario_id";
        List<LinhasDaTBL> lista = new ArrayList<LinhasDaTBL>();

        try {
             stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                LinhasDaTBL dado = new LinhasDaTBL();
            dado.setChamadoID(rs.getInt("chamado_id"));
            dado.setChamadoTitulo(rs.getString("titulo"));
            dado.setSituacaoChamado(rs.getString("nome"));
            dado.setCategoriaChamado(rs.getString("descricao"));
            dado.setDataAbertura(rs.getString("data"));
            dado.setRequerente(rs.getString("user.nome"));
            lista.add(dado);
            };
                    
        } catch (SQLException ex) {
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
        
        return lista;
    }
    
    
    public List<LinhasDaTBL> buscarChamado(int situacao_id){
         PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql ="SELECT ch.chamado_id , ch.titulo, ch.data, cad.descricao, situ.nome, user.nome\n" +
"      from chamado ch, cad_categoria cad, usuario user  JOIN cad_situacao situ \n" +
"      WHERE ch.categoria_id = cad.categoria_id  AND ch.situacao_id = situ.situacao_id\n" +
"      AND ch.usuario_id = user.usuario_id AND ch.situacao_id = (?)";
                List<LinhasDaTBL> lista = new ArrayList<LinhasDaTBL>();

        try {
             stmt = con.prepareCall(sql);
             stmt.setInt(1, situacao_id);
            rs = stmt.executeQuery();
            while(rs.next()){
                 LinhasDaTBL dado = new LinhasDaTBL();
            dado.setChamadoID(rs.getInt("chamado_id"));
            dado.setChamadoTitulo(rs.getString("titulo"));
            dado.setSituacaoChamado(rs.getString("nome"));
            dado.setCategoriaChamado(rs.getString("descricao"));
            dado.setDataAbertura(rs.getString("data"));
            dado.setRequerente(rs.getString("user.nome"));
            lista.add(dado);
             
            };
            
            
        } catch (SQLException ex) {
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return  lista;
    }
    
    
    public boolean inserirTecnico(int tec_id, int chamado_id){
        PreparedStatement stmt  = null;
        String sql = "UPDATE chamado SET tecnico_id =(?) WHERE chamado_id = (?)";
        
        try {
            stmt = con.prepareCall(sql);
            stmt.setInt(1, tec_id);
            stmt.setInt(2, chamado_id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro" +ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    public List<LinhasDaTBL> chamadoDoTecnico(int tecnico_id){
         PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql ="SELECT ch.chamado_id , ch.titulo, ch.data, cad.descricao, situ.nome, user.nome\n" +
"      from chamado ch, cad_categoria cad, usuario user  JOIN cad_situacao situ \n" +
"      WHERE ch.categoria_id = cad.categoria_id  AND ch.situacao_id = situ.situacao_id\n" +
"      AND ch.usuario_id = user.usuario_id AND tecnico_id = (?)";
      List<LinhasDaTBL> lista = new ArrayList<LinhasDaTBL>();
        try {
             stmt = con.prepareCall(sql);
             stmt.setInt(1, tecnico_id);
            rs = stmt.executeQuery();
            while(rs.next()){
                 LinhasDaTBL dado = new LinhasDaTBL();
            dado.setChamadoID(rs.getInt("chamado_id"));
            dado.setChamadoTitulo(rs.getString("titulo"));
            dado.setSituacaoChamado(rs.getString("nome"));
            dado.setCategoriaChamado(rs.getString("descricao"));
            dado.setDataAbertura(rs.getString("data"));
            dado.setRequerente(rs.getString("user.nome"));
            lista.add(dado);
            };
            
            
        } catch (SQLException ex) {
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return  lista;
    }
     public List<LinhasDaTBL> chamadoDoRequerente(int usuario_id){
         PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql ="SELECT ch.chamado_id , ch.titulo, ch.data, cad.descricao, situ.nome, user.nome\n" +
"      from chamado ch, cad_categoria cad, usuario user  JOIN cad_situacao situ \n" +
"      WHERE ch.categoria_id = cad.categoria_id  AND ch.situacao_id = situ.situacao_id\n" +
"      AND ch.usuario_id = user.usuario_id AND tecnico_id = (?)";
        List<LinhasDaTBL> lista = new ArrayList<LinhasDaTBL>();
        try {
             stmt = con.prepareCall(sql);
             
             stmt.setInt(1,1);
            rs = stmt.executeQuery();
           while(rs.next()){
                 LinhasDaTBL dado = new LinhasDaTBL();
            dado.setChamadoID(rs.getInt("chamado_id"));
            dado.setChamadoTitulo(rs.getString("titulo"));
            dado.setSituacaoChamado(rs.getString("nome"));
            dado.setCategoriaChamado(rs.getString("descricao"));
            dado.setDataAbertura(rs.getString("data"));
            dado.setRequerente(rs.getString("user.nome"));
            lista.add(dado);
            };

            
            
        } catch (SQLException ex) {
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return  lista;
    }

}
