/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07_extra05;

import guia07_extra05.Entidades.Cuenta;
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

        Cuenta c1 = new Cuenta();
        Scanner leer = new Scanner(System.in);
        double retiro;
        int opc;
        System.out.println("Ingrese los datos Iniciales de la Cuenta");
        System.out.println("");

        c1.saldoInicial();

        do {

            System.out.println("");

            System.out.println("MENU");
            System.out.println("");

            System.out.println("1.- Retirar Dinero");
            System.out.println("2.- Consulta de Saldos");
            System.out.println("3.- Salir");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese el importe a Retirar");
                    retiro = leer.nextDouble();
                    c1.retirarDinero(retiro);
                    break;
                case 2:
                    System.out.println(String.format("%.2f", c1.getSaldo()));
                    break;
                case 3:

            }
        } while (opc != 3);

    }

}
