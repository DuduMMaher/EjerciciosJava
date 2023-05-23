/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author dudum
 */
public class Sala {
    
    private Asiento[][] asientos;
    private Pelicula peli;
    private boolean vip;
    private double precio;

    public Sala() {
        
       
               
    }

    public Sala(boolean vip, double precio) {
        
        asientos = new Asiento[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                asientos[i][j]= crearAsiento();
            }
        }
        this.vip = vip;
        this.precio = precio;
    }

    public Asiento crearAsiento(){
        
        boolean ocupado=false;
        return new Asiento(ocupado);
    }
    
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Sala(Asiento[][] asientos, Pelicula peli) {
        this.asientos = asientos;
        this.peli = peli;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    @Override
    public String toString() {
        return "Sala{" + "asientos=" + asientos + ", peli=" + peli + '}';
    }
    
    
    
    
    
}
