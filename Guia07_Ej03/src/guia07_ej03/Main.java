/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07_ej03;

import guia07_ej03.Entidades.Operacion;
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
        
    
        Operacion m1 = new Operacion();
        int opc=0;
        do {
            
        
        
        System.out.println("MENU");
        System.out.println("");
        
        System.out.println("1.- Ingresar datos");
        System.out.println("2.- Sumar");
        System.out.println("3.- Restar");
        System.out.println("4.- Multiplicar");
        System.out.println("5.- Dividir");
        System.out.println("6.- Ver numeros");
        System.out.println("7.- Salir");
        
        opc=leer.nextInt();
        
            System.out.println();
        
        switch (opc){
            case 1:
                m1.crearOperacion();
                   
                break;
            case 2:
                System.out.println(m1.sumar());
                break;
            case 3:
                System.out.println(m1.restar());
                break;
            case 4:
                if (m1.multiplicar()==0){
                    System.out.println("Uno de los valores es 0");
                    break;
                }
                System.out.println(m1.multiplicar());
                
                break;
            case 5:
                System.out.println(String.format("%.2f",m1.dividir()));
                break;
            case 6:
                System.out.println("Num 1: " + m1.getNumero1());
                System.out.println("Num 2: " + m1.getNumero2());
                break;
            case 7:
                break;
                
        }
        } while (opc!=7);
        
    }
    
}
