/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author dudum
 */
public abstract class Alojamiento {
    
    protected String nombrealoja;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombrealoja, String direccion, String localidad, String gerente) {
        this.nombrealoja = nombrealoja;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public abstract double calcularPrecio (Alojamiento alojaArray);
    
    
    @Override
    public String toString() {
        return "Aloj.{" + "nombre=" + nombrealoja + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + '}';
    }
    
    
    
    
    
    
}
