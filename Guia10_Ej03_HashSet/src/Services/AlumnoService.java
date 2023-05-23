/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Alumno;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class AlumnoService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public HashSet<Double> ingresarNotas;
    Iterator itAlumnos;

   public Alumno ingresarAlumno(){
       
       System.out.println("Ingrese el nombre del Alumno");
       String nombre = leer.next();
       
       return new Alumno (nombre);
   }

    public HashSet<Double> ingresarNotas() {
        ingresarNotas=new HashSet();
        
        System.out.println("Usted va a ingresar las tres notas");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota " + (i+1));
            ingresarNotas.add(leer.nextDouble());
        }
        return ingresarNotas;
    }

    public void verNotaAlumno(HashSet<Alumno> AlumnoList) {
        
        
        boolean ref=false;
        System.out.println("Ingrese El nombre del alumno del cual quiere calcular el promedio");
        String nombre = leer.next();
        
        HashSet<Double> notas2 = new HashSet();
        double calificaciones=0;
      
        for (Alumno alumno : AlumnoList) {
            if (alumno.getAlumno().equalsIgnoreCase(nombre)){
                ref=true;
                notas2= alumno.getNotas();
                for (Double double1 : notas2) {
                    calificaciones = calificaciones + double1;
                }
            }
            
        }
        if (ref){
            System.out.println("La nota Promedio de " + nombre + " es de " + String.format("%.2f", (calificaciones/3)));
        } else {
            System.out.println("El alumno ingresado no existe");
        }
        
        
        
        
        
    }

    public void verListado(HashSet<Alumno> AlumnoList) {
        
        for (Alumno alumno : AlumnoList) {
            System.out.println("Alumno " + alumno.getAlumno());
            HashSet<Double> resultados = alumno.getNotas();
            for (Double resultado : resultados) {
                System.out.print(resultado + " / ");
            }
            System.out.println("");
        }
    }
    
}
