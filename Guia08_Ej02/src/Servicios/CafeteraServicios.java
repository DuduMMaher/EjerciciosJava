/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class CafeteraServicios {

    Scanner leer = new Scanner(System.in);

    Cafetera c1 = new Cafetera();

    public void ingresarCapacidadMaxima() {

        System.out.println("Ingrese la capacidad maxima de su Cafetera");
        c1.setCapacidadMaxima(leer.nextInt());

    }

    public void llenarCafetera() {

        if (c1.getCantidadActual() != c1.getCapacidadMaxima()) {
            c1.setCantidadActual(c1.getCapacidadMaxima() - c1.getCantidadActual());
        } else {

            System.out.println("La cafetera ya se encontraba llena");
        }

    }

    public void servirTaza() {

        System.out.print("Cual es el tamaño de la Taza?");
        int taza = leer.nextInt();

        if (c1.getCantidadActual() == 0) {
            System.out.println("La cafetera esta Vacia");
        } else {
            if (taza > c1.getCantidadActual()) {
                System.out.println("No podemos completar su taza");
                System.out.println("Solo alcanzo para " + c1.getCantidadActual() + " medidas");
                c1.setCantidadActual(0);
            } else {

                c1.setCantidadActual((c1.getCantidadActual() - taza));
            }

        }
    }

    public void vaciarCafetera() {

        System.out.println("Usted esta por vaciar la cafetera");
        System.out.println("Ponga un jarro lo suficientemete grande");
        System.out.println("como para vaciar " + c1.getCantidadActual() + " medidas");
        c1.setCantidadActual(c1.getCantidadActual() - c1.getCantidadActual());

    }

    public void agregarCafe() {

        boolean ref1;

        do {
            System.out.println("Cuanto cafe va a agregar");
            int agregar = leer.nextInt();

            if ((c1.getCantidadActual() + agregar) <= c1.getCapacidadMaxima()) {
                c1.setCantidadActual(c1.getCantidadActual() + agregar);
                ref1 = false;
            } else {
                System.out.println("La cantidad que va a agregar supera la capacidad maxima");
                System.out.println("La cant maxima a agregar es de " + (c1.getCapacidadMaxima() - c1.getCantidadActual()));
                ref1 = true;
            }
        } while (ref1);
    }

    public void verCantidad() {

        System.out.println("    " + c1.getCantidadActual() + "/" + c1.getCapacidadMaxima());
    }

}
