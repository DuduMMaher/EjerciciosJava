/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author dudum
 */
public class CuentaBancaria {
    
    
    private long dni;
    private int cuenta;
    private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(long dni, int cuenta, double saldo) {
      
        this.dni = dni;
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "dni=" + dni + ", cuenta=" + cuenta + ", saldo=" + saldo + '}';
    }
    
    
    
    
}
