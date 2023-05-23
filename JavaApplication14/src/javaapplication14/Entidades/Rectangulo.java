/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14.Entidades;

/**
 *
 * @author dudum
 */
public class Rectangulo {
    
    private int lado1;
    private int lado2;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public int calcular_area(){
        
        int area=lado1*lado2;
        return area;
    }
    
    public void imprimirRectangulo(){
        
        for (int i = 0; i < lado1; i++) {
            if (i==0 || i==(lado1-1)) {
                for (int j = 0; j < lado2; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < lado2; j++) {
                    if (j==0 || j==(lado2-1)) {
                        System.out.print("* ");
                    }else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
        
    }
    
    
}
