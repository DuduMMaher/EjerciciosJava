/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Asiento;
import Entities.Pelicula;
import Entities.Persona;
import Entities.Sala;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class CineService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    // Creamos la Pelicula
    public Pelicula crearPelicula() {

        
        int mayores=0;
        System.out.println("Ingrese el nombre de la Pelicula");
        String titulo = leer.next();
        System.out.println("Ingrese su duracion (hh.mm)");
        double duracion = validarDouble();
        System.out.println("Apta para mayores de: ");
        mayores = validarEntero();
        
        return new Pelicula(titulo, duracion, mayores);
    }

    // Creamos la Persona
    public Persona crearPersona(int dni) {

        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        if (dni == 0) {
            System.out.println("Ingrese DNI");
            dni = validarEntero();
        }
        System.out.println("Ingrese su edad");
        int edad = validarEntero();
        System.out.println("Con cuanto dinero cuenta? ");
        double dinero = validarDouble();

        return new Persona(nombre, dni, edad, dinero);
    }

    public void asignarPeliculaSala(Sala[] salaArray, ArrayList<Pelicula> peliList) {

        String opc1 = "";
        int a;
        int b = 0;
        int opc2;
        int opc3;

        mostrarPeliculas(peliList);
        
        for (int i = 0; i < salaArray.length; i++) {
            if (salaArray[i].getPeli() == null) {
                System.out.println("Sala " + (i + 1) + " esta vacia");
            } else {
                System.out.println("En la Sala " + (i + 1) + " se esta proyectando " + salaArray[i].getPeli().getTitulo());
            }
        }
        System.out.println("Que Pelicula desea Asignar?");
        opc2 = validarEntero();
        System.out.println("En que sala desea Proyectarla");
        opc3 = validarEntero();

        salaArray[opc3 - 1].setPeli(peliList.get(opc2 - 1));

    }
    public void mostrarPeliculas(ArrayList<Pelicula> peliList){
        
        int a= 1;
        System.out.println("SubMENU Peliculas");
        System.out.println("-----------------");

        for (Pelicula pelicula : peliList) {
            System.out.println(a + ".- " + pelicula.getTitulo() + " // Duracion: " + pelicula.getDuracion().getHours() + "hs " + pelicula.getDuracion().getMinutes() + "mins");
            a++;
        }
        System.out.println("");

        
        
    }

    public String buscarSalasLibres(Sala[] s) {

        String i = "";

        for (int j = 0; j < 3; j++) {
            if (s[j] == null) {
                i = "" + (j + 1) + "";
            }
        }
        return i;
    }

    public void comprarTicket(List<Persona> persList, Sala[] salaArray, List<Pelicula> peliList) {

        System.out.println("Ingrese su DNI");
        int dni = validarEntero();
        boolean ref = false;
        int a = 1;
        int opc2;
        int b = 1;
        boolean ref2 = false;
        int col = 0;
        int persIndex = 0;

        for (Persona aux : persList) {
            if (aux.getDni() == dni) {
                ref = true;
                break;
            }
        }

        if (!ref) {
            persList.add(crearPersona(dni));
        }
        // Conseguimos el Index de la persona
        for (Persona aux : persList) {
            if (dni == aux.getDni()) {
                break;
            }
            persIndex++;
        }

        System.out.println("Este es el listado de peliculas disponibles");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < salaArray.length; i++) {
            if (salaArray[i].getPeli() != (null)) {
            System.out.println(a + ".- " + salaArray[i].getPeli().getTitulo() + "  // " + salaArray[i].getPeli().getDuracion().getHours() + "hs " + salaArray[i].getPeli().getDuracion().getMinutes() + "mins // Apta Mayores de " + salaArray[i].getPeli().getEdadMinima() + " años");
            a++;
            }
        }
            

        System.out.println("Que pelicula quiere ver?");
        opc2 = validarEntero();

        System.out.println("El costo de la misma es de $ " + salaArray[opc2 - 1].getPrecio());

        // Revisamos billetera
        if (persList.get(persIndex).getDinero() >= salaArray[opc2 - 1].getPrecio() && persList.get(persIndex).getEdad() >= salaArray[opc2 - 1].getPeli().getEdadMinima()) {
            persList.get(persIndex).setDinero(persList.get(persIndex).getDinero() - salaArray[opc2 - 1].getPrecio());
            ref2 = true;
        } else {
            if (persList.get(persIndex).getDinero() < salaArray[opc2 - 1].getPrecio()) {
                System.out.println("No tiene dinero disponible para la entrada");
            } else {
                System.out.println("Usted es menor");
            }
        }

        if (ref2) {
            mostrarSala(salaArray, (opc2 - 1), false);
            System.out.println("Elija un asiento");
            String asiento = leer.next().toUpperCase();
            int fila = Integer.parseInt(asiento.substring(0, 1))-1;
            String columna = asiento.substring(1);
            switch (columna) {
                case "A":
                    col = 0;
                    break;
                case "B":
                    col = 1;
                    break;
                case "C":
                    col = 2;
                    break;
                case "D":
                    col = 3;
                    break;
                case "E":
                    col = 4;
                    break;
                case "F":
                    col = 5;
                    break;
            }

            salaArray[opc2 - 1].getAsientos()[fila][col].setOcupado(ref2);
            salaArray[opc2 - 1].getAsientos()[fila][col].setPers(persList.get(persIndex));

        }
    }

    public void mostrarSala(Sala[] salaArray, int a, boolean menu) {

        String[] columna = {"A", "B", "C", "D", "E", "F"};
        System.out.println("Esta es la Sala Nro " + (a + 1));
        System.out.println("----------------------");
        System.out.println("Asientos");
        System.out.println("");
        System.out.print("       | ");
        for (int i = 0; i < 6; i++) {
            System.out.print(columna[i] + " | ");
        }
        System.out.println("");
        for (int i = 0; i < 8; i++) {
            System.out.print("Fila " + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print(" | " + salaArray[a].getAsientos()[i][j].toString());
            }
            System.out.println("");
        }

        System.out.println("");
        if (menu) {
            System.out.println("Los asientos fueron comprados por:");
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 6; j++) {
                    if (salaArray[a].getAsientos()[i][j].isOcupado()){
                        System.out.println("Asiento " + (i+1)+ convertirALetra(j+1) + " esta ocupado por " + salaArray[a].getAsientos()[i][j].getPers().getNombre());
                    }
                }
            }
            System.out.println("");
        }
    }

    public String convertirALetra(int j){
        
        String letra="";
        
        switch (j){
            
            case 1:
                    letra="A";
                    break;
                case 2:
                    letra="B";
                    break;
                case 3:
                    letra="C";
                    break;
                case 4:
                    letra="D";
                    break;
                case 5:
                    letra="E";
                    break;
                case 6:
                    letra="F";
                    break;
        }
        return letra;
    }
    
    public void establecerPreciosSalas(Sala[] salaArray) {

        System.out.println("Estos son los precios Actuales de las Salas");
        for (int i = 0; i < salaArray.length; i++) {
            System.out.println("Sala " + (i + 1) + " $ " + salaArray[i].getPrecio());
        }
        System.out.println("");
        System.out.println("A que Sala le quiere cambiar el precio");
        int sala = validarEntero();
        System.out.println("Ingrese el nuevo precio");
        double nuevoPrecio = validarDouble();
        salaArray[sala - 1].setPrecio(nuevoPrecio);
        System.out.println("EL PRECIO HA SIDO CAMBIADO");
    }

    public Sala ingresarSalas(Sala[] salaArray) {

        
        System.out.println("Es sala VIP (S/N)");
        boolean vip = leer.next().equalsIgnoreCase("S");
        System.out.println("Ingrese el valor de la Entrada para esta Sala");
        double precio = validarDouble();
        return new Sala(vip, precio);

    }

    private int validarEntero() {
        while (true) {
            try {
                return Integer.parseInt(leer.next());
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un número entero válido.\n");
            }
        }
    }
    
    private double validarDouble() {
        while (true) {
            try {
                return Double.parseDouble(leer.next());
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un número válido.\n");
            }
        }
    }

}
