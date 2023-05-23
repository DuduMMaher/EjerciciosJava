/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia08_extra02;

import Entidad.NIF;
import Servicios.NIFServicios;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Guia08_Extra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        NIFServicios ns = new NIFServicios();

        NIF n[] = new NIF[100];

        char[] vector = ns.crearVector();

        int proximoDni;
        int opc;

        do {
            System.out.println("Menu");
            System.out.println("-------");
            System.out.println("");
            System.out.println("1.- Ingresar nuevo DNI");
            System.out.println("2.- Mostrar NIF de DNIs ingresados");
            System.out.println("3.- Salir");
            System.out.println("-------");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    proximoDni = ns.buscarProximo(n);
                    n[proximoDni] = ns.ingresarDni(vector, proximoDni);
                    break;
                case 2:
                    proximoDni = ns.buscarProximo(n);
                    if (proximoDni == 0) {
                        System.out.println("No hay DNIs ingresados aun");
                        break;
                    }
                    for (int i = 0; i < proximoDni; i++) {
                        ns.mostrar(n[i]);
                    }
                    break;
            }

        } while (opc != 3);

    }

}
