/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author dudum
 */
public class Asiento {
 
    private Persona pers;
    private boolean ocupado;

    public Asiento() {
        
        this.ocupado=false;
    }

    public Asiento(boolean ocupado) {
        this.pers = pers;
        this.ocupado = ocupado;
    }

    public Persona getPers() {
        return pers;
    }

    public void setPers(Persona pers) {
        this.pers = pers;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        
        return ocupado?"X":"-";
    }
    
    
    
}
