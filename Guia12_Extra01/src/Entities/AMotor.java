/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author dudum
 */
public class AMotor extends Embarcacion  {
    
    
    protected Integer potencia;

    public AMotor() {
    }

    public AMotor(Integer potencia, Cliente cliente, String matricula, Integer eslora, Integer fabricacion) {
        super(cliente, matricula, eslora, fabricacion);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public double calcularCosto(Embarcacion emb, int totDias) {
        
        return super.calcularCosto(emb, totDias) + ((AMotor)emb).getPotencia(); 
    
    
    }

    
    
    
    
    
    @Override
    public String toString() {
        return "AMotor{" + super.toString() + "potencia=" + potencia + '}';
    }
    
    
    
    
    
    
    
}
