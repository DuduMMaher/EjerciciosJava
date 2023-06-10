/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author dudum
 */
public final class Lavadora extends Electrodomestico {
    
    
    protected int carga;

   
    public Lavadora(int carga, String color, char consumo, double peso) {
        super(color, consumo, peso);
        System.out.println("super Consumo Contructor "+ super.consumo);
        System.out.println("Consumo Recibido");
        comprobarConsumoEnergetico(consumo);
        comprobarColor(color);
        this.carga = carga;
        precioFinal();
    }
    
    
   
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    
  

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (carga>30) {
            super.precio=super.precio+500;
        }
        System.out.println("Carga " + carga);
        System.out.println("precio final " + this.precio);
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
    
    
    
    
    
    
    
    
}
