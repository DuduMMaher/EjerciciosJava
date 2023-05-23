/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author dudum
 */
public class Cliente {
    
    private String Nombre;
    private String apellido;
    private String domicilio;
    private int dni;
    private String mail;
    private String telefono;
    private ArrayList<Vehiculo> autos;

    public Cliente() {
    }

    public Cliente(String Nombre, String apellido, String domicilio, int dni, String mail, String telefono) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.dni = dni;
        this.mail = mail;
        this.telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Vehiculo> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Vehiculo> autos) {
        this.autos = autos;
    }

    @Override
    public String toString() {
        return "Clientes{" + "Nombre=" + Nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + ", dni=" + dni + ", mail=" + mail + ", telefono=" + telefono + ", autos=" + autos + '}';
    }
    
    
}
