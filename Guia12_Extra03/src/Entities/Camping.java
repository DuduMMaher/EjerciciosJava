/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author dudum
 */
public class Camping extends AlojamientoExtraHotelero{
    
    protected int carpas;
    protected int banos;
    protected boolean rest;

    public Camping() {
    }

    public Camping(int carpas, int banos, boolean rest, boolean privado, int metros, String nombrealoja, String direccion, String localidad, String gerente) {
        super(privado, metros, nombrealoja, direccion, localidad, gerente);
        this.carpas = carpas;
        this.banos = banos;
        this.rest = rest;
    }
    
    
    public int getCarpas() {
        return carpas;
    }

    public void setCarpas(int carpas) {
        this.carpas = carpas;
    }

    public int getBanos() {
        return banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public boolean isRestaurnt() {
        return rest;
    }

    public void setRestaurnt(boolean restaurnt) {
        this.rest= rest;
    }

    @Override
    public String toString() {
        return "Camping{" + super.toString() + "carpas=" + carpas + ", banos=" + banos + ", restaurnt=" + rest + '}';
    }
    
    
    
}
