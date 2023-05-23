/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia08_ej01vect;

import Servicios.CuentasServicios;
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
        CuentasServicios cs1 = new CuentasServicios();

        cs1.inicializarVector();

        int opc;

        do {

            System.out.println("MENU");
            System.out.println("");

            System.out.println("1.- Ingresar datos");
            System.out.println("2.- Deposito");
            System.out.println("3.- Retiro de Dinero");
            System.out.println("4.- Retiro Rapido");
            System.out.println("5.- Ver Saldo");
            System.out.println("6.- Salir");
            

            opc = leer.nextInt();

            System.out.println();

            switch (opc) {
                case 1:
                    cs1.ingresarCuenta();
                    break;
                case 2:
                    cs1.ingresarDinero();
                    break;
                case 3:
                    cs1.retiroDinero();
                    break;
                case 4:
                    cs1.retiroRapido();
                    break;
                case 5:
                    cs1.mostrarSaldo();

                    break;
                case 6:
                    
                    break;

            }
        } while (opc != 6);

    }

}
