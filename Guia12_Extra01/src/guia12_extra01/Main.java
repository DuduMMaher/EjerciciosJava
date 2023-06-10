/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12_extra01;

import Entities.Alquiler;
import Entities.Cliente;
import Entities.Embarcacion;
import Entities.Velero;
import Services.PuertoService;
import java.util.ArrayList;
import java.util.List;
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
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Cliente> cliente = new ArrayList();
        ArrayList<Alquiler> alq = new ArrayList();
        ArrayList<Embarcacion> emb = new ArrayList();
        PuertoService ps = new PuertoService();
        
        int opc;
        do {
            System.out.println("MENU");
            System.out.println("--------");
            System.out.println("1.- Generar Alquiler Amarra");
            System.out.println("2.- Ver Lista clientes");
            System.out.println("3.- Ver Lista Alquileres");
            System.out.println("4.- Ver Lista Barcos");
            System.out.println("5.- ");
            System.out.println("6.- ");
            System.out.println("7.- ");
            System.out.println("8.- ");
            System.out.println("9.- Salir");

            opc = leer.nextInt();

            switch (opc) {

                case 1:
                    alq.add(ps.crearAlquiler(cliente, emb));
                    
                    break;
                case 2:
                    ps.verListaClientes(cliente);
                    break;
                case 3:
                    ps.verListaAlquileres(alq);
                    break;
                case 4:
                    ps.verListaEmbarcaciones(emb);
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
