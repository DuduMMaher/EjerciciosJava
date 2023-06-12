/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Exceptions.OwnException;
import HacksDPackage.Servicios;
import Persona.Persona;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Servicios serv = new Servicios();

//    public String validarString() {
//        String entrada = leer.next();
//        while (entrada.isEmpty()) {
//            System.out.print("Ingrese un valor válido.\n");
//            entrada = leer.next();
//        }
//        return entrada;
//    }
    public Persona crearPersona() throws OwnException, InputMismatchException {

        String nombre = "";
        System.out.print("Nombre: ");
        do {
            try {
                nombre = leer.next().toUpperCase();
                while (nombre.isEmpty()) {
                    throw new OwnException("El campo esta vacio");
                }
                break;
            } catch (OwnException a) {

                System.out.println(a.getMessage());
//            nombre = leer.next();
            }
        } while (true);
        int edad = 0;
        do {
            try {
                System.out.print("Edad: ");
                edad = leer.nextInt();
                if (edad > 110) {
                    throw new OwnException("Edad incorrecta");
                }
                break;
            } catch (OwnException b) {
                System.out.println(b.getMessage());
            } catch (InputMismatchException a) {
                System.out.println("Ingrese un numero valido");
            }
            leer.nextLine();
        } while (true);

        String sexo;
        do {
            System.out.print("Sexo: ");
            sexo = leer.next().toUpperCase();
        } while ((!"M".equals(sexo)) && (!"F".equals(sexo)) && (!"O".equals(sexo)));

        double altura = 0;
        do {
            try {
                System.out.print("Altura: ");
                altura = leer.nextDouble();
                if (altura == 0) {
                    throw new OwnException("El campo esta vacio");
                }
                if (altura > 2.2) {
                    throw new OwnException("Altura Incorrecta");
                }
                break;
            } catch (OwnException c) {
                System.out.println(c.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Usted no ingreso un numero valido");
                leer.nextLine();
            }
        } while (true);

        
        double peso;
        do {
            try {
                System.out.print("Peso: ");
                peso = leer.nextDouble();
                if (peso > 280) {
                    throw new OwnException("Valor de peso incorrecto");
                }
                break;
            } catch (OwnException a) {
                System.out.println(a.getMessage());
            } catch (InputMismatchException b) {
                System.out.println("Ingrese un numero valido");
                leer.nextLine();
            }
        } while (true);
        return new Persona(nombre, sexo, edad, peso, altura);
    }

    public boolean esMayorDeEdad(Persona p) {

        boolean edadM;

        edadM = p.getEdad() >= 18;
        System.out.println("La edad de " + p.getNombre() + " es de " + p.getEdad() + " años");
        return edadM;
    }

    public int calcularIMC(Persona p) {

        int indice = 0;

        double peso = p.getPeso();
        double altura = p.getAltura();

        double ideal = (peso / (altura * altura));

        if (ideal < 20) {
            indice = -1;
        }
        if (ideal >= 20 && ideal <= 25) {
            indice = 0;
        }
        if (ideal > 25) {
            indice = 1;
        }
        return indice;
    }

    public int buscarPersona(Persona[] p) {

        System.out.println("Ingrese el nombre del persona de la que quiere saber");
        String nom = leer.next().toUpperCase();

        for (int i = 0; i < buscarPrimerVacio(p); i++) {

            if (p[i].getNombre().equals(nom)) {

                return i;
            }
        }

        return 101;
    }

    public int buscarPrimerVacio(Persona[] p) {

        int i = 0;
        while (p[i] != (null)) {
            i++;
            if (i == 99) {
                break;
            }
        }

        return i;

    }

}
