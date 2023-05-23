/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class CursoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Curso crearCurso() {

        System.out.println("Ingrese el nombre del Curso");
        String nCurso = leer.next();
        nCurso = acomodarNombre(nCurso);
        System.out.println("Ingrese Cant de Horas x dia");
        int horasPorDia = leer.nextInt();
        System.out.println("Ingrese cantidad de dias x semana");
        int diasPorSemana = leer.nextInt();
        String turno;
        do {
            System.out.println("Turno Mañana o Tarde (TM / TT)");
            turno = leer.next().toUpperCase();
        } while (!"TM".equals(turno) && !"TT".equals(turno));
        System.out.println("Valor de la hora");
        int valorPorHora = leer.nextInt();
        String[] alumnos = cargarAlumnos();

        return new Curso(nCurso, horasPorDia, diasPorSemana, turno, valorPorHora, alumnos);
    }

    public String[] cargarAlumnos() {

        int cantAlumnos = 5;
        String[] alumnos = new String[cantAlumnos];

        for (int i = 0; i < cantAlumnos; i++) {
            System.out.println("Ingrese el nombre del Alumno " + (i + 1));
            alumnos[i] = leer.next();
            alumnos[i] = acomodarNombre(alumnos[i]);
        }
        return alumnos;
    }

    public void calcularGanancia(Curso c) {

        System.out.println("La ganancia del grupo " + c.getNombreCurso() + " es de " + (c.getCantidadDiasPorSemana() * c.getCantidadHorasPorDia() * c.getPrecioPorHora() * 5));
    }

    public void mostrarCurso(Curso c) {

        System.out.println("Nombre del Grupo " + c.getNombreCurso());
        System.out.println("Cantidad de horas x dia: " + c.getCantidadHorasPorDia());
        System.out.println("Cantidad de dias x Semana: " + c.getCantidadDiasPorSemana());
        System.out.println("Precio de la Hora: " + c.getPrecioPorHora());
        System.out.println("Turno " + c.getTurno());
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno " + (i + 1) + " " + c.getAlumnos()[i]);
        }
    }

    public String acomodarNombre(String n){
        
        int longitud = n.length();
        String n1="";
        String n2;
        
        for (int i = 0; i < longitud; i++) {
            if (i==0){
                n1 = n1.concat(n.substring(i, (i+1)).toUpperCase());
                
            }else {
                n1 = n1.concat(n.substring(i, (i+1)).toLowerCase());
            }
        }
        return n1;
    }
    
    
    public int buscarCurso(Curso[] c) {

        System.out.println("Ingrese el nombre del curso del que quiere saber ganancia");
        String nom = leer.next();

        for (int i = 0; i < buscarPrimerVacio(c); i++) {
            if (c[i].getNombreCurso().equalsIgnoreCase(nom)) {
                return i;
            }
        }
        return 101;
    }

    public int buscarPrimerVacio(Curso[] c) {

        int i = 0;
        while (c[i] != (null)) {
            i++;
            if (i == 99) {
                return 101;
            }
        }
        return i;
    }

}
