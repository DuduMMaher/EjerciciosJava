/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07_ej01;


import guia07_ej01.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Guia07_Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        
        
        
        Libro m1 = new Libro();

       
            m1.cargarDatos();
            m1.mostrarDatos();
        

    }

}
