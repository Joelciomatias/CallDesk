/*
 * Essa classe tem os metodos referentes a classe Usuario
 * 
 * 
 */
package Controller;

import Model.DB.UsuarioDB;
import Model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author K
 */
public class UsuarioController extends Usuario{

    
    private Usuario usuarioLogado;
    
    public UsuarioController() {
       
    }
    
    
    public void cadastrarUsuario(String nome, String setor, String email, int ramal, String senha, int tipo){
        Usuario user = new Usuario(nome, setor, email, ramal, senha, tipo);
        UsuarioDB userDB = new UsuarioDB();
        userDB.insert(user);
    }
    
    public void deletarUsuario(int id){
        UsuarioDB dbUser = new UsuarioDB();
        dbUser.delete(id);
    }
    
    public List<Usuario> listarUsuarios(){
        UsuarioDB dbUser = new UsuarioDB();
        List<Usuario> listaUsuarios = dbUser.read();
        return listaUsuarios;
    }
    
    public void atualizarCadastro(int id,String nome, String setor, String email, int ramal, String senha, int tipo){
        UsuarioDB dbUser = new UsuarioDB();
        dbUser.update(id, nome, setor, email, ramal, senha, tipo);
      
    }
    public ArrayList<Usuario> logar(String email,String senha){
        UsuarioDB db = new UsuarioDB();
        
        ArrayList<Usuario> usuarios = db.realizarLogin(email, senha);
        
        if(usuarios != null && usuarios.size() == 1) {
            this.usuarioLogado = usuarios.get(0);
        }
        
        return usuarios;
    }
    
    public Usuario usuarioLogado() {
        return this.usuarioLogado;
    }
}
