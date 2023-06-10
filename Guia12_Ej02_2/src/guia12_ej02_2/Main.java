/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12_ej02_2;

import Entities.Electrodomestico;
import Entities.Lavadora;
import Entities.Televisor;
import Servicios.Servicios;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author dudum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Servicios serv = new Servicios();
        
      //  public Lavadora(Integer carga, String color, String consumo, Double peso) 
      //  public Televisor(Integer pulgadas, Boolean sintonizador, String color, String consumo, Double peso)
        Lavadora lav1 = new Lavadora(30, "Blanco", "C", 50d);
        Lavadora lav2 = new Lavadora(50, "Gris", "A", 30d);
        Televisor tele1 = new Televisor(55, true, "Rojo", "B", 25d);
        Televisor tele2 = new Televisor(32, false, "Negro", "E", 50d);
        List<Electrodomestico> ele = new ArrayList();
        
        ele.add(lav1);
        ele.add(lav2);
        ele.add(tele1);
        ele.add(tele2);
        
        
        Double precioTot=0.0;
        Double precioLav=0.0;
        Double precioTele=0.0;
        
        
        
        for (Electrodomestico aux : ele) {
            aux.precioFinal();
            precioTot+= aux.getPrecio();
            
            if (aux instanceof Lavadora) {
                
                precioLav+= aux.getPrecio();
                
            }
            System.out.println(aux);
        }
        
        System.out.println("Precio Total: "+ precioTot);
        System.out.println("Precio Lavadoras: " + precioLav);
        System.out.println("Precio Televisores: " + (precioTot - precioLav));
        
        
//        lav.crearLavadora();
//        lav.precioFinal();
//        System.out.println(lav);
//
//        tele.crearTelevisor();
//        tele.precioFinal();
//        System.out.println(tele);

    }

}
