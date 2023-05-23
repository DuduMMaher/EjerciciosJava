/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_extras02;

import Entities.CantanteFamoso;
import Services.CFService;
import java.util.ArrayList;
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

        ArrayList<CantanteFamoso> cfList = new ArrayList();
        CFService cfs = new CFService();

        Scanner leer = new Scanner(System.in);
        int opc;

        do {
            System.out.println("MENU");
            System.out.println("----------");
            System.out.println("");
            System.out.println("1.- Cargar nuevo Cantante");
            System.out.println("2.- Eliminar Cantante");
            System.out.println("3.- Mostrar Cantantes");
            System.out.println("4.- Salir");

            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    cfList.add(cfs.crearCantante());
                    break;
                case 2:
                    if (cfs.eliminarCantante(cfList)) {
                        System.out.println("El Cantante fue eliminado");
                    } else {
                        System.out.println("El cantate no se encontraba en la lista");
                    }
                    break;
                case 3:
                    cfs.mostrarCantantes(cfList);
                    break;
            }

        } while (opc != 4);
    }

}
