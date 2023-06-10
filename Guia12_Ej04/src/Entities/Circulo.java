/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Intefaces.CalculoFormas;

/**
 *
 * @author dudum
 */
public class Circulo implements CalculoFormas {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    
    
    
    
    
    
    
    @Override
    public double calculoArea() {
        
        return (PI*(radio*radio));
    }

    @Override
    public double caluculoPerimetro() {
        
        return 2*PI*radio;
    
    }
    
    
    
}
