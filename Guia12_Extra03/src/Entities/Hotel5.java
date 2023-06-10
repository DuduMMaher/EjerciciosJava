/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author dudum
 */
public class Hotel5 extends Hotel4 {
   
   
   protected int salonesConf;
   protected int suites;
   protected int limo;

    public Hotel5() {
    }

    public Hotel5(int salonesConf, int suites, int limo, int habitaciones, int camas, int pisos, String gimnacio, String restaurant, int capacidadRest, String nombrealoja, String direccion, String localidad, String gerente) {
        super(habitaciones, camas, pisos, gimnacio, restaurant, capacidadRest, nombrealoja, direccion, localidad, gerente);
        this.salonesConf = salonesConf;
        this.suites = suites;
        this.limo = limo;
       
    }

    public int getSalonesConf() {
        return salonesConf;
    }

    public void setSalonesConf(int salonesConf) {
        this.salonesConf = salonesConf;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getLimo() {
        return limo;
    }

    public void setLimo(int limo) {
        this.limo = limo;
    }

    @Override
    public double calcularPrecio(Alojamiento aloja) {
        return super.calcularPrecio(aloja)+ (((Hotel5)aloja).getLimo()*15);
    }

    
    
    
    
    @Override
    public String toString() {
        return "Hotel5{" + super.toString() + "salonesConf=" + salonesConf + ", suites=" + suites + ", limo=" + limo + '}';
    }

    
   
}
