/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pass;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class PassServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPass(Pass p) {

        if (p.getPass().equals("")) {
            System.out.println("Usted no ha ingresado un PASSWORD aun.");
            System.out.println("Ingrese un PASSWORD");
        } else {
            System.out.println("Ingrese su NUEVO PASSWORD");
        }

        String pass = leer.next();

        while (p.getPass().equals(pass)) {
            System.out.println("Su NUEVO PASSWORD no puede ser igual al anterior");
            System.out.println("Vuelva a ingresar su NUEVO PASSWORD");
            pass = leer.next();
        }

        while (pass.length() != 10) {
            System.out.println("Debe ingresar un pass de 10 digitos");
            pass = leer.next();
        }
        p.setPass(pass);
        String nivel = analizarPass(p);

        System.out.println("El nivel se su contraseña es " + nivel);
        System.out.println("");
        presionarTecla();
    }

    public String analizarPass(Pass p) {

        int largo = p.getPass().length();
        int a = 0;
        int z = 0;
        String nivel;

        for (int i = 0; i < largo; i++) {
            if (p.getPass().substring(i, (i + 1)).equalsIgnoreCase("a")) {
                a++;
            }
            if (p.getPass().substring(i, (i + 1)).equalsIgnoreCase("z")) {
                z++;
            }
        }
        if (z >= 1) {
            nivel = "MEDIO";
            if (a >= 2) {
                nivel = "ALTO";
            }
        } else {
            nivel = "BAJO";
        }

        return nivel;
    }

    public boolean verificarPass(Pass p) {

        boolean verificacion = false;
        int i = 0;

        do {
            System.out.println("Ingrese su Password");
            String pass = leer.next();
            i++;
            if (p.getPass().equals(pass)) {
                verificacion = true;
            }
        } while (!verificacion && i != 3);

        return verificacion;
    }

    public void modificarNombre(Pass p) {

        boolean pass = verificarPass(p);

        if (pass) {
            System.out.println("Ingrese el Nuevo nombre");
            p.setNombre(leer.next());

        } else {
            System.out.println("USTED NO INGRESO UN PASSWORD CORRECTO");
        }
    }

    public void modificarDni(Pass p) {

        boolean pass = verificarPass(p);

        if (pass) {
            System.out.println("Ingrese el Nuevo DNI");
            p.setDni(leer.nextInt());

        } else {
            System.out.println("USTED NO INGRESO UN PASSWORD CORRECTO");
        }
    }

    public void modificarPass(Pass p) {

        System.out.println("Usted esta por cambiar su Password");
        boolean pass = verificarPass(p);

        if (pass) {
            crearPass(p);
        } else {
            System.out.println("NO PODEMOS CAMBIAR SU PASSWORD");
            System.out.println("USTED NO INGRESO UN PASSWORD CORRECTO");
        }
    }

    public void mostrarDatos(Pass p) {

        System.out.println(p.toString());
    }

    public void presionarTecla() {

        System.out.println("PRESIONE ENTER PARA CONTINUAR");
        leer.next();
    }
}
