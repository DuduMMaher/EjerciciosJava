/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12_extra03;

import Entities.Alojamiento;
import Entities.Camping;
import Entities.Hotel4;
import Entities.Hotel5;
import Entities.Residencia;
import Service.HotelService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Alojamiento> alojaArray = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HotelService hs = new HotelService();

        Hotel4 hot1 = new Hotel4(25, 52, 3, "B", "Carlitos", 35, "El Manco", "Olmos 458", "CABA", "Pichici");
        Hotel4 hot2 = new Hotel4(70, 280, 7, "A", "Lola", 135, "El Okupa", "Balcarce 50", "CABA", "Alberto");
        Hotel5 hot3 = new Hotel5(5, 10, 10, 250, 10, 15, "A", "Pepino", 150, "Los otros Rochos", "Alcorta 1550", "CABA", "Mauricio");
        Hotel5 hot4 = new Hotel5(3, 6, 5, 150, 5, 10, "A", "Kansas", 100, "Instituto P", "Junin y Ayacucho", "CABA", "La Cris");

        alojaArray.add(hot1);
        alojaArray.add(hot2);
        alojaArray.add(hot3);
        alojaArray.add(hot4);

        Camping aeh1 = new Camping(50, 8, true, true, 15000, "Vuelta y vuelta", "Ruta 25 Km 428", "Miramar", "Sergio");
        Camping aeh2 = new Camping(60, 10, false, true, 25000, "Quilombo Express", "Ruta 11, Km 325", "San Beranrdo", "Lilita");
        Residencia aeh3 = new Residencia(5, false, false, true, 5000, "La Chinche", "Av. 3 1548", "Villa Gessell", "Maximo");
        Residencia aeh4 = new Residencia(25, true, true, true, 15000, "El Chori y la Coca", "Av. Bunge 158", "Pinamar", "Hugito");

        alojaArray.add(aeh1);
        alojaArray.add(aeh2);
        alojaArray.add(aeh3);
        alojaArray.add(aeh4);

        for (Alojamiento aux : alojaArray) {
            if (aux instanceof Hotel4) {
                ((Hotel4) aux).setPrecioHab(aux.calcularPrecio(aux));
                continue;
            }
            if (aux instanceof Hotel5) {
                ((Hotel5) aux).setPrecioHab(aux.calcularPrecio(aux));
            }
        }

        int opc;
        do {
            System.out.println("MENU");
            System.out.println("--------");
            System.out.println("1.- Listado de Alojamientos");
            System.out.println("2.- Ver precios Hoteles");
            System.out.println("3.- Ordenar x Precio");
            System.out.println("4.- Ver los campings con Resto");
            System.out.println("5.- Residencias con Descuento");
            System.out.println("6.- ");
            System.out.println("7.- ");
            System.out.println("8.- ");
            System.out.println("9.- Salir");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("");
                    System.out.println("Listado de Alojamientos");
                    for (Alojamiento aux : alojaArray) {
                        System.out.println(aux);
                    }
                    break;
                case 2:
                    for (Alojamiento aux : alojaArray) {
                        if (aux instanceof Hotel4) {
                            System.out.println(((Hotel4) aux).getPrecioHab());
                            continue;
                        }
                        if (aux instanceof Hotel5) {
                            System.out.println(((Hotel5) aux).getPrecioHab());
                        }
                    }
                    break;
                case 3:
                    hs.ordenarPorPrecio(alojaArray);
                    break;
                case 4 :
                    hs.mostrarCampConResto(alojaArray);
                    break;
                case 5:
                    hs.residenciasConDesc(alojaArray);
                    
            }
        } while (opc != 9);
    }

}
