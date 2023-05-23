/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Alumno;
import Entities.Voto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Simulador {

    Scanner leer = new Scanner(System.in);

    public int generadorDni() {

        Random randDni = new Random();
        int dni;

        do {
            dni = randDni.nextInt(45000000);
        } while (dni < 4000000);

        return dni;
    }

    public String ingresarAlumno() {

        System.out.print("Ingrese el Nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese el Apellido: ");
        String apellido = leer.next();

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

        for (Alumno aux : aluArray) {
            System.out.println(aux.getNombreCompleto() + "Votos: " + aux.getCantVotos());
            System.out.println("Votados: ");
            for (Voto aux2 : votaciones) {
                if (aux2.getAlumno().equals(aux)) {
                    for (int i = 0; i < aux2.getAlumnoVotado().size(); i++) {
                        System.out.println(aux2.getAlumnoVotado().get(i).getNombreCompleto());
                    }
                }
            }
            System.out.println("");
        }

    }
}
