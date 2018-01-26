/*
 * Essa classe tem os metodos referentes a classe chamado
 */
package Controller;

import Model.Chamado;
import Model.DB.ChamadoDB;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import model.LinhasDaTBL;

/**
 *
 * @author K
 */
public class ChamadoController {
    
    public boolean abrirChamado(String titulo, String descricao, int IDcategoria,int situacao_id, String data, int IDusuario){
        Chamado ch1 = new Chamado(titulo, descricao, IDcategoria, situacao_id, data, IDusuario);
        ChamadoDB db = new ChamadoDB();
        db.insert(ch1);
        return true;
    }
    
    public List<LinhasDaTBL> listarChamados(){
        ChamadoDB db = new ChamadoDB();
        return db.listarChamados();
    }

    public List<LinhasDaTBL> chamadosRequerente(int usuario_id){
        ChamadoDB db = new ChamadoDB();
        return db.chamadoDoRequerente(usuario_id);
        
    }
    
  
    /*
    public ArrayList tipoBusca(){
        ArrayList tipoBusca = new ArrayList();
        String vet [] ={"Novo","Finalizado"};
        tipoBusca.add(vet);
        return tipoBusca;
    }
    */
    public List<LinhasDaTBL> buscarChamado(int situacao){
        
        ChamadoDB db = new ChamadoDB();
        List chamados = db.buscarChamado(situacao);
        return chamados;
    }
    
    public boolean inserirTecnico(int tec_id, int chamado_id){
        ChamadoDB db = new ChamadoDB();
        db.inserirTecnico(tec_id, chamado_id);
        return true;
    }
    public List<Chamado> chamadoDoTecnico(int tecnico_id){
        ChamadoDB db = new ChamadoDB();
        List chamados = db.chamadoDoTecnico(tecnico_id);
        return chamados;
    }
    
    public void inserirSolucao(Chamado chamado){
       ChamadoDB db = new ChamadoDB();
       db.solucaoChamado(chamado);
       
    }
}
