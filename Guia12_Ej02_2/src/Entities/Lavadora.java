/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author dudum
 */
public class Lavadora extends Electrodomestico {
    
    
    
    protected Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, String color, String consumo, Double peso) {
        super(color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    
    
    
    public void crearLavadora(){
        
        crearElectrodomestico();
        System.out.print("Carga: ");
        Integer carga = serv.validarEEntero();
        this.carga= carga;
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (this.carga>30){
            this.precio+=500;
        }
    }

    @Override
    public String toString() {
        
        return "Lavadora{" + super.toString() + "carga=" + carga + '}';
    }
    
    
    
    
    
}
