/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author dudum
 */
public class EdificioDeOficinas extends Edificio {

    protected int nroOficinas;
    protected int personas;
    protected int pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int nroOficinas, int personas, int pisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nroOficinas = nroOficinas;
        this.personas = personas;
        this.pisos = pisos;
    }

    public int getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(int nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "nroOficinas=" + nroOficinas + ", personas=" + personas + ", pisos=" + pisos + '}';
    }
    
    
    
    
    
    
    
    
    
    public void cantPersonas(){
        
    }
    
    @Override
    public double calcularSuperfie(Edificio aux) {
        
        return aux.getAncho()*aux.getLargo();
    
    }

    @Override
    public double calcularVolumen(Edificio aux) {
        
    
        return aux.getAlto()*aux.getLargo()*aux.getAncho();
    
    }
    
}
