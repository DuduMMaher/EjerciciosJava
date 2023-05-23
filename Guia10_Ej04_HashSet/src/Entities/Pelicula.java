/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Comparator;

/**
 *
 * @author dudum
 */
public class Pelicula {
    
    private String titulo;
    private String director;
    private Double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    public static Comparator<Pelicula> compXDuaracion = new Comparator<Pelicula>(){
       @Override
       public int compare(Pelicula p1, Pelicula p2){
           return p2.getDuracion().compareTo(p1.getDuracion());
       }
    };
    
    
     public static Comparator<Pelicula> compXDuaracion2 = new Comparator<Pelicula>(){
       @Override
       public int compare(Pelicula p1, Pelicula p2){
           return p1.getDuracion().compareTo(p2.getDuracion());
       }
    };
     
      public static Comparator<Pelicula> compXTitulo = new Comparator<Pelicula>(){
       @Override
       public int compare(Pelicula p1, Pelicula p2){
           return p1.getTitulo().compareTo(p2.getTitulo());
       }
    };
     
      public static Comparator<Pelicula> compXDirector = new Comparator<Pelicula>(){
       @Override
       public int compare(Pelicula p1, Pelicula p2){
           return p1.getDirector().compareTo(p2.getDirector());
       }
    };
     
     
}
