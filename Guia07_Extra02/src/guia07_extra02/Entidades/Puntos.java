/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07_extra02.Entidades;

import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Puntos {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Puntos() {
    }

    public Puntos(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese coordenadas Punto 1");
        x1=leer.nextInt();
        y1=leer.nextInt();
        System.out.println("Ingrese coordenadas Punto 2");
        x2=leer.nextInt();
        y2=leer.nextInt();
        
    }    
    
    public double calcularDistancia(){
        
        int distX=x2-x1;
        int distY=y2-y1;
        
        if (distX<0){
            distX=(distX*(-1));
        }
        if (distY<0){
            distY=(distY*(-1));
        }
        
        double x=distX*distX;
        double y=distY*distY;
       
        return Math.sqrt(x+y);
        
    }
    
}
