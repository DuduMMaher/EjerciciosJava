/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;

import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class CuentaBancariaServicios {

    CuentaBancaria c1 = new CuentaBancaria();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearCuenta() {

        System.out.print("Ingrese Nro de Cuenta: ");
        c1.setCuenta(leer.nextInt());
        System.out.print("Ingrese DNI: ");
        c1.setDni(leer.nextLong());
        System.out.print("Ingrese el saldo Inicial: ");
        c1.setSaldo(leer.nextDouble());

    }

    public void ingresarDinero() {

        System.out.print("Que monto desea depositar?: ");
        c1.setSaldo((c1.getSaldo() + (leer.nextDouble())));

    }

    public void retiroDinero() {

        System.out.print("Que monto desea retirar?: ");
        double retiro = leer.nextDouble();

        if (retiro <= (c1.getSaldo())) {
            c1.setSaldo((c1.getSaldo() - retiro));

        } else {

            System.out.println("El saldo maximo que puede sacar es de $" + c1.getSaldo());
            c1.setSaldo(0.00);

        }

    }

    public void retiroRapido() {

        System.out.println("RETIRO EXPRESS");
        System.out.println("Ingrese el monto a retirar(solo ");
        System.out.print("hasta el 20% del total del saldo)");
        double retiro;
        boolean ref1;
        do {
            retiro = leer.nextDouble();
            if (retiro <= (c1.getSaldo() * .2)) {
                c1.setSaldo((c1.getSaldo() - retiro));
                ref1 = false;
            } else {
                System.out.println("Su monto excede el 20% de su saldo");
                System.out.println("Saldo actual: " + c1.getSaldo());
                System.out.print("Ingrese un nuevo monto a retirar. ");
                ref1 = true;
            }
        } while (ref1);

    }

    public void mostrarSaldo() {

        System.out.println("El saldo de su cuenta es de $" + c1.getSaldo());

    }

    public void mostrarDatos() {

        System.out.println(c1.toString());
    }

}
