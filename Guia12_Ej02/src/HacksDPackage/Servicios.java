/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HacksDPackage;

import Enums.Apellidos;
import Enums.Nombres;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kinoc
 */
public class Servicios {
   
    Scanner leer = new Scanner(System.in);
     Random nom = new Random();
    
    
   public int validarEntero() {
        while (true) {
            try {
                return Integer.parseInt(leer.next());
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un numero entero valido.\n");
            }
        }
    }
    
   public double validarDouble() {
        while (true) {
            try {
                return Double.parseDouble(leer.next());
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un numero valido.\n");
            }
        }
    }
   public String validarString() {
    String entrada = leer.next();
    while (entrada.isEmpty()) {
        System.out.print("Ingrese un valor válido.\n");
        entrada = leer.next();
    }
    return entrada;
}
    
    public String nombre(){
        
        return Nombres.values()[nom.nextInt(Nombres.values().length)].name();
    }
 
    public String apellido(){
        
        return Apellidos.values()[nom.nextInt(Apellidos.values().length)].name();
        
    }
    
    public String apellidoNombre(){
        
        return apellido() + ", " + nombre();
    }
    
    public String nombreApellido(){
        
        return nombre() + " " + apellido();
        
    }
    
    public int generarDni(){
        int dni;
        do{
            dni = nom.nextInt(50000000);
        } while (dni<15000000);
        return dni;
    }
}
    
    
    
