/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author dudum
 */
public class Yate extends AMotor{
    
    
    
    protected Integer camarotes;
            
    public Yate() {
    }

    public Yate(Cliente cliente, String matricula, Integer eslora, Integer fabricacion, Integer potencia, Integer camarotes) {
        super(potencia, cliente, matricula, eslora, fabricacion);
        this.camarotes = camarotes;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public double calcularCosto(Embarcacion emb, int totDias) {
        
        return super.calcularCosto(emb, totDias)+ ((Yate)emb).getCamarotes(); 
    
    }

    
    
    
    
    @Override
    public String toString() {
        return "Yates{" + super.toString() + ", camarotes=" + camarotes + '}';
    }
    
    
    
    
}
