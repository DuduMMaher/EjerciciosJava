/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.PersonaServicio;
import Persona.Persona;
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
        PersonaServicio ps = new PersonaServicio();
        int longitud = 100;
        
        
        Persona p[] = new Persona[longitud];

        p[0] = new Persona("PACO", "M", 18, 65, 1.85);

        p[1] = new Persona("LUIS", "M", 15, 105, 1.56);

        p[2] = new Persona("CARLA", "F", 24, 58, 1.62);

        int[] imc = new int[longitud];
        boolean[] mayor = new boolean[longitud];

        boolean edadM;
        int opc;
        int contMayor = 0;
        int contPeso = 0;
        int contPeso2 = 0;
        int ultimo;
        int relacionPeso;
        do {

            System.out.println("MENU");
            System.out.println("");

            System.out.println("1.- Crear Persona");
            System.out.println("2.- Ver edad (MAYOR o MENOR)");
            System.out.println("3.- Ver IMC");
            System.out.println("4.- Ver Estadisticas de Edades y Pesos");
            System.out.println("5.- Salir");

            opc = leer.nextInt();

            System.out.println();

            switch (opc) {
                case 1:
                    p[ps.buscarPrimerVacio(p)] = ps.crearPersona();
                    break;
                case 2:
                    ultimo = ps.buscarPersona(p);

                    if (ultimo != 101) {
                        edadM = ps.esMayorDeEdad(p[ultimo]);
                        if (edadM) {
                            System.out.println("Es MAYOR de Edad");
                        } else {
                            System.out.println("Es MENOR de Edad");
                        }
                    } else {
                        System.out.println("El nombre ingresado NO EXISTE");
                    }
                    break;
                case 3:
                    ultimo = ps.buscarPersona(p);

                    relacionPeso = ps.calcularIMC(p[ultimo]);

                    if (relacionPeso == 0) {
                        System.out.println(p[ultimo].getNombre() + " esta en su peso ideal");
                    }
                    if (relacionPeso == 1) {
                        System.out.println(p[ultimo].getNombre() + " tiene sobrepeso");
                    }
                    if (relacionPeso == -1) {
                        System.out.println(p[ultimo].getNombre() + " esta por debajo de su peso ideal");
                    }
                    break;
                case 4:
                    for (int i = 0; i < (ps.buscarPrimerVacio(p)); i++) {
                        imc[i] = ps.calcularIMC(p[i]);
                    }
                    for (int i = 0; i < (ps.buscarPrimerVacio(p)); i++) {
                        mayor[i] = ps.esMayorDeEdad(p[i]);
                    }
                    for (int i = 0; i < (ps.buscarPrimerVacio(p)); i++) {
                        if (mayor[i]) {
                            contMayor++;
                        }
                    }
                    for (int i = 0; i < (ps.buscarPrimerVacio(p)); i++) {
                        if (imc[i] == 0) {
                            contPeso++;
                        }
                        if (imc[i] == (-1)) {
                            contPeso2++;
                        }
                    }
                    System.out.println("El " + String.format("%.2f", ((double) contMayor / (ps.buscarPrimerVacio(p)) * 100)) + "% son Mayores");
                    System.out.println("El " + String.format("%.2f", ((double) contPeso / (ps.buscarPrimerVacio(p)) * 100)) + "% estan en su peso ideal");
                    System.out.println("El " + String.format("%.2f", ((double) contPeso2 / (ps.buscarPrimerVacio(p)) * 100)) + "% estan por debajo de su peso ideal");
                    System.out.println("El " + String.format("%.2f", ((double) (100 - ((double) contPeso / (ps.buscarPrimerVacio(p)) * 100) - ((double) contPeso2 / (ps.buscarPrimerVacio(p)) * 100)))) + "% estan con sobrepeso");
                    contMayor = 0;
                    contPeso = 0;
                    contPeso2 = 0;
                    break;
            }
        } while (opc != 5);

        for (int i = 0; i < (ps.buscarPrimerVacio(p)); i++) {
            System.out.println(p[i].toString());
        }

        for (int i = 0; i < (ps.buscarPrimerVacio(p)); i++) {
            System.out.print(imc[i] + "  ");
        }
        System.out.println("");

        for (int i = 0; i < (ps.buscarPrimerVacio(p)); i++) {
            System.out.print(mayor[i] + "  ");
        }
        System.out.println("");
    }
}
