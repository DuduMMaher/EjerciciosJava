/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.ParDeNumeros;
import static java.lang.Math.pow;

import static oracle.jrockit.jfr.events.Bits.doubleValue;

/**
 *
 * @author dudum
 */
public class ParDeNumerosService {

    public void mostrarValores(ParDeNumeros pdn) {

        System.out.println("Numero 1 " + pdn.getNum1());
        System.out.println("Numero 2 " + pdn.getNum2());

    }

    public int devolverMayor(ParDeNumeros pdn) {

        int valor;

        Double num1 = pdn.getNum1();
        Double num2 = pdn.getNum2();

        int num3 = num1.compareTo(num2);

        System.out.println(num3);

        switch (num3) {
            case 0:
                System.out.println("Los numero son iguales");
                break;
            case -1:
                System.out.println("El numero 1 es menor al numero 2");
                break;
            default:
                System.out.println("El numero 2 es menor al numero 1");
                break;
        }
        return num3;

    }

    public void calcularPotencia(ParDeNumeros pdn, int valor) {

        int val1 = (int) doubleValue(pdn.getNum1());
        int val2 = (int) doubleValue(pdn.getNum2());

        if (valor >= 0) {
            System.out.println(String.format("%.2f", pow(val1, val2)));
        } else {
            System.out.println(String.format("%.2f", pow(val2, val1)));
        }

    }

    public void calculaRaiz(ParDeNumeros pdn, int valor) {

        int val1 = (int) doubleValue(pdn.getNum1());
        int val2 = (int) doubleValue(pdn.getNum2());

        if (valor >= 0) {
            System.out.println(String.format("%.3f", Math.sqrt(val2)));
        } else {
            System.out.println(String.format("%.3f", Math.sqrt(val1)));
        }

    }

}
