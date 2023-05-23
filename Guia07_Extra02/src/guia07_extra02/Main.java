/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07_extra02;

import guia07_extra02.Entidades.Puntos;

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
   
    
    Puntos p1 = new Puntos();
    
    
    p1.crearPuntos();
    
        System.out.println(String.format("%.2f", p1.calcularDistancia()));
    }
    
}
