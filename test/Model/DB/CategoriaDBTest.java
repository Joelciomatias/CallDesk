/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DB;

import Model.Categoria;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author K
 */
public class CategoriaDBTest {
    
    public CategoriaDBTest() {
    }

    @Test
    public void inserir() {
        Categoria cat = new Categoria("Problema com hardware");
        CategoriaDB db =  new CategoriaDB();
        if(db.insert(cat)){
            System.out.println("Sucesso ao cadastrar a categoria " +cat.getDescricao());
        }else{
            fail("Erro ao cadastrar a categoria " +cat.getDescricao());
        }
        
    }
    
}
