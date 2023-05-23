/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author dudum
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {

        this.jugadores = jugadores;
        this.revolver = r;
    }

    public void ronda(ArrayList<Jugador> jugadores, RevolverDeAgua r) {

        Random rd = new Random();

        int comienzo = rd.nextInt(jugadores.size());
        System.out.println("Vamos a arrancar por el " + jugadores.get(comienzo).getJugador());
        wait(2000);  
        int cont = (comienzo - 1);
        boolean dispMoja = false;
        do {
            if (cont == (jugadores.size() - 1)) {
                cont = -1;
            }
            cont++;
            System.out.println("El " + jugadores.get(cont).getJugador() + " dispara...");
            wait(2000);
            dispMoja = jugadores.get(cont).disparo(r);
            if (!dispMoja) {
                r.siguienteChorro();
            } else {
                jugadores.get(cont).setMojado(dispMoja);
            }
        } while (!dispMoja);

        System.out.println("El " + jugadores.get(cont).toString());
        System.out.println("Ha Perdido");
    }

    public static void wait(int ms) {

        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
