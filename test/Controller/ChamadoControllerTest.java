/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DB.ChamadoDB;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas Knabben
 */
public class ChamadoControllerTest {
    
    public ChamadoControllerTest() {
        ChamadoController ch = new ChamadoController();
        ch.listarChamados();
    }

    @Test
    public void testSomeMethod() {
    }
    
}
