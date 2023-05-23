/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Enumeradores.FormaPago;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author dudum
 */
public class Cuota {
    
    private int nroCuota;
    private double montoCuota;
    private boolean pagado;
    private Date vencimiento;
    private int poliza;
    private FormaPago pago;

    public Cuota() {
    }

    public Cuota(int nroCuota, double montoCuota, boolean pagado, Date vencimiento, int poliza, FormaPago pago) {
        this.nroCuota = nroCuota;
        this.montoCuota = montoCuota;
        this.pagado = pagado;
        this.vencimiento = vencimiento;
        this.poliza = poliza;
        this.pago = pago;
    }

    public int getNroCuota() {
        return nroCuota;
    }

    public void setNroCuota(int nroCuota) {
        this.nroCuota = nroCuota;
    }

    public double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public int getPoliza() {
        return poliza;
    }

    public void setPoliza(int poliza) {
        this.poliza = poliza;
    }

    public FormaPago getPago() {
        return pago;
    }

    public void setPago(FormaPago pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "NroCuota=" + nroCuota + ", montoCuota=" + montoCuota + ", pagado=" + pagado + ", vencimiento=" + vencimiento + ", poliza=" + poliza + ", pago=" + pago + "} \n";
    }
    
    
    
}
