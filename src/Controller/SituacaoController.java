/*
    Essa classe tem os metodos referentes a classe situação.
 */
package Controller;

import Model.DB.SituacaoDB;
import Model.Situacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author K
 */
public class SituacaoController {
     public boolean criarSituacao(String descricao){
        Situacao situ = new Situacao(descricao);
        SituacaoDB db = new SituacaoDB();
        db.insert(situ);
        return true;
    }
     
     public void atualizarSituacao(String descricao, int id){
         Situacao situ = new Situacao(descricao);
         SituacaoDB db = new SituacaoDB();
         db.update(descricao, id);
     }
    
     public void deletarSituacao(int id){
         SituacaoDB situDB = new SituacaoDB();
         situDB.delete(id);
     }
     
    public List<Situacao> selecionarSituacao(){
        SituacaoDB situDB =  new SituacaoDB();
        
        return situDB.getList();
         
        
    }
}
