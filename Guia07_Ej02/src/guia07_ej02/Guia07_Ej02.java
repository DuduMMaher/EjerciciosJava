/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07_ej02;

import guia07_ej02.Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Guia07_Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner leer = new Scanner(System.in);
        
     System.out.println("cual es el radio");
     double rad=leer.nextDouble();
        
    Circunferencia m1 = new Circunferencia(rad);
   
   


        System.out.println("El area es: " + String.format("%.2f", m1.calcularArea()));
    
        System.out.println("El perimetro es: " + String.format("%.2f", m1.calcularCircunferencia()));
    
    
        Circunferencia m2 = new Circunferencia();
        
        m1.crearCircunferencia();
        
        
 //       m1.setRadio(8);
        
 //       System.out.println(m1.getRadio());
        
        System.out.println("El area es: " + String.format("%.2f", m1.calcularArea()));
    
        System.out.println("El perimetro es: " + String.format("%.2f", m1.calcularCircunferencia()));
        
        
    }
    
}
