/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia09_ej04;

import Servicios.FechaService;
import java.util.Date;

/**
 *
 * @author dudum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    
    FechaService fs=new FechaService();
    
    Date dn= new Date();
    Date fechaActual= new Date();

    dn= fs.fechaNacimiento();
    fechaActual= fs.fechaActual();
    
 //       System.out.println(fechaActual);
      System.out.println(fs.diferencia(dn, fechaActual));
    
        System.out.println(dn.toString());
        
    
    
    
    }
    
}
