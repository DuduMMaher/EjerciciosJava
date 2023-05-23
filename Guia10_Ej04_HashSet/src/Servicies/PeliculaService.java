/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicies;

import Entities.Pelicula;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class PeliculaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula ingresarPelicula() {

        System.out.println("Ingrese el Titulo de la Pelicula");
        String titulo = leer.next();
        System.out.println("Ingrese su Director");
        String director = leer.next();
        System.out.println("Ingrese su duracion en Horas");
        double duracion = leer.nextDouble();

        return new Pelicula(titulo, director, duracion);
    }

    public void mostrarPeliculas(HashSet<Pelicula> listPeliculas, int a) {

        boolean ref = false;

        for (Pelicula listPelicula : listPeliculas) {
            if (listPelicula.getDuracion() > a) {
                if (a > 0 && !ref) {
                    System.out.println("Peliculas de Duracion mayor a " + a + " horas");
                    ref = true;
                }
                System.out.println("Pelicula");
                System.out.println("Titulo: " + listPelicula.getTitulo());
                System.out.println("Director: " + listPelicula.getDirector());
                System.out.println("Ducacion: " + String.format("%.2f", listPelicula.getDuracion()));
                System.out.println("-----------------");
                System.out.println("");
            }
        }
    }

    public void ordenarXDuracion(HashSet<Pelicula> listPeliculas, int a) {

        ArrayList<Pelicula> peliArray = new ArrayList(listPeliculas);

        if (a == 0) {
            peliArray.sort(Pelicula.compXDuaracion);
            System.out.println("Peliculas Ordenadas x Duracion de Mayor a Menor");
        }
        if (a == 1) {
            peliArray.sort(Pelicula.compXDuaracion2);
            System.out.println("Peliculas Ordenadas x Duracion de Menor a Mayor");
        }
        for (Pelicula pelicula : peliArray) {
            System.out.println(pelicula.getTitulo() + " - " + pelicula.getDirector() + " - " + pelicula.getDuracion());
        }
    }

    public void ordenarTitulo(HashSet<Pelicula> listPeliculas) {

        ArrayList<Pelicula> peliArray = new ArrayList(listPeliculas);

        peliArray.sort(Pelicula.compXTitulo);
        System.out.println("Listado de Pelicular ordenado x Titulo");
    
     for (Pelicula pelicula : peliArray) {
            System.out.println(pelicula.getTitulo() + " - " + pelicula.getDirector() + " - " + pelicula.getDuracion());
        }
    
    
    }

    public void ordenarXDirector(HashSet<Pelicula> listPeliculas) {
         ArrayList<Pelicula> peliArray = new ArrayList(listPeliculas);

        peliArray.sort(Pelicula.compXDirector);
        System.out.println("Listado de Pelicular ordenado x Director");
    
     for (Pelicula pelicula : peliArray) {
            System.out.println(pelicula.getTitulo() + " - " + pelicula.getDirector() + " - " + pelicula.getDuracion());
        }
    
    }
    }
