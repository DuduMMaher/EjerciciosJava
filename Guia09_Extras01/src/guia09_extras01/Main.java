/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia09_extras01;

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
        
    String[] mes = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    
    String mesSecreto= mes[8];
    
    String adMes;
    boolean ref=false;
    int cont=0;
        do {
            
            if (ref) {
                System.out.println("Mes INCORRECTO");
                System.out.println("Vuelva a Intentar");
            } 
            System.out.println("Adivine el mes secreto");
            adMes= leer.next();
           
            cont++;
            ref=true;
            
        } while (!adMes.toLowerCase().equals(mesSecreto));
        
        System.out.println("BIEN!! Usted adivino en " + cont + " intentos");
    
    }
    
}
