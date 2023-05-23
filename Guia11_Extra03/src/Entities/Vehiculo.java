/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Enumeradores.Tipo;

/**
 *
 * @author dudum
 */
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int ano;
    private String patente;
    private String motor;
    private String chasis;
    private String color;
    private Tipo tipo;
    private Cliente dueno;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int ano, String patente, String motor, String chasis, String color, Tipo tipo, Cliente dueno) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.patente = patente;
        this.motor = motor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.dueno = dueno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Cliente getDueno() {
        return dueno;
    }

    public void setDueno(Cliente dueno) {
        this.dueno = dueno;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", patente=" + patente + ", motor=" + motor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + ", dueno=" + dueno + '}';
    }
    
    
    
}
