/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11_ej03;

import Entities.Carta;
import Services.CartaService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Guia11_Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Carta carta = new Carta();
        CartaService cs = new CartaService();
        ArrayList<Carta> maso = new ArrayList();

        int opc;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                maso.add(cs.crearBaraja(i, j));
            }
        }

        do {
            System.out.println("MENU");
            System.out.println("--------");
            System.out.println("1.- Barajar");
            System.out.println("2.- Cartas Disponibles");
            System.out.println("3.- Dar Cartas");
            System.out.println("4.- Cartas que ya Salieron");
            System.out.println("5.- Mostrar Baraja");
            System.out.println("6.- Salir");

            opc = leer.nextInt();

            switch (opc) {
                
                case 1:
                    cs.barajar(maso);
                    break;
                case 2:
                    cs.cartasDisponibles(maso);
                    break;
                case 3:
                    cs.darCartas(maso);
                    break;
                case 4:
                    cs.cartasQueYaSalieron(maso);
                    break;
                case 5:
                    cs.mostrarBaraja(maso);
            }

        } while (opc != 6);

    }

}
