/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia08_extra202;

import Entidades.Hora;
import Servicios.HoraServicios;
import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Guia08_Extra202 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        HoraServicios hs = new HoraServicios();
        Scanner leer = new Scanner(System.in);

        Hora h = hs.ingresarHora();

        hs.mostrarHora(h);

 

    }

}
