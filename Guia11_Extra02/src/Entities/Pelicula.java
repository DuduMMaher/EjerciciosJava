/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.Date;

/**
 *
 * @author dudum
 */
public class Pelicula {
    
    private String titulo;
    private Date duracion;
    private int edadMinima;

    public Pelicula() {
    }

    public Pelicula(String titulo, double duracionPelicula, int edadMinima) {
        this.titulo = titulo;
        int hora = (int) duracionPelicula;
        int minutos = (int) ((duracionPelicula-hora)*100);
        this.duracion = new Date();
        this.duracion.setHours(hora);
        this.duracion.setMinutes(minutos);
        this.edadMinima = edadMinima;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDuracion() {
        return duracion;
    }

    public void setDuracion(Date duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edadMinima=" + edadMinima + '}';
    }
    
    
}
