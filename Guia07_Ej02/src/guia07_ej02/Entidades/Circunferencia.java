/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07_ej02.Entidades;

import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Circunferencia {
    
    private double radio;
    
    //Método constructor que inicialice el radio pasado como parámetro.

   

    public Circunferencia(double rad) {
        this.radio = rad;
    }

    public double getRadio() {
        
        radio=8;
        
        return radio;
    }

    public void setRadio(double rad) {
        this.radio = rad;
    }

    
   // Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
public void crearCircunferencia(){
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("cual es el radio");
     radio=leer.nextDouble();
     
    
}

    public Circunferencia() {
    }
    public double calcularArea(){
        
        double area= Math.PI*(radio*radio);
        return area;
        
        
    }    
    
    public double calcularCircunferencia(){
        
        
        double circunferencia=Math.PI*2*radio;
        return circunferencia;
        
    }
    



}
