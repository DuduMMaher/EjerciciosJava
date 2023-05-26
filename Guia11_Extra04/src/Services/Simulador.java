/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Alumno;
import Entities.Voto;
import HacksDPackage.Servicios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;






/**
 *
 * @author dudum
 */
public class Simulador {

    Scanner leer = new Scanner(System.in);
    Servicios serv = new Servicios();
    
    
    public int generadorDni() {

       
        return serv.generarDni();
    }

    public String ingresarAlumno() {

        System.out.print("Ingrese el Nombre: ");
        String nombre = serv.nombre();
        System.out.print("Ingrese el Apellido: ");
        String apellido = serv.apellido();

        String nombreCompleto = apellido + ", " + nombre;
        
        return nombreCompleto;

    }

    public void mezclarLista(ArrayList<String> alumnoArray) {

        Collections.shuffle(alumnoArray);
    }

    public Alumno asignarDni(ArrayList<String> alumnoArray, ArrayList<Integer> dniArray, int i) {

        String nombre = alumnoArray.get(i);
        int dni = dniArray.get(i);

        return new Alumno(nombre, dni);
    }

    public void imprimirAlumnos(ArrayList<Alumno> aluArray) {

        System.out.printf("%-10s %-15s\n", "DNI", "Apellido, Nombre");
        for (Alumno aux : aluArray) {
            System.out.printf("%-10s %-15s\n", aux.getDni(), aux.getNombreCompleto());
        }
    }

    public Voto votacion(ArrayList<Alumno> aluArray, List<Alumno> alumnoVotado, int a) {

        Random voto = new Random();
        int rand = aluArray.size();

        int votoRandom;

        for (int i = 0; i < 3; i++) {
            do {
                votoRandom = voto.nextInt(rand);
            } while (votoRandom == a || alumnoVotado.contains(aluArray.get(votoRandom)));

            alumnoVotado.add(aluArray.get(votoRandom));
            aluArray.get(votoRandom).setCantVotos(aluArray.get(votoRandom).getCantVotos() + 1);
        }
        return new Voto(aluArray.get(a), (ArrayList<Alumno>) alumnoVotado);
    }

    public void verVotaciones(ArrayList<Alumno> aluArray, ArrayList<Voto> votaciones) {

        for (Voto aux : votaciones) {
            System.out.println(aux.getAlumno().getNombreCompleto() + " / " + aux.getAlumno().getCantVotos());
            for (int i = 0; i < aux.getAlumnoVotado().size(); i++) {
                System.out.println(aux.getAlumnoVotado().get(i).getNombreCompleto());
            }

        }

    }

    public void titularesSuplentes(ArrayList<Alumno> aluArray) {
     
        Collections.sort(aluArray, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                Integer votos1 = o1.getCantVotos();
                Integer votos2 = o2.getCantVotos();
               return votos2.compareTo(votos1);
            }
        });
    System.out.println("TITULARES");
        for (int i = 0; i < 5; i++) {
            
            System.out.println(aluArray.get(i).getNombreCompleto() + " / " + aluArray.get(i).getCantVotos());
            
        }
        System.out.println("");
    System.out.println("SUPLENTES");
    
        for (int i = 5 ; i < 10; i++) {
            System.out.println(aluArray.get(i).getNombreCompleto() + " / " + aluArray.get(i).getCantVotos());
        }
    
    
    
    }
}
