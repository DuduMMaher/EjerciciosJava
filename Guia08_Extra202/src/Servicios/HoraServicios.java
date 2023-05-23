/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Hora;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class HoraServicios {

    public Hora ingresarHora() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la Hora");
        int hora = leer.nextInt();
        while (hora > 24) {
            System.out.println("Vuelva a ingresar la Hora");
            hora = leer.nextInt();
        }
        System.out.println("Ingrese los minutos");
        int minutos = leer.nextInt();
        while (minutos > 59) {
            System.out.println("Vuelva a ingresar los Minutos");
            minutos = leer.nextInt();
        }
        System.out.println("Ingrese los segundos");
        int segundos = leer.nextInt();
        while (segundos > 59) {
            System.out.println("Vuelva a ingresar la Segundos");
            segundos = leer.nextInt();
        }

        return new Hora(hora, minutos, segundos);
    }

    public void mostrarHora(Hora h) {

        for (int i = 0; i < 5000; i++) {
            
            String hh = "";
            String m = "";
            String s = "";

            if (h.getHora() < 10) {
                hh = "0";
            }
            if (h.getMinutos() < 10) {
                m = "0";
            }
            if (h.getSegundos() < 10) {
                s = "0";
            }
            
            System.out.println(hh + h.getHora() + ":" + m + h.getMinutos() + ":" + s + h.getSegundos());
            
            if (h.getSegundos() < 59) {
                h.setSegundos(h.getSegundos() + 1);
            } else {
                h.setSegundos(0);
                if (h.getMinutos() < 59) {
                    h.setMinutos(h.getMinutos() + 1);
                } else {
                    h.setMinutos(0);
                    if (h.getHora() < 23) {
                        h.setHora(h.getHora() + 1);
                    } else {
                        h.setHora(0);
                    }
                }
            }
            
            wait(900);
        }
    }

    public static void wait(int ms) {

        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
