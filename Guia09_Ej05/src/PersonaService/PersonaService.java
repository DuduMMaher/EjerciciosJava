/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaService;

import Entidades.Persona;
import java.util.Date;

import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
   
    public Persona crearPersona(){
        
        System.out.println("Ingrese el nombre de la Persona: ");
        String nombre = leer.next();
//        System.out.println("Ingrese Dia de Nacimiento: ");
//        int dia = leer.nextInt();
//        System.out.println("Ingrese el mes: ");
//        int mes= leer.nextInt();
//        mes--;
//        System.out.println("Ingrese el año: ");
//        int anio = leer.nextInt();
//        anio= anio-1900;
        
//        return new Persona (nombre, new Date(anio, mes, dia));
return new Persona(nombre);
    }
    
    
    public Date fechaNacimiento(){
        
        System.out.println("Ingrese Dia de Nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes= leer.nextInt();
        mes--;
        System.out.println("Ingrese el año: ");
        int anio = leer.nextInt();
        anio= anio-1900;
        
        return new Date (anio, mes, dia);
    }
    public void calcularEdad(Persona p){
        
       int edad = (new Date().getYear())  -(p.getNacimiento().getYear());
        
        System.out.println("La edad es " + edad);
    }
    
    public boolean menorQue(Persona p, int anio){
        
        boolean menor= false;
        
        if ((new Date().getYear())  -(p.getNacimiento().getYear())< anio) {
            menor=true;
        }
        
        return menor;
    }
    
}
