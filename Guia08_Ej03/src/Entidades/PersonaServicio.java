/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Persona.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        System.out.print("Nombre: ");
        String nombre = leer.next().toUpperCase();
        System.out.print("Edad: ");
        int edad = leer.nextInt();
        String sexo;
        do {
            System.out.print("Sexo: ");
            sexo = leer.next().toUpperCase();
        } while ((!"M".equals(sexo)) && (!"F".equals(sexo)) && (!"O".equals(sexo)));
        System.out.print("Altura: ");
        double altura = leer.nextDouble();
        System.out.print("Peso: ");
        double peso = leer.nextDouble();

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
    public int buscarPrimerVacio(Persona[] p){
     
        int i=0;
        while (p[i] != (null)) {
            i++;
            if (i==99){
                break;
            }
        }  
        
        return i;
        
    }
    
    
}
