/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {

        System.out.println("Ingrese la palabra para el Ahorcado");
        String palabra = leer.next().toUpperCase();
        System.out.println("Ingrese la cantidad de intentos para el jugador");
        int intentos = leer.nextInt();

        return new Ahorcado(palabra, intentos);
    }

    public String[] crearVectoresAuxliliares(Ahorcado ah, int a) {

        String[] palabraAh = new String[longitud(ah)];

        for (int i = 0; i < longitud(ah); i++) {

            if (a == 1) {
                palabraAh[i] = "_";
            } else {
                palabraAh[i] = ah.getPalabra()[i];
            }
        }
        return palabraAh;
    }

    public void jugarAhorcado(Ahorcado ah, String[] palabraAh1, String[] palabraAh2) {

        String letra;
        String opc;
        int cant;
        int cantTotal = 0;
        int pos;
        int intentos = 0;
        boolean ref = true;

        System.out.println("La palabra tiene " + longitud(ah) + " letras");
        System.out.println("");

        do {
            for (int k = 0; k < longitud(ah); k++) {
                System.out.print(palabraAh1[k] + " ");
            }

            System.out.println("");
            if (ref) {
                System.out.println("USTED tiene " + ah.getIntentos() + " intentos para acertar la palabra");
            } else {
                System.out.println("A USTED le quedan " + (ah.getIntentos() - intentos) + " intentos para acertar la palabra");
            }
            ref = false;
            System.out.println("Ingrese la letra deseada");
            letra = leer.next().toUpperCase();
            cant = buscarCant(ah, letra, palabraAh2);
            if (cant == 0) {
                System.out.println("La letra ingresada NO es correcta");
                intentos = intentos(intentos);
            } else {
                for (int j = 0; j < cant; j++) {
                    pos = buscarDonde(ah, letra, palabraAh2);
                    palabraAh1[pos] = letra;
                    palabraAh2[pos] = "";
                }
                cantTotal = cantTotal + cant;
            }
            if (cantTotal == longitud(ah)) {
                System.out.println("FELICITACIONES!!!");
                System.out.println("Acerto la Palabra");
                break;
            }
        } while (intentos != ah.getIntentos());
        if (cantTotal != longitud(ah)) {

            System.out.println("LASTIMA!! USTED NO ACERTO");
            System.out.print("La palabra era ");
            for (int i = 0; i < longitud(ah); i++) {
                System.out.print(ah.getPalabra()[i]);
            }
            System.out.println("");
        }
    }

    public int longitud(Ahorcado ah) {

        return ah.getPalabra().length;
    }

    public int buscarCant(Ahorcado ah, String letra, String[] palabraAh2) {

        int cant = 0;

        for (int i = 0; i < longitud(ah); i++) {
            if (letra.equals(palabraAh2[i])) {
                cant++;
            }
        }
        return cant;
    }

    public int buscarDonde(Ahorcado ah, String letra, String[] palabraAh2) {

        int i;
        for (i = 0; i < longitud(ah); i++) {
            if (letra.equals(palabraAh2[i])) {
                palabraAh2[i] = "";
                return i;
            }
        }

        return i;
    }

    public int intentos(int fallidos) {

        fallidos++;

        return fallidos;
    }
}
