/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author dudum
 */
public class NIF {
    
    private long dni;
    private char nif;

    public NIF() {
    }

    public NIF(long dni, char nif) {
        this.dni = dni;
        this.nif = nif;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getNif() {
        return nif;
    }

    public void setNif(char nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "NIF{" + "dni=" + dni + ", nif=" + nif + '}';
    }
    
    
    
    
    
}
