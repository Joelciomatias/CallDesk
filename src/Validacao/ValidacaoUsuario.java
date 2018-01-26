/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacao;

import Connection.ConnectionFactory;
import Model.DB.UsuarioDB;
import java.sql.Connection;
import javax.swing.JPanel;

/**
 *
 * @author K
 */
public class ValidacaoUsuario {
    private Connection con = null;
    
    public ValidacaoUsuario() {
         con = ConnectionFactory.getConnection();
    }
    
    public boolean verificaExistente(String email){
        UsuarioDB dbUser = new UsuarioDB();
        boolean resultado;
        resultado = dbUser.verificaEmail(email);
        if(resultado == true){
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }
}
