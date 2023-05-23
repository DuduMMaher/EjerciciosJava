/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07_Extra06;

import guia07_Extra06.Entidades.Empleado;
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
        Empleado e1 =new Empleado();
        
        System.out.println("Ingrese el Nombre del Empleado");
        String nombre = leer.next();
        System.out.println("Ingrese edad del empleado");
        int edad = leer.nextInt();
        System.out.println("Ingrese salario del empleado");
        double salario =leer.nextDouble();
        
        
        e1.setNombre(nombre);
        e1.setEdad(edad);
        e1.setSalario(salario);
        
        
        System.out.println("El importe a aumentar es: " + String.format("%.2f", e1.calcular_aumento()));
        System.out.println("Dando un nuevo sueldo de :" + String.format("%.2f", (salario+e1.calcular_aumento())));
        
        
    }
    
}
