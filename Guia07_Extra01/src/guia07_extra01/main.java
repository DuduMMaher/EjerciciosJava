/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07_extra01;

import guia07_extra01.Entidades.Cancion;

/**
 *
 * @author dudum
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        
        Cancion c1 =new Cancion();
        
        
        
        System.out.println(c1.getAutor());
        c1.setAutor("Jose");
        
        System.out.println(c1.getAutor());
    }
    
}
