/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Perro;
import Entities.Persona;
import Enumeraciones.Raza;
import Enumeraciones.Tamano;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class PPService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
    public Persona crearPersona() {

        System.out.println("Ingrese el nombre de la Persona");
        String nombre = leer.next();
        System.out.println("Ingrese el Apellido");
        String apellido = leer.next();
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese su DNI");
        int dni = leer.nextInt();

        return new Persona(nombre, apellido, edad, dni);

    }

    public Perro crearPerro() {

        int a = 1;
        Raza rz;
        System.out.println("Ingrese el nombre del Perro");
        String nombre = leer.next();
        System.out.println("Ingrese la Raza");
        for (Raza valor : Raza.values()) {
            System.out.println(a + ".-" + valor);
            a++;
        }
        int rza = leer.nextInt();

        rz = Raza.values()[(rza - 1)];

//        for (Raza valor : Raza.values()) {
//            if ((rza-1)== valor.ordinal()){
//                rz= valor;
//            }
//        }
//        
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese su tamaño");
        Tamano tm;
        a=1;
        for (Tamano valor : Tamano.values()) {
            System.out.println(a + ".-" + valor);
            a++;
        }
        int tam = leer.nextInt();
        tm = Tamano.values()[tam-1];
        
        boolean adoptado = false;

        return new Perro(nombre, rz, edad, tm, adoptado);

    }

    public void asignarPerro(ArrayList<Persona> pers, ArrayList<Perro> perro) {

        int a = 1;
        int b = 1;
        int opc1;
        int opc2;
        String opcion1;
        String opcion2;

        do {
            a=1;
            for (Persona aux1 : pers) {
                System.out.println(a + ".- " + aux1.getApellido() + " " + aux1.getNombre());
                a++;
            }
            System.out.println("Que persona esta dispuesta a Adoptar un perro?");
            opc1 = leer.nextInt();
            opc1 = opc1 - 1;
            do {
                b=1;
                System.out.println("Perros Disponibles para su Adopcion");
                System.out.println("-----------------------------------");
                for (Perro aux2 : perro) {
                    if (!aux2.getAdoptado()) {
                        System.out.println(b + ".- " + aux2.getNombre() + " / " + aux2.getRaza());
                    } else {
                        System.out.println(b + ".- " + aux2.getNombre() + " / " + aux2.getRaza() + "     ////// ADOPTADO ////////");
                    }
                    b++;
                }
//                System.out.println(b + ".- Salir");
                System.out.println("-----");
                opc2 = leer.nextInt();
                opc2 = opc2 - 1;
                if (opc2 == pers.size()) {

                }
                System.out.println(pers.get(opc1));
                System.out.println(perro.get(opc2));
                ArrayList<Perro> perrosPersona = pers.get(opc1).getPerroPersona();
                perrosPersona.add(perro.get(opc2));
                
                
                perro.get(opc2).setAdoptado(true);
                System.out.println("Desea Adoptar otro? (S/N)");
                opcion1 = leer.next();
            } while (!opcion1.equalsIgnoreCase("N"));

            System.out.println("Alguna otra persona desea Adoptar un perro?(S/N)");
            opcion2 = leer.next();

        } while (!opcion2.equalsIgnoreCase("N"));

    }
//        for (int i = 0; i < pers.size(); i++) {
//            do {
//
//                System.out.println("La persona " + pers.get(i).getApellido() + " " + pers.get(i).getNombre());
//                System.out.println("elije el Perro:");
//
//                for (int j = 0; j < perro.size(); j++) {
//                    if (!perro.get(j).getAdoptado()) {
//                        System.out.println((j + 1) + ".- " + perro.get(j).getNombre());
//                    }
//
//                }
//                System.out.println("");
//                int opc = leer.nextInt();
//                pers.get(i).getPerro().add(perro.get(opc-1));
//                perro.get((opc - 1)).setAdoptado(true);
//                System.out.println("Desea Adoptar otro? (S/N)");
//                opcion = leer.next();
//            } while (!opcion.equalsIgnoreCase("N"));
//        }

    public void mostrarPersonas(ArrayList<Persona> pers) {

//        for (int i = 0; i < pers.size(); i++) {
//            System.out.println(pers.get(i).toString());
//        }
          
        for (int i = 0; i < pers.size(); i++) {
            System.out.println(pers.get(i).getNombre() + " " + pers.get(i).getApellido());
            System.out.println("---------------");
            for (int j = 0; j < pers.get(i).getPerroPersona().size(); j++) {
                System.out.println(pers.get(i).getPerroPersona().get(j).getNombre() + " - "+ pers.get(i).getPerroPersona().get(j).getRaza());
            }
            System.out.println("");
        }
           System.out.println("");
        
    }

    public void mostrarPerros(ArrayList<Perro> perroArray) {

        for (Perro perro : perroArray) {
            System.out.println(perro);
        }
        System.out.println("");
    }

}
