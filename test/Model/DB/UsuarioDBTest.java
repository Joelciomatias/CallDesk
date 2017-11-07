/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DB;

import Model.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author K
 */
public class UsuarioDBTest {
    
    public UsuarioDBTest() {
    }

    @Test
    public void inserirUsuario() {
        Usuario user = new Usuario("Lucas", "TI", "l.knaabaabasen@hotmail.com", "0152");
        UsuarioDB db = new UsuarioDB();
        if(db.insert(user)){
            System.out.println("Uusario " +user.getNome()+ " Cadastrado com sucesso");
        }else{
            System.out.println("Erro ao cadastrar o usuario " +user.getNome());
        }
    }
    
}
