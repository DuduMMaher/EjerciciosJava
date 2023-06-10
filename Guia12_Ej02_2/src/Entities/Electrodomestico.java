/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Servicios.Servicios;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Electrodomestico {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Servicios serv = new Servicios();
    
    protected Double precio;
    protected String color;
    protected String consumo;
    protected Double peso;

    public Electrodomestico() {
        this.precio=1000.0;
    }

    public Electrodomestico(String color, String consumo, Double peso) {
        this.precio = 1000.0;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
    public void crearElectrodomestico(){
        
        System.out.print("Ingrese color: ");
        String color = leer.next();
        System.out.print("Consumo: ");
        char letra = leer.next().toUpperCase().charAt(0);
        System.out.print("Peso: ");
        Double peso = serv.validarDDouble();
        comprobarConsumoEnergetico(letra);
        comprobarColor(color);
        this.peso= peso;
        
    }
    
    
    protected void comprobarConsumoEnergetico(char letra){
        
        
        if (letra<'A' || letra>'F') {
            letra='F';
        }
        this.consumo = String.valueOf(letra);
    }

    protected void comprobarColor(String color) {
        
        if (!color.equalsIgnoreCase("Blanco") && !color.equalsIgnoreCase("Negro") && !color.equalsIgnoreCase("Rojo") && !color.equalsIgnoreCase("Azul") && !color.equalsIgnoreCase("Gris")){
            color="Blanco";
        }
        this.color=color;
    }
    
    public void precioFinal(){
        
        switch (this.consumo){
            case "A":
               this.precio+= 1000;
               break;
            case "B":
                this.precio+= 800;
               break;
            case "C":
                this.precio+= 600;
               break;
            case "D":
                this.precio+= 500;
               break;
            case "E":
                this.precio+= 300;
               break;
            case "F":
                this.precio+= 100;
               break;
        }
        
        if (this.peso<20) {
            this.precio+=100;
        } else if (this.peso<50){
            this.precio+=500;
        }else if (this.peso<80){
            this.precio+=800;
        } else {
            this.precio+=1000;
        }
        
    }
    
}
