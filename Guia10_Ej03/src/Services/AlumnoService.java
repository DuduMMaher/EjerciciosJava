/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class AlumnoService {
    
    
    Scanner leer = new Scanner(System.in);
    
    public Alumno crearAlumno(){
        
        System.out.println("Ingrese el nombre del Alumno");
        String alumno = leer.next();
        return new Alumno(alumno);
    }
    
    
    public ArrayList<Double> crearNotas(){
        
        ArrayList<Double> notas = new ArrayList();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota Nro " + (i+1));
            notas.add(leer.nextDouble());
        }
        
        return notas;
        
    }
    
    public void mostrarAlumnos(ArrayList<Alumno> list){
        
        for (Alumno object : list) {
            System.out.println(object);
            for (Double notas : object.getNotas()) {
                System.out.print(notas + "  ");
            }
            System.out.println("");

        }
            }
    
    public double notaFinal(ArrayList<Alumno> list){
        
        double prom=0;
        double notaX=0;
        boolean ref=false;
        
        String nombre= buscarAlumno(list);
        System.out.println(nombre);
       
        
        if (!nombre.equals("")) {
            
        for (Alumno alumno : list) {
            if (nombre.equals(alumno.getNombre())) {
                for (Double notas : alumno.getNotas()) {
                    notaX= notaX+notas;
                }
               prom= notaX/alumno.getNotas().size();
                }
            }
            
         } else {
            System.out.println("El Alumno no existe");
            prom=101;
        }
        
            return prom;
            
        }
        
    private String buscarAlumno(ArrayList<Alumno> list){
        
        boolean ref=false;
        System.out.println("Ingrese el nombre del alumno");
        String nombre = leer.next();
        
        for (Alumno alumno : list) {
            
            if (nombre.equals(alumno.getNombre())){
                ref=true;
            } 
        }
        if (ref) {
            return nombre;
        } else {
            return "";
        }
        
        
    }
    
    
    
        }
        
        
   
    
    

