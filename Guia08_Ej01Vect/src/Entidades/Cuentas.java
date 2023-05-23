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
public class Cuentas {

    public String nombre[] = new String[100];
    public int cuenta[] = new int[100];
    public long dni[] = new long[100];
    public double saldo[] = new double[100];

    public Cuentas() {
    }

    public Cuentas(String[] nombre, int[] cuenta, long[] dni, double[] saldo) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public int[] getCuenta() {
        return cuenta;
    }

    public void setCuenta(int[] cuenta) {
        this.cuenta = cuenta;
    }

    public long[] getDni() {
        return dni;
    }

    public void setDni(long[] dni) {
        this.dni = dni;
    }

    public double[] getSaldo() {
        return saldo;
    }

    public void setSaldo(double[] saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuentas{" + "nombre=" + nombre + ", cuenta=" + cuenta + ", dni=" + dni + ", saldo=" + saldo + '}';
    }

    
    
}
