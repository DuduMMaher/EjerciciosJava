/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_ej03_hashset;

import Entities.Alumno;
import Services.AlumnoService;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una
 * lista de tipo Integer con sus 3 notas. En el servicio de Alumno deberemos
 * tener un bucle que crea un objeto Alumno. Se pide toda la información al
 * usuario y ese Alumno se guarda en una lista de tipo Alumno y se le pregunta
 * al usuario si quiere crear otro Alumno o no. Después de ese bucle tendremos
 * el siguiente método en el servicio de Alumno: Método notaFinal(): El usuario
 * ingresa el nombre del alumno que quiere calcular su nota final y se lo busca
 * en la lista de Alumnos. Si está en la lista, se llama al método. Dentro del
 * método se usará la lista notas para calcular el promedio final de alumno.
 * Siendo este promedio final, devuelto por el método y mostrado en el main.
 *
 * @author dudum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashSet<Alumno> AlumnoList = new HashSet();
        AlumnoService as = new AlumnoService();

        String opc;
        int opc2;

        do {

            System.out.println("Menu");
            System.out.println("---------");
            System.out.println("1.- Ingresar Alumnos");
            System.out.println("2.- Ver nota de un alumno");
            System.out.println("3.- ver todas las notas");
            System.out.println("4.- Final");
            System.out.println("");

            opc2 = leer.nextInt();

            switch (opc2) {
                case 1:
                    do {
                        AlumnoList.add(as.ingresarAlumno());

                        System.out.println("Desea ingresar otro Alumno (S/N)");
                        opc = leer.next();
                    } while (!opc.equalsIgnoreCase("N"));
                    break;
                case 2:
                    as.verNotaAlumno(AlumnoList);
                    break;
                case 3:
                    as.verListado(AlumnoList);
                    break;
                case 4:
                    break;
            }

        } while (opc2 != 4);

    }

}
