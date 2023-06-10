/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12_ej04;

import Entities.Circulo;
import Entities.Rectangulo;

/**
 *
 * @author dudum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Circulo circ = new Circulo(5.0);
        Rectangulo rect = new Rectangulo(5.0, 6.0);
        
        
        
        
        System.out.println("Area Circulo: " + circ.calculoArea());
        System.out.println("Perimetro Circulo: " + circ.caluculoPerimetro());
        System.out.println("Area Rectangulo: " + rect.calculoArea());
        System.out.println("Perimetro Rectangulo: " + rect.caluculoPerimetro());
    }
    
}
