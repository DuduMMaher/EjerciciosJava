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

    
    protected int resolucion;
    protected boolean sintonizador;

//    public Televisor() {
//    }
//    
    public Televisor(int resolucion, boolean sintonizador, String color, char consumo, double peso) {
        super(color, consumo, peso);
        comprobarConsumoEnergetico(consumo);
        comprobarColor(color);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
        precioFinal();
    }
        
//    public Televisor(int resolucion, boolean sintonizador) {
//        
//        this.resolucion = resolucion;
//        this.sintonizador = sintonizador;
//    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
//     public void crearTelevisor() {
//
//        boolean antena=false;
//        super.crearElectrodomestico();
//        System.out.println("Ingrese el tamaño en Pulgadas");
//        int tam = serv.validarEntero();
//        System.out.println("Tiene antena TDT? (S/N)");
//        String ant = leer.next().toUpperCase();
//        if (ant.equals("S")){
//            antena=true;
//        }
//        this.resolucion=tam;
//        this.sintonizador= antena;
//    }


    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (resolucion>40){
            super.precio= super.precio*1.3;
        }
        System.out.println("Resolucion " + resolucion);
        System.out.println("Precio + Resolucion "+this.precio);
        if (this.sintonizador){
            super.precio=super.precio+500;
        }
        System.out.println("Sintonizador " + sintonizador);
        System.out.println("Precio + sintonizador " + this.precio);
    }
    
    
    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", sintonizador=" + sintonizador + '}';
    }
    
    
    
    
}
