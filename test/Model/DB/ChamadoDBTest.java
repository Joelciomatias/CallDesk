/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DB;

import Model.Categoria;
import Model.Chamado;
import Model.Usuario;
import static org.junit.Assert.fail;
import org.junit.Test;


/**
 *
 * @author K
 */
public class ChamadoDBTest {
    
    public ChamadoDBTest() {
    }

    @Test
    public void inserirChamado() {
       ;
        
        Categoria c1 =  new Categoria("Hardware");
        Chamado chamado = new Chamado();
        Usuario user = new Usuario();
        /*
        user.setId(1);
        user.setNome("Lucas");
        chamado.setCategoria(c1);
        chamado.setTitulo("Trocar o mouse");
        chamado.setDescricao("Mouse parou de fundionar solicito a troca");
        chamado.setStatus(1);
        chamado.setUsuario(user);
        chamado.setId(2);
        /**/
        ChamadoDB db = new ChamadoDB();
        db.delete(2);
   
    }
}
