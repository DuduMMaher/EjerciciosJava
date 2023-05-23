/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia09_extras03;

import Servicios.PalindromoService;
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
        PalindromoService ps = new PalindromoService();
        
        
        
        String opc;
        
        do{
        System.out.println("Ingrese una palabra");
        String palabra = leer.next();
        
        
        if (ps.compararPalabras(palabra)) {
            System.out.println("La palabra es un palíndromo");
        } else {
            System.out.println("La palabra NO es un palíndromo");
        }
            System.out.println("Sigue jugando (S/N)");
            opc=leer.next();
        } while (!opc.toUpperCase().equals("N"));
        
        
        }
    
}
