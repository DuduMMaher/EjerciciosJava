/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Enumeradores.FormaPago;
import Enumeradores.TipoCobertura;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author dudum
 */
public class Poliza {
    
    private Vehiculo auto;
    private Cliente cliente;
    private int nroPoliza;
    private TipoCobertura cobertura;
    private double montoAsegurado;
    private double montoPrima;
    private boolean granizo;
    private boolean vigente;
    private Date fechaInicio;
    private Date fechaFin;
    private ArrayList<Cuota> cuotas;
    private FormaPago formaPago;

    public Poliza() {
    }

    public Poliza(Vehiculo auto, Cliente cliente, int nroPoliza, TipoCobertura cobertura, double montoAsegurado, double montoPrima, boolean granizo, boolean vigente, Date fechaInicio, Date fechaFin, ArrayList<Cuota> cuotas, FormaPago formaPago) {
        this.auto = auto;
        this.cliente = cliente;
        this.nroPoliza = nroPoliza;
        this.cobertura = cobertura;
        this.montoAsegurado = montoAsegurado;
        this.montoPrima = montoPrima;
        this.granizo = granizo;
        this.vigente = vigente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cuotas = cuotas;
        this.formaPago = formaPago;
    }

    public Vehiculo getAuto() {
        return auto;
    }

    public void setAuto(Vehiculo auto) {
        this.auto = auto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(int nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public TipoCobertura getCobertura() {
        return cobertura;
    }

    public void setCobertura(TipoCobertura cobertura) {
        this.cobertura = cobertura;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public double getMontoPrima() {
        return montoPrima;
    }

    public void setMontoPrima(double montoPrima) {
        this.montoPrima = montoPrima;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Poliza{" + "auto=" + auto + ", cliente=" + cliente + ", nroPoliza=" + nroPoliza + ", cobertura=" + cobertura + ", montoAsegurado=" + montoAsegurado + ", montoPrima=" + montoPrima + ", granizo=" + granizo + ", vigente=" + vigente + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cuotas=" + cuotas + ", formaPago=" + formaPago + '}';
    }
    
    
}
