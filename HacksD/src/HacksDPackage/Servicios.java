/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HacksDPackage;

import Enums.Apellidos;
import Enums.Estado_Civil;
import Enums.Materias;
import Enums.Nombres;
import Enums.Sectores;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kinoc
 */
public class Servicios {

    Scanner leer = new Scanner(System.in);
    Random nom = new Random();

    public int validarEntero() {
        while (true) {
            try {
                return Integer.parseInt(leer.next());
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un numero valido.\n");}
        }
    }

    public double validarDouble() {
        while (true) {
            try {
                return Double.parseDouble(leer.next());
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un numero valido.\n");}
        }
    }

    public String validarString() {
        String entrada = leer.next();
        while (entrada.isEmpty()) {
            System.out.print("Ingrese un valor válido.\n");
            entrada = leer.next();
        }
        return entrada;
    }

    public String nombre() {
        return Nombres.values()[nom.nextInt(Nombres.values().length)].name();
    }

    public String apellido() {
        return Apellidos.values()[nom.nextInt(Apellidos.values().length)].name();
    }

    public String apellidoNombre() {

        return apellido() + ", " + nombre();
    }

    public String nombreApellido() {
        return nombre() + " " + apellido();
    }

    public int generarDni() {
        int dni;
        do {
            dni = nom.nextInt(50000000);
        } while (dni < 15000000);
        return dni;
    }

    public void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public String estadoCivil() {
        return Estado_Civil.values()[nom.nextInt(Estado_Civil.values().length)].name();
    }
    
    public String elegirEstadoCivil(int a){
        return Estado_Civil.values()[(a-1)].name();   
    }
    
    public void mostrarEstadoCivil() {
        for (int i = 0; i < Estado_Civil.values().length; i++) {
            System.out.println((i+1)+".- " + Estado_Civil.values()[i].name());
        }
    }

    public int anio(int a, int b ) {
        int anio;
        do {
            anio = nom.nextInt(b);
        } while (anio < a);
        return anio;
    }
    
    public int numero(int a){
        return nom.nextInt(a);
    }
    
    public String materia(){
        
        return Materias.values()[nom.nextInt(Materias.values().length)].name();
    }
    
    public void mostrarMateria(){
        for (int i = 0; i < Materias.values().length; i++) {
            System.out.println((i+1)+".- " + Materias.values()[i].name());
        }
    }
    
    public String elejirMateria(int a){
        return Materias.values()[(a-1)].name();  
    }
       
    public String personalServicio(){
        return Sectores.values()[nom.nextInt(Sectores.values().length)].name();
    }
    
    private Date convertirFecha(String fInicio) {
//        12/5/2023   12-5-2023

        // separo el dia
        int dia;
        int mes;
        int ano;
        String auxDia = "";
        String auxMes = "";
        String auxAno = "";
        int contBarra = 1;

        for (int i = 0; i < fInicio.length(); i++) {
            switch (contBarra) {
                case 1:
                    if (!fInicio.substring(i, i + 1).equals("/") && !fInicio.substring(i, i + 1).equals("-")) {
                        auxDia = auxDia.concat(fInicio.substring(i, i + 1));
                    } else {
                        contBarra++;
                    }
                    break;
                case 2:
                    if (!fInicio.substring(i, i + 1).equals("/") && !fInicio.substring(i, i + 1).equals("-")) {
                        auxMes = auxMes.concat(fInicio.substring(i, i + 1));
                    } else {
                        contBarra++;
                    }
                    break;
                case 3:
                    if (!fInicio.substring(i, i + 1).equals("/") && !fInicio.substring(i, i + 1).equals("-")) {
                        auxAno = auxAno.concat(fInicio.substring(i, i + 1));
                    }
            }
        }

        dia = Integer.parseInt(auxDia);
        mes = Integer.parseInt(auxMes) - 1;
        ano = Integer.parseInt(auxAno) - 1900;

        Date fecha = new Date();

        fecha.setDate(dia);
        fecha.setMonth(mes);
        fecha.setYear(ano);

        return fecha;
    }
    
    
}
