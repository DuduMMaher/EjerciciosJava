/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author dudum
 */
public class Voto {
    
    private Alumno alumno;
    private ArrayList<Alumno> alumnoVotado;

    public Voto() {
    }

    public Voto(Alumno alumno, ArrayList<Alumno> alumnoVotado) {
        this.alumno = alumno;
        this.alumnoVotado = alumnoVotado;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Alumno> getAlumnoVotado() {
        return alumnoVotado;
    }

    public void setAlumnoVotado(ArrayList<Alumno> alumnoVotado) {
        this.alumnoVotado = alumnoVotado;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", alumnoVotado=" + alumnoVotado + '}';
    }
    
    
    
}
