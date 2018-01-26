/*
 *  Essa classe tem os metodos referentes a classe Categoria.
 */
package Controller;

import Model.Categoria;
import Model.DB.CategoriaDB;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author K
 */
public class CategoriaController {
    
    public List<Categoria> selecionarCategorias(){
        CategoriaDB dbCategoria =  new CategoriaDB();
        List<Categoria> cat = (List<Categoria>) dbCategoria.getList();
        return cat;
         
        
    }
    
    public boolean inserirCategoria(String descricao){
        CategoriaDB db = new CategoriaDB();
        Categoria categoria = new Categoria(descricao);
        db.insert(categoria);
        return true;
    }
    
    public boolean atualizarCategoria(int id, String descricao){
      CategoriaDB db = new CategoriaDB();
      db.update(id, descricao);
      return true;
    }
    public boolean deletarCategoria(int categoria_id){
        CategoriaDB db = new CategoriaDB();
        db.delete(categoria_id);
        return true;
    }
}
