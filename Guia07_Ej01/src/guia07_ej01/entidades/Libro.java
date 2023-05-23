/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07_ej01.entidades;

import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Libro {

    public String isbn;
    public String titulo;
    public String autor;
    public int paginas;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void cargarDatos() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el ISBN");
        isbn = leer.next();
        System.out.println("Ingrese el Titulo");
        titulo = leer.next();
        System.out.println("Ingrese Autor");
        autor = leer.next();
        System.out.println("Ingrese cant de paginas");
        paginas = leer.nextInt();

       
        
        
    }
public void mostrarDatos(){
    
    System.out.println(isbn + " "+ titulo + " " + autor +" " + paginas);
    
    
    
}
}
