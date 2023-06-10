/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author dudum
 */
public class AlojamientoExtraHotelero extends Alojamiento{
    
    protected boolean privado;
    protected int metros;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(boolean privado, int metros, String nombrealoja, String direccion, String localidad, String gerente) {
        super(nombrealoja, direccion, localidad, gerente);
        this.privado = privado;
        this.metros = metros;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    @Override
    public String toString() {
        return "AlojamientoExtraHotelero{" + super.toString() +  "privado=" + privado + ", metros=" + metros + '}';
    }

    @Override
    public double calcularPrecio(Alojamiento alojaArray) {
        
    
    return 0.0;
    
    
    }

    
}
