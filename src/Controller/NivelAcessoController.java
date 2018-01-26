/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DB.NivelAcessoDB;
import java.util.ArrayList;
import java.util.List;
import model.NivelAcesso;

/**
 *
 * @author joelc
 */
public class NivelAcessoController {
   public List<NivelAcesso> listarNivelDeAcesso(){
        NivelAcessoDB db =  new NivelAcessoDB();
        List<NivelAcesso> list = (List<NivelAcesso>)  db.getList();
        return list;
       
   }
   
    
}
