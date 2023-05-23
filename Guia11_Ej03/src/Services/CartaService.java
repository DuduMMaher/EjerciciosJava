/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class CartaService {
    
    private int ultimaCartaR;
    

    Scanner leer = new Scanner(System.in);
    
    public Carta crearBaraja(int i, int j) {
        
        
        int palo = i+1;
        
        if (j>6){
            j=j+2;
        }
        int numero =j+1;
        boolean rep=false;
        
        return new Carta(numero, palo, rep);
    }

    public void mostrarBaraja(ArrayList<Carta> maso) {
        
        for (Carta carta : maso) {
            System.out.println(carta.toString());
        }
    }

    public void barajar(ArrayList<Carta> maso) {
        
        Collections.shuffle(maso);
        
    }
    
    
    public void cartasDisponibles(ArrayList<Carta> maso) {
       
        int cont=0;
        for (Carta carta : maso) {
            if (!carta.getRepartida()) {
                System.out.println(carta.toString());
                cont++;
            }
        }
        System.out.println("La cantidad de cartas Disponibles es de " + cont);
        
        
        
    }

    public void darCartas(ArrayList<Carta> maso) {
       
        System.out.println("Cuantas cartas queire dar");
        int cartasDar = leer.nextInt();
        
        if ((40-ultimaCartaR)>=cartasDar){
            for (int i = 0; i < cartasDar; i++) {
                System.out.println(maso.get(i+ultimaCartaR).toString());
                maso.get(i+ultimaCartaR).setRepartida(true);
            }
            this.ultimaCartaR= ultimaCartaR+cartasDar;
        } else {
            System.out.println("No Alcnzan las carta para repartir");
        }
    }

    public void cartasQueYaSalieron(ArrayList<Carta> maso) {
        
        int cont=0;
        for (Carta carta : maso) {
            if (carta.getRepartida()) {
                System.out.println(carta);
                cont++;
            }
        }
        System.out.println("La cantidad de cartas Repartidas es de " + cont);
        
        
    }

    
    
}
