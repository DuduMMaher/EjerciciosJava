/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07_ej04;

import guia07_ej04.Entidades.Rectangulo;

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
        
        
        Rectangulo m1 = new Rectangulo();
        
        
        m1.crearRectangulo();
        
        System.out.println("El Area es: " +m1.calcularArea());
        System.out.println("El perimetro es: " + m1.calcularPerimetro());
        
        m1.imprimeRectangulo();
        
        
    }
    
}
