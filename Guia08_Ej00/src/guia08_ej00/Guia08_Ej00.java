/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia08_ej00;

import Servicios.PersonaServicio;

/**
 *
 * @author dudum
 */
public class Guia08_Ej00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        PersonaServicio ps1 = new PersonaServicio();
        
        ps1.ingresarPersona();
        ps1.mostrarPersona();
        
    }
    
}
