/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11_extra04;

import java.util.Scanner;
import java.util.ArrayList;
import Entities.Alumno;
import Entities.Voto;
import HacksDPackage.Servicios;
import Services.Simulador;

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

        Servicios serv = new Servicios();
        Simulador sim = new Simulador();
        ArrayList<String> alumnoArray = new ArrayList();
        ArrayList<Integer> dniArray = new ArrayList();
        Scanner leer = new Scanner(System.in);
        ArrayList<Alumno> aluArray = new ArrayList();
        
        ArrayList<Voto> votaciones = new ArrayList();

        int opc;
        do {
            System.out.println("MENU");
            System.out.println("--------");
            System.out.println("1.- Ingresar Alumnos");
            System.out.println("2.- Mezclar Lista Alumnos");
            System.out.println("3.- Generar DNI");
            System.out.println("4.- Asignar DNI a Lista Alumnos");
            System.out.println("5.- Imprimir Listado Alumnos");
            System.out.println("6.- Generar votacion");
            System.out.println("7.- Ver Votaciones");
            System.out.println("8.- Titulares y Suplentes");
            System.out.println("9.- Salir");

            opc = serv.validarEntero();

            switch (opc) {

                case 1:
                    String opc2;
                    do {
                        alumnoArray.add(sim.ingresarAlumno());
                        System.out.println("Desea Ingresar otro Alumno? (S/N)");
                        opc2 = leer.next();
                    } while (!opc2.equalsIgnoreCase("N"));
                    for (String aux : alumnoArray) {
                        System.out.println(aux);
                    }
                    System.out.println("");
                    break;
                case 2:
                    sim.mezclarLista(alumnoArray);
                    for (String aux : alumnoArray) {
                        System.out.println(aux);
                    }
                    break;
                case 3:
                    int dni;
                    for (int i = 0; i < alumnoArray.size(); i++) {
                        do {
                            dni = sim.generadorDni();
                        } while (dniArray.contains(dni));
                        dniArray.add(dni);
                    }
                    for (Integer aux : dniArray) {
                        System.out.println(aux);
                    }
                    break;
                case 4:
                    for (int i = 0; i < alumnoArray.size(); i++) {
                        aluArray.add(sim.asignarDni(alumnoArray, dniArray, i));
                    }
                    break;
                case 5:
                    sim.imprimirAlumnos(aluArray);
                    break;
                case 6:
                    for (int i = 0; i < aluArray.size(); i++) {
                        ArrayList<Alumno> alumnoVotado = new ArrayList();
                        votaciones.add(sim.votacion(aluArray, alumnoVotado, i));
                    }
                    
                    break;
                case 7:
                    sim.verVotaciones(aluArray, votaciones);
                    break;
                case 8:
                    sim.titularesSuplentes(aluArray);
                    break;
                    

            }

        } while (opc != 9);

    }
}
