/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona p1 = new Persona();
    
    public void ingresarPersona(){
        
        System.out.print("Ingrese el Nombre: ");
        p1.setNombre(leer.next());
        System.out.print("Ingrese la edad: ");
        p1.setEdad(leer.nextInt());
        
    }
    
    public void mostrarPersona(){
        
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Edad: " + p1.getEdad());
    }
    
    
    
}
