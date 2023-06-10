/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author dudum
 */
public class Residencia extends AlojamientoExtraHotelero{
    
    
    protected int hab;
    protected boolean descGremios;
    protected boolean deportivo;

    public Residencia() {
    }

    public Residencia(int hab, boolean descGremios, boolean deportivo, boolean privado, int metros, String nombrealoja, String direccion, String localidad, String gerente) {
        super(privado, metros, nombrealoja, direccion, localidad, gerente);
        this.hab = hab;
        this.descGremios = descGremios;
        this.deportivo = deportivo;
    }

    public int getHab() {
        return hab;
    }

    public void setHab(int hab) {
        this.hab = hab;
    }

    public boolean isDescGremios() {
        return descGremios;
    }

    public void setDescGremios(boolean descGremios) {
        this.descGremios = descGremios;
    }

    public boolean isDeportivo() {
        return deportivo;
    }

    public void setDeportivo(boolean deportivo) {
        this.deportivo = deportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" + super.toString() + "hab=" + hab + ", descGremios=" + descGremios + ", deportivo=" + deportivo + '}';
    }
    
    
    
}


