/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author dudum
 */
public class Velero extends Embarcacion {

    protected Integer mastiles;
//    protected Embarcacion emb;
    
    public Velero() {
    }

    public Velero(Integer mastiles, Embarcacion e) {
        
        this.mastiles = mastiles;
//        this.emb=e;
        
    }

    public Velero(Integer mastiles, Cliente cliente, String matricula, Integer eslora, Integer fabricacion) {
        super(cliente, matricula, eslora, fabricacion);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public double calcularCosto(Embarcacion emb, int totDias) {
        
       
        return super.calcularCosto(emb, totDias) + ((Velero)emb).getMastiles();
        
    
    }
    
    
    
    

    @Override
    public String toString() {
        return "Velero{" + super.toString() + "mastiles=" + mastiles + '}';
    }

    

   
    

}
