/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12_ej02;

import Entities.Electrodomestico;
import Entities.Lavadora;
import Entities.Televisor;
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

        
//        List<Electrodomestico> ele = new ArrayList();
        
        Electrodomestico lava1 = new Lavadora(30, "Blanco", 'A', 35d);
        
        System.out.println(lava1.toString());
        
        
//        Electrodomestico lava2 = new Lavadora(20, "Azul", 'C', 20d);
//        Electrodomestico tele1 = new Televisor(50, true, "Negro", 'C', 25d);
//        Electrodomestico tele2 = new Televisor(35, true, "Rojo", 'F', 15d);
//        

//         ele.add(lava1);
//         ele.add(lava2);
//         ele.add(tele1);
//         ele.add(tele2);
//         
//         double sumaTotPrecio=0;
//         double sumaLavPrecio=0;
//         double sumaTelePrecio=0;
//         
//         for (Electrodomestico aux : ele) {
//            sumaTotPrecio= sumaTotPrecio + aux.getPrecio();
//            
//             if (aux instanceof Lavadora) {
//                 sumaLavPrecio=sumaLavPrecio+ aux.getPrecio();
//             }
//        }
//         
//         
//
//       
//        
//        System.out.println("El precio de los Lavadoras es de $ " + sumaLavPrecio);
//        System.out.println("El precio Total es  " + sumaTotPrecio);
//        System.out.println("");
//
//        
//        
//       
    }

}
