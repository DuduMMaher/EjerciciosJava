/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07_extra05.Entidades;

import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Cuenta {

    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirarDinero(double retiro) {

        if (saldo > retiro) {
            saldo -= retiro;

        } else {
            System.out.println("Saldo Insuficiente para retirar esa cantidad");
        }
    }

    public void saldoInicial() {

        Scanner leer = new Scanner(System.in);

        System.out.print("Nombre del Titular: ");
        titular = leer.next();
        System.out.print("Saldo Inicial: ");
        saldo = leer.nextDouble();
    }
}
