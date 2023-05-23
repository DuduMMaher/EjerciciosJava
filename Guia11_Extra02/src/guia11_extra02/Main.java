/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11_extra02;

import Entities.Pelicula;
import Entities.Persona;
import Entities.Sala;
import Services.CineService;
import java.util.ArrayList;
import java.util.List;
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

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CineService cs = new CineService();
        List<Persona> persList;
        ArrayList<Pelicula> peliList;

        // creamos Lista de personas 
        persList = new ArrayList();

        // creamos Lista de Peliculas
        peliList = new ArrayList();

        // creamos Array de 3 Salas
        Sala[] salaArray = new Sala[3];

        System.out.println("Este cine cuenta con 3 Salas ");
        System.out.println("Donde se proyectan diferentes Peliculas");
        System.out.println("con diferente costo dependiendo de la Sala");
        System.out.println("-----------------------------------------");
        System.out.println("");
        System.out.println("Lo primero va a ser Definir las Salas");
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.println("Sala " + (i + 1));
            salaArray[i] = cs.ingresarSalas(salaArray);
        }

        int opc;
        do {
            System.out.println("MENU");
            System.out.println("--------");
            System.out.println("1.- Ingresar Personas");
            System.out.println("2.- Ingresar Pelicula");
            System.out.println("3.- Asignar Pelicula a una Sala");
            System.out.println("4.- Comprar Ticket");
            System.out.println("5.- Establecer los precios de las Salas");
            System.out.println("6.- Ver Ocupacion de las Salas");
            System.out.println("7.- Pelicula Exhibida (limpiar Sala)");
            System.out.println("8.- Ver Peliculas");
            System.out.println("9.- Salir");

            opc = leer.nextInt();

            switch (opc) {

                case 1:
                    persList.add(cs.crearPersona(0));
                    break;
                case 2:
                    peliList.add(cs.crearPelicula());
                    break;
                case 3:
                    cs.asignarPeliculaSala(salaArray, peliList);
                    break;
                case 4:
                    cs.comprarTicket(persList, salaArray, peliList);
                    break;
                case 5:
                    cs.establecerPreciosSalas(salaArray);
                    break;
                case 6:
                    System.out.println("Que Sala quiere Ver?(1/2/3)");
                    int sala = leer.nextInt();
                    cs.mostrarSala(salaArray, (sala-1), true);
                    break;
                case 7:
                    break;
                case 8:
                    cs.mostrarPeliculas(peliList);
                    break;
                case 9:
                    break;

            }

        } while (opc != 9);

    }

}
