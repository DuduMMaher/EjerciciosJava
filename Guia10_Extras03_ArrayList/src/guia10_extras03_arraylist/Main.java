/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_extras03_arraylist;

import Entities.Libro;
import Services.LibroService;
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
    public static void main(String[] args) {
        // TODO code application logic here
  
        ArrayList<Libro> listaLibros = new ArrayList();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro libro = new Libro();
        LibroService ls= new LibroService();
        
        
        
        int opc;
        
        do {
            
            System.out.println("MENU");
            System.out.println("-------");
            System.out.println("1.- Cargar libros");
            System.out.println("2.- Prestar Libros");
            System.out.println("3.- Devolucion de libros");
            System.out.println("4.- Mostrar Listado de libros");
            System.out.println("5.- Salir");
            
            opc= leer.nextInt();
            
            switch (opc) {
                case 1:
                    listaLibros.add(ls.crearLibro());
                    break;
                case 2:
                    ls.prestarLibros(listaLibros);
                    break;
                case 3:
                    ls.devolucionLibros(listaLibros);
                    break;
                case 4:
                    ls.mostrarLibros(listaLibros);
                    
            }
            
        } while (opc!=5);
        
    
    
    
    }
    
}
