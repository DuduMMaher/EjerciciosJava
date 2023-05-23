/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_ej01;

import Services.PerroService;

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
  
    PerroService ps = new PerroService();
    boolean ref;
    
    
    
    ps.crearPerros();
    
    ref=ps.siEstaPerro();
        if (ref) {
            System.out.println("El perro fue borrado");
        } else {
            System.out.println("El perro ingresado no esta en la lista");
        }
    ps.mostrarPerros();
        
        
    }
    
}
