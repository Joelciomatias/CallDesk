/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class UsuarioLogado {
    private ArrayList<Usuario> usuarioLogado = new ArrayList<Usuario>();
    
    
    
    public ArrayList<Usuario> recebeUsuarioLogado(ArrayList<Usuario> usuario){
    usuarioLogado = usuario;
    return usuarioLogado;
}

    public ArrayList<Usuario> getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(ArrayList<Usuario> usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
    
    
}
