/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import javaapplication14.Entidades.Rectangulo;

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
        
     
       Rectangulo r1 = new Rectangulo(4,6);
       
        System.out.println("El area es: " + r1.calcular_area());
        
        System.out.println("");
        
        r1.imprimirRectangulo();
        
    }
    
}
