/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author dudum
 */
public class Cadena {
    
    private String frase;
    private int longitud;
   

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        longitud= this.frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud +'}';
    }

    
    
    
    
    
    
    
}
