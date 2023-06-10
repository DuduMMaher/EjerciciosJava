/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author dudum
 */
public class Hotel4 extends Alojamiento {
    
    protected int habitaciones;
    protected int camas;
    protected int pisos;
    protected String gimnacio;
    protected String restaurant;
    protected int capacidadRest;
    protected double precioHab;

    public Hotel4() {
    }

    public Hotel4(int habitaciones, int camas, int pisos, String gimnacio, String restaurant, int capacidadRest, String nombrealoja, String direccion, String localidad, String gerente) {
        super(nombrealoja, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.gimnacio = gimnacio;
        this.restaurant = restaurant;
        this.capacidadRest = capacidadRest;
        
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public String getGimnacio() {
        return gimnacio;
    }

    public void setGimnacio(String gimnacio) {
        this.gimnacio = gimnacio;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public int getCapacidadRest() {
        return capacidadRest;
    }

    public void setCapacidadRest(int capacidadRest) {
        this.capacidadRest = capacidadRest;
    }

    public double getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(double precioHab) {
        this.precioHab = precioHab;
    }

    public String getNombrealoja() {
        return nombrealoja;
    }

    public void setNombrealoja(String nombrealoja) {
        this.nombrealoja = nombrealoja;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Hotel4{" + super.toString() + "habitaciones=" + habitaciones + ", camas=" + camas + ", pisos=" + pisos + ", gimnacio=" + gimnacio + ", restaurant=" + restaurant + ", capacidadRest=" + capacidadRest + ", precioHab=" + precioHab + '}';
    }

    @Override
    public double calcularPrecio(Alojamiento aloja) {
        
        int gym=0;
        int resto=0;
        
        if (((Hotel4)aloja).getGimnacio().equalsIgnoreCase("A")) {
            gym=50;
        } else {
            gym=30;
        } 
        
        if (((Hotel4)aloja).getCapacidadRest()<30) {
            resto=10;
        } else if (((Hotel4)aloja).getCapacidadRest()<50) {
            resto=30;
        } else if (((Hotel4)aloja).getCapacidadRest()>=50) {
            resto=50;
        } 
   
       return 50+((Hotel4)aloja).getCamas()+resto+gym;
    
    
    }

   
    
}
