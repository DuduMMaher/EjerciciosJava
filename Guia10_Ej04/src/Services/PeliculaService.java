/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Pelicula;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author dudum
 */
public class PeliculaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> PeliArray;

    public void cargarPeliculas() {

        String opc = "";
        PeliArray = new ArrayList();

        do {

            System.out.println("Ingrese El Titulo de la Pelicula");
            String titulo = leer.next();
            System.out.println("Ingrese el Director de la Pelicula");
            String dire = leer.next();
            System.out.println("Ingrese la duracion de la pelicula en horas");
            Double horas = leer.nextDouble();

            Pelicula peli = new Pelicula(titulo, dire, horas);
            PeliArray.add(peli);

            System.out.println("Desea Cargar otra Pelicula (S/N)");
            opc = leer.next();

        } while (!opc.toUpperCase().equals("N"));
    }

    public void mostrarPeliculas() {

        for (Pelicula object : PeliArray) {
            System.out.println(object);
        }
        System.out.println("");
    }

    public void mostrarPeliculasLargas() {

        for (Pelicula object : PeliArray) {
            if (object.getHora() > 1) {
                System.out.println(object);
            }
        }
        System.out.println("");
    }

    public void ordenarPeliculasMayAMen() {

        PeliArray.sort(Pelicula.compararHora);
        mostrarPeliculas();

    }

    public void ordenarPeliculasMenAMay() {

        PeliArray.sort(Pelicula.compararHora);
        Collections.reverse(PeliArray);
        mostrarPeliculas();

    }

    public void ordenarXTitulo() {

        PeliArray.sort(Pelicula.compararTitulo);
       
        mostrarPeliculas();

    }

    public void ordenarXDirector() {

        PeliArray.sort(Pelicula.compararDirector);
        
        mostrarPeliculas();

    }

}
