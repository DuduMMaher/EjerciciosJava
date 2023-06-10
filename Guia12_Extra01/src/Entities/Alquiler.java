/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author dudum
 */
public class Alquiler {
    
    private Cliente nombre;
    private LocalDate fecha;
    private LocalDate dev;
    private int amarre;
    private Embarcacion barco;
    private double costo;

    public Alquiler() {
    }

    public Alquiler(Cliente nombre, LocalDate fecha, LocalDate dev, int amarre, Embarcacion barco, double costo) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.dev = dev;
        this.amarre = amarre;
        this.barco = barco;
        this.costo = costo;
    }

    public Cliente getNombre() {
        return nombre;
    }

    public void setNombre(Cliente nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getDev() {
        return dev;
    }

    public void setDev(LocalDate dev) {
        this.dev = dev;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getAmarre() {
        return amarre;
    }

    public void setAmarre(int amarre) {
        this.amarre = amarre;
    }

    public Embarcacion getBarco() {
        return barco;
    }

    public void setBarco(Embarcacion barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", fecha=" + fecha + ", dev=" + dev + ", amarre=" + amarre + ", barco=" + barco + ", costo=" + costo + '}';
    }


   
    
    
            
            
 
}
