/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interador_java_01;

import Entidades.Estudiantes;
import Servicies.EstudiantesService;
import java.util.Scanner;

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

        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Cuantos estudiantes son");
        int cant=leer.nextInt();
        
        Estudiantes[] es = new Estudiantes[cant];
        EstudiantesService ess = new EstudiantesService();
        double promNotas;
        int largo;

       for (int i = 0; i < cant; i++) {
            es[i] = ess.crearEstudiantes();
       }

        promNotas = ess.calcularPromedio(es);

        largo = ess.estudiantesSobrePromedio(es, promNotas).length;
        String[] alumnosSobreProm = new String[largo];
        alumnosSobreProm = ess.estudiantesSobrePromedio(es, promNotas);

        System.out.println("");
        System.out.println("El promedio de notas es: " + String.format("%.2f", promNotas));
        
        for (int i = 0; i < largo; i++) {
            System.out.println(alumnosSobreProm[i]+ " " + ess.mostrarNota(es, alumnosSobreProm[i]));
        }
        
    }

}
