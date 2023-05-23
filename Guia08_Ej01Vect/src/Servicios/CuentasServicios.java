/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cuentas;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class CuentasServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cuentas c1 = new Cuentas();

    public void ingresarCuenta() {

        int ucta = ultimaCuenta();

        System.out.println("Su numero de cuenta sera: " + c1.cuenta[ucta]);
        System.out.print("Ingrese Numero de DNI: ");
        c1.dni[ucta] = leer.nextLong();
        System.out.print("Ingrese su Nombre: ");
        c1.nombre[ucta] = leer.next();
        c1.saldo[ucta] = 0;
    }

    public int ultimaCuenta() {

        int vect = 0;
        long x;

        x = c1.dni[0];

        while (x != 0) {
            vect++;
            x = c1.dni[vect];
        }
        return vect;
    }

    public void inicializarVector() {

        for (int i = 0; i < 100; i++) {
            c1.dni[i] = 0;
        }
        for (int i = 0; i < 100; i++) {
            c1.cuenta[i] = (1000 + i);
        }
    }

    public int buscarCuenta() {
        System.out.print("Ingrese su DNI: ");
        long doc = leer.nextLong();

        for (int i = 0; i < 100; i++) {
            if (c1.dni[i] == doc) {
                return i;
            }
        }
        System.out.println("El Cliente no existe");
        return 101;
    }

    public void ingresarDinero() {

        int posicion = buscarCuenta();
        if (posicion != 101) {
            System.out.println("Su cuenta es la Nro. " + c1.cuenta[posicion]);
            System.out.print("Ingrese el monto a Depositar: ");
            c1.saldo[posicion] += leer.nextDouble();
        }
    }

    public void retiroDinero() {

        int posicion = buscarCuenta();
        if (posicion != 101) {
            System.out.println("Su cuenta es la Nro. " + c1.cuenta[posicion]);
            System.out.print("Ingrese el monto a Retirar: ");
            double retiro = leer.nextDouble();
            if (retiro <= c1.saldo[posicion]) {
                c1.saldo[posicion] -= retiro;
            } else {
                System.out.println("Su saldo es de $" + c1.saldo[posicion]);
                System.out.println("Este es el total que puede retirar");
                c1.saldo[posicion] = 0;
            }
        }

    }

    public void retiroRapido() {

        int posicion = buscarCuenta();

        if (posicion != 101) {
            System.out.println("Su cuenta es la Nro. " + c1.cuenta[posicion]);
            System.out.println("Ingrese el monto a Retirar: ");
            System.out.println("Su saldo actual es de: " + c1.saldo[posicion]);
            System.out.println("El Retiro Express no puede ");
            System.out.println("superar el 20% del Saldo");
            double retiro = leer.nextDouble();
            if (retiro <= (c1.saldo[posicion]*.2)) {
                c1.saldo[posicion] -= retiro;
            } else {
                 do {
                System.out.println("Su saldo es de $" + c1.saldo[posicion]);
                System.out.println("Este es el maximo que puede retirar $" + (c1.saldo[posicion]*.2) );
               
                    System.out.println("Vuelva a Ingresar el Monto a retirar");
                    retiro=leer.nextDouble();
                    c1.saldo[posicion] -= retiro;
                } while (retiro>(c1.saldo[posicion]*.2));
                
            }
        }
    }

    public void mostrarSaldo(){
        
        int posicion = buscarCuenta();
        
        System.out.println("Nro de Cuenta: " + c1.cuenta[posicion]);
        System.out.println("Nombre: " + c1.nombre[posicion]);
        System.out.println("DNI: " + c1.dni[posicion]);
        System.out.println("Saldo: $" + c1.saldo[posicion]);
        
    }
    
    
    
}
