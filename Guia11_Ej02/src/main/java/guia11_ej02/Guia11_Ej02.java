/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package guia11_ej02;

import Entities.Juego;
import Entities.Jugador;
import Entities.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Guia11_Ej02 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Juego jue = new Juego();
        ArrayList<Jugador> jugadores = new ArrayList();
        RevolverDeAgua rda = new RevolverDeAgua();
        
        System.out.println("Cuantos jugadores van a ser? (Maximo 6)");
        int cantJugadores = leer.nextInt();
        if (cantJugadores > 6) {
            cantJugadores = 6;
        }
        for (int i = 0; i < cantJugadores; i++) {
            boolean mojado = false;
            jugadores.add(new Jugador((i + 1), mojado));
        }
        
        System.out.println("Inicia el Juego");
        
        rda.llenarRevolver();
        
        System.out.println(rda.toString());
        
        jue.ronda(jugadores, rda);
        
    }
}
