/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author dudum
 */
public class Televisor extends Electrodomestico {
    
    protected Integer pulgadas;
    protected Boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Integer pulgadas, Boolean sintonizador, String color, String consumo, Double peso) {
        super(color, consumo, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public void crearTelevisor(){
        
        
        crearElectrodomestico();
        System.out.print("Pulgadas: ");
        Integer pulgada = serv.validarEEntero();
        System.out.println("TDT? (S/N)");
        String opc = leer.next();
        if (opc.equalsIgnoreCase("S")) {
            this.sintonizador=true;
        } else {
            this.sintonizador=false;
        }
        this.pulgadas=pulgadas;
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        
        if (pulgadas>40) {
            this.precio*= 1.3;
        }
        if (sintonizador) {
            this.precio+= 500;
        }
        
    }

    @Override
    public String toString() {
        return "Televisor{" + super.toString() + "pulgadas=" + pulgadas + ", sintonizador=" + sintonizador + '}';
    }
    
    
    
}
