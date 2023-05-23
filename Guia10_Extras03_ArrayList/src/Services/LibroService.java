/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Libro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class LibroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro() {
        
        System.out.println("Ingrese El Titulo del Libro");
        String titulo = leer.next();
        System.out.println("Ingrese el Autor");
        String autor = leer.next();
        System.out.println("Ingrese la cantidad de Ejemplares");
        int ejemplares= leer.nextInt();
        int prestados=0;
        
        return new Libro(titulo, autor, ejemplares, prestados);
        
    }

    public void prestarLibros(ArrayList<Libro> listaLibros){
        
        boolean ref=false;
        System.out.println("Ingrese el nombre del libro que desea Prestar");
        String titulo = leer.next();
        
        for (Libro listaLibro : listaLibros) {
            if (listaLibro.getLibro().equalsIgnoreCase(titulo)){
                ref=true;
                if ((listaLibro.getEjemplares()-listaLibro.getPrestados())>0) {
                    listaLibro.setPrestados((listaLibro.getPrestados()+1));
                } else {
                    System.out.println("Todos los libros estan Prestados");
                    wait(2000);
                }
            }
        }
        if (!ref) {
            System.out.println("El libro buscado no se encuentra");
            wait(2000);
        }
    }
    
    public void devolucionLibros(ArrayList<Libro> listaLibros) {
        
        boolean ref=false;
        System.out.println("Ingrese el nombre del libro que desea DEVOLVER");
        String titulo = leer.next();
        
        for (Libro listaLibro : listaLibros) {
            if (listaLibro.getLibro().equalsIgnoreCase(titulo)){
                listaLibro.setPrestados((listaLibro.getPrestados()-1));
                ref=true;
            }
        }
        if (!ref){
            System.out.println("El libro ingresado NO esta en la Lista");
            wait (2000);
        }
    }
     
     public void mostrarLibros(ArrayList<Libro> listaLibros) {
        
         System.out.println("Listado de libros");
         for (Libro listaLibro : listaLibros) {
             System.out.println("Titulo: " + listaLibro.getLibro() + "  Autor: " + listaLibro.getAutor()+ "  Ejemplares totales: " + listaLibro.getEjemplares() + "  Ejemplares Prestados: " + listaLibro.getPrestados() + "  Ejemplares Disponibles: "+ (listaLibro.getEjemplares()-listaLibro.getPrestados()));
         }
         System.out.println("");
    }
     
    public static void wait(int ms) {

        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

   
}
