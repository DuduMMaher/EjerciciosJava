/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia09_extras02;

import Entidades.Ahorcado;
import Servicios.AhorcadoService;
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
        
        String opc;
        AhorcadoService ahs = new AhorcadoService();
        
        do {
        Ahorcado ah = ahs.crearJuego();
        
      String[] palabraAh1= ahs.crearVectoresAuxliliares(ah, 1);
      String[] palabraAh2= ahs.crearVectoresAuxliliares(ah, 2);
        
        ahs.jugarAhorcado(ah, palabraAh1, palabraAh2);
        
        
        System.out.println("Desea seguir jugando (S/N)");
        do {
            opc= leer.next().toUpperCase();
        } while (!opc.equals("N") && !opc.equals("S"));
        
        } while (opc.equals("S"));
        
        
    }

}
