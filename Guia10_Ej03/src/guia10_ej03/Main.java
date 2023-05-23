/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_ej03;

import Entities.Alumno;
import Services.AlumnoService;
import java.util.ArrayList;

/**
 *
 * @author dudum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Alumno alum = new Alumno();
    AlumnoService alumS = new AlumnoService();
    
    ArrayList<Alumno> ListAlumnos = new ArrayList();
    
        for (int i = 0; i < 3; i++) {
            
        
    ListAlumnos.add(alumS.crearAlumno());
    }
    alumS.mostrarAlumnos(ListAlumnos);
    
    
        for (int i = 0; i < 3; i++) {
            
        
    double prom = alumS.notaFinal(ListAlumnos);
            if (prom != 101) {
                System.out.printf("%.2f\n", prom);
                
            }
    

            
    }
    }
    
}