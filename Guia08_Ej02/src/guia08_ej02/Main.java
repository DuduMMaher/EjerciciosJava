/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia08_ej02;

import Servicios.CafeteraServicios;
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
        CafeteraServicios cs1 = new CafeteraServicios();

        cs1.ingresarCapacidadMaxima();

        int opc;

        do {

            System.out.println("MENU");
            System.out.println("");

            System.out.println("1.- Llenar Cafetera");
            System.out.println("2.- Servir taza");
            System.out.println("3.- Vaciar Cafetera");
            System.out.println("4.- Agregar Cafe");
            //          System.out.println("5.- Ver Saldo");
            System.out.println("5.- Salir");

            cs1.verCantidad();

            opc = leer.nextInt();

            System.out.println();

            switch (opc) {
                case 1:
                    cs1.llenarCafetera();
                    break;
                case 2:
                    cs1.servirTaza();
                    break;
                case 3:
                    cs1.vaciarCafetera();
                    break;
                case 4:
                    cs1.agregarCafe();
                    break;
                case 5:

                    break;
                case 6:

                    break;

            }
        } while (opc != 5);

    }

}
