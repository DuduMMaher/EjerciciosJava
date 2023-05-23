/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Services.PeliculaService;
import java.util.Comparator;


/**
 *
 * @author dudum
 */
public class Pelicula {
    
    PeliculaService ps = new PeliculaService();
    
    
    private String titulo;
    private String director;
    private Double hora;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double hora) {
        this.titulo = titulo;
        this.director = director;
        this.hora = hora;
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

    public Double getHora() {
        return hora;
    }

    public void setHora(Double hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", hora=" + hora + '}';
    }

public static final Comparator<Pelicula> compararHora = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            
            return p2.getHora().compareTo(p1.getHora());
        }




    
};
        
public static final Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
};

public static final Comparator<Pelicula> compararDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            
            return p1.getDirector().compareTo(p2.getDirector());
        }
};



}