/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_ej01_hashset;

import Services.PerroService;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo 
 * String. El programa pedirá una raza de perro en un bucle, el mismo se 
 * guardará en la lista y después se le preguntará al usuario si quiere guardar 
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros 
 * guardados en el ArrayList.
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario 
 * se le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el 
 * perro en la lista. Si el perro está en la lista, se eliminará el perro que 
 * ingresó el usuario y se mostrará la lista ordenada. Si el perro no se 
 * encuentra en la lista, se le informará al usuario y se mostrará la lista 
 * ordenada.
 * 
 * @author dudum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PerroService ps = new PerroService();
        HashSet<String> razas = new HashSet();
        
       ps.crearListado(razas);
       ps.mostrarRazas(razas);
       ps.eliminarPerro(razas);
       ps.mostrarRazas(razas);
       ps.ordenarListado(razas);
       
       
        
    }
    
}
