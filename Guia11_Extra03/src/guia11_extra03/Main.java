/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11_extra03;

import Entities.Cliente;
import Entities.Poliza;
import Entities.Vehiculo;
import Services.SeguroService;
import java.text.ParseException;
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
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        SeguroService ss = new SeguroService();
        ArrayList<Cliente> clientesArray = new ArrayList();
        ArrayList<Poliza> poliArray = new ArrayList();
        ArrayList<Vehiculo> autoArray = new ArrayList();
        
        int opc;
        do {
            System.out.println("MENU");
            System.out.println("--------");
            System.out.println("1.- Generar Poliza");
            System.out.println("2.- Generar Pago de Cuota");
            System.out.println("3.- ");
            System.out.println("4.- ");
            System.out.println("5.- ");
            System.out.println("6.- ");
            System.out.println("7.- ");
            System.out.println("8.- ");
            System.out.println("9.- Salir");

            opc = leer.nextInt();

            switch (opc) {

                case 1:
                    poliArray.add(ss.generarPoliza(clientesArray, autoArray));
                    break;
                case 2:
                    ss.pagoCuota(poliArray, clientesArray);
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    break;
                case 8:
                    
                    break;
                case 9:
                    break;

            }

        } while (opc != 9);

        
        
    }
    
}
