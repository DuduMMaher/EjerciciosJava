/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Services.AlumnoService;
import java.util.ArrayList;

/**
 *
 * @author dudum
 */
public class Alumno {
    
    AlumnoService as = new AlumnoService();
    
    
    
    private String nombre;
    private ArrayList<Double> notas = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = as.crearNotas();
    }

    public AlumnoService getAs() {
        return as;
    }

    public void setAs(AlumnoService as) {
        this.as = as;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "as=" + as + ", nombre=" + nombre + ", notas=" + notas + '}';
    }
    
    
}
