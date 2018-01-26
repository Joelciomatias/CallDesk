/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacao;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class ValidacaoUsuarioTest {
    
    public ValidacaoUsuarioTest() {
    }

    @Test
    public void testSomeMethod() {
        ValidacaoUsuario val = new ValidacaoUsuario();
        val.verificaExistente("admin");
    }
    
}
