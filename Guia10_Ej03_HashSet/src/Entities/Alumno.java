/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Services.AlumnoService;
import java.util.HashSet;

/**
 *
 * @author dudum
 */
public class Alumno {
    
    AlumnoService as = new AlumnoService();
    
    
    private String alumno;
    private HashSet<Double> notas;

    public Alumno() {
    }

    public Alumno(String alumno) {
        this.alumno = alumno;
        this.notas = as.ingresarNotas();
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public HashSet<Double> getNotas() {
        return notas;
    }

    public void setNotas(HashSet<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "alumno=" + alumno + ", notas=" + notas + '}';
    }
    
    
    
}
