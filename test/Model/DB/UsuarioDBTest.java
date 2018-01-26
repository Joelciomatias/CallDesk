/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DB;

import Model.DB.UsuarioDB;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class UsuarioDBTest {
    
    public UsuarioDBTest() {
    }

    @Test
    public void testSomeMethod() {
        UsuarioDB db = new UsuarioDB();
        db.verificaEmail("admin");
    }
    
}
