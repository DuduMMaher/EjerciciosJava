/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicies;

import Entidades.Estudiantes;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class EstudiantesService {

    Scanner leer = new Scanner(System.in);

    public Estudiantes crearEstudiantes() {

        System.out.println("Ingrese el nombre del Estudiante");
        String nombre = leer.next();
        System.out.println("Ingrese la nota del final");
        double nota = leer.nextDouble();

        return new Estudiantes(nombre, nota);

    }

    public double calcularPromedio(Estudiantes[] es) {

        double sumaNotas = 0;

        for (int i = 0; i < es.length; i++) {
            sumaNotas = sumaNotas + es[i].getNota();
        }
        return sumaNotas / es.length;
    }

    public String[] estudiantesSobrePromedio(Estudiantes[] es, double prom) {

        int cont = 0;

        for (int i = 0; i < es.length; i++) {
            if (es[i].getNota() > prom) {
                //              System.out.println("El Alumno " + es[i].getNombre() + " esta sobre el promedio");
                cont++;

            }
        }
        String[] sobreProm = new String[cont];
        cont = 0;
        for (int i = 0; i < es.length; i++) {
            if (es[i].getNota() > prom) {
                sobreProm[cont] = es[i].getNombre();
                cont++;
            }
        }
        return sobreProm;
    }

    public double mostrarNota(Estudiantes[] es, String nombre){
        
        for (int i = 0; i < es.length; i++) {
            if (nombre.equals(es[i].getNombre())) {
                return es[i].getNota();
            }
            
            
        }
        
        return 101;
        
    }
    
    
    
}
