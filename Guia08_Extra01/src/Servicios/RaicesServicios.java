/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class RaicesServicios {
    
    Scanner leer = new Scanner(System.in);
    
    public Raices insertarValores(){
    
        System.out.println("Ingrese los valores para a, b y c");
        double a=leer.nextDouble();
        double b=leer.nextDouble();
        double c=leer.nextDouble();
        
        return new Raices(a, b, c);
    }
    
    public double getDiscriminante(Raices r){
        
        double a=r.getA();
        double b=r.getB();
        double c=r.getC();
        
        return ((Math.pow(r.getB(), 2))-(4*r.getA()*r.getC()));
    }
    
    public boolean tieneRaices(double d){
        
        boolean dosOMasSoluciones;
        
        dosOMasSoluciones = d>0;
        
        return dosOMasSoluciones;
    }
    public boolean tieneRaiz(double d){
        
        boolean unicaSolucion;
        
        unicaSolucion = d == 0;
        
        return unicaSolucion;
    }
    
    public void obtenerRaices(Raices r){
        
        double disc=getDiscriminante(r);
        boolean d=tieneRaices(disc);
        if (d){
            
            double resultado1 = (((-1)*r.getB())+ Math.sqrt(disc))/(2*r.getA());
            double resultado2 = (((-1)*r.getB())- Math.sqrt(disc))/(2*r.getA());
            System.out.println(resultado1);
            System.out.println(resultado2);
        } else {
            System.out.println("No tiene raices");
        }
    }
    
    
    public void obtenerRaiz(Raices r){
        
        double disc=getDiscriminante(r);
        boolean d=tieneRaiz(disc);
        if (d){
            
            double resultado1 = (((-1)*r.getB())+ Math.sqrt(disc))/(2*r.getA());
      
            System.out.println(resultado1);
         
        } else {
            System.out.println("No tiene raiz");
        }
    
    }
    public void calcular(Raices r){
        
        
        double disc=getDiscriminante(r);
        boolean raiz= tieneRaiz(disc);
        boolean raices=tieneRaices(disc);
        
        if (raices) {
            double resultado1 = (((-1)*r.getB())+ Math.sqrt(disc))/(2*r.getA());
            double resultado2 = (((-1)*r.getB())- Math.sqrt(disc))/(2*r.getA());
            System.out.println(resultado1);
            System.out.println(resultado2);
        } else if (raiz) {
             double resultado1 = (((-1)*r.getB())+ Math.sqrt(disc))/(2*r.getA());
             System.out.println(resultado1);
        } else {
            System.out.println("NO TIENE SOLUCION");
        }
        
        
        
    }
    
    
    
    
    
    }
    
    
    
    
    
    

