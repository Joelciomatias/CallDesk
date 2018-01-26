/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author lucas
 */
public class DataAtual {
    public static String getDataAtual()   
{  
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
    Calendar c = Calendar.getInstance();    
    return df.format(c.getTime()); 
}
    
}
