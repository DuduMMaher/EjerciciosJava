/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12_ej01;

import Entities.Animal;
import Entities.Caballo;
import Entities.Gato;
import Entities.Perro;

/**
 *
 * @author dudum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal perro1 = new Perro ("Stich", "Carnivero", 15, "Dberman");
        perro1.alimentarse();
        Animal perro2 = new Perro ("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarse();
        Animal gato1 = new Gato ("Pelusa", "Galletas", 15, "Siames");
        gato1.alimentarse();
        Animal caballo1 = new Caballo ("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();
        
        
        
    }
    
}
