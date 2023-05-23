/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia09_ej05;

import Entidades.Persona;
import PersonaService.PersonaService;
import java.util.Date;
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
        PersonaService ps = new PersonaService();
        Date nacimiento;
        Persona p1 = ps.crearPersona();
//        Persona p2 = ps.crearPersona();
//        Persona p3 = ps.crearPersona();

        System.out.println(p1.toString());
//        System.out.println(p2.toString());
//        System.out.println(p3.toString());

       
        
        
//    ps.calcularEdad(p1);
//    
//        System.out.println("Ingrese una edad a comparar");
//        int edad= leer.nextInt();
//        
//        if (ps.menorQue(p1, edad)){
//            System.out.println("Es menor que el año " + edad);
//        } else {
//            System.out.println("Es mayor a " + edad);
//        }
    }

}
