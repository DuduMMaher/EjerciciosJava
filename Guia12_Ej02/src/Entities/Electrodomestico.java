/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import HacksDPackage.Servicios;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Electrodomestico {
    
    Scanner leer = new Scanner(System.in);
    Servicios serv = new Servicios();
    
    protected double precio=1000;
    protected String color;
    protected char consumo;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, char consumo, double peso) {
        System.out.println("Precio inicial " + this.precio);
        comprobarConsumoEnergetico(consumo);
        comprobarColor(color);
        precioFinal();
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
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
    
//    public void crearElectrodomestico() {
//
//        System.out.println("Ingrese el Color del Electrodomestico");
//        String color = leer.next();
//        System.out.println("Ingrese el Consumo Energetico");
//        char consumo = leer.next().charAt(0);
//        
//        System.out.println("Ingrese el Peso en Kilogramos");
//        double peso = serv.validarDouble();
//
//        this.color=color;
//        this.consumo= consumo;
//        this.peso= peso;
//        System.out.println("Precio inicial " + this.precio);
//        comprobarConsumoEnergetico(consumo);
//        comprobarColor(color);
//        
//        
//    }
    
//Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
    
    
    public void comprobarConsumoEnergetico(char a){
        
        if (a!='A' && a!='B' && a!='C' && a!='D' && a!='E') {
            this.consumo='F';
            System.out.println("Consumo F");
        }
                
        }
//Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.              
//        
        
    public void comprobarColor(String color){
        
        if (!color.equalsIgnoreCase("Blanco") && !color.equalsIgnoreCase("Negro") && !color.equalsIgnoreCase("Azul") && !color.equalsIgnoreCase("Gris") && !color.equalsIgnoreCase("Rojo")) {
            this.color="Blanco";
        }
//Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
    }

    public void precioFinal(){
        
        switch(consumo){
            case 'A':
                this.precio = this.precio + 1000;
                break;
            case 'B':
                this.precio = this.precio + 800;
                break;
            case 'C':
                this.precio = this.precio + 600;
                break;
            case 'D':
                this.precio= this.precio + 500;
                break;
            case 'E':
                this.precio = this.precio + 300;
                break;
            case 'F':
                this.precio = this.precio + 100;
                break;
        }
        System.out.println("consumo :" + consumo);
        System.out.println("precio + consumo " + this.precio);
    
        if (peso<20) {
            this.precio= this.precio+100;     
        }
        if (peso>19 && peso<50 ) {
            this.precio= this.precio+500;
        }
        if (peso>49 && peso<80 ) {
            this.precio= this.precio+800;
        }
        if (peso>79) {
            this.precio= this.precio+1000;
        }
        System.out.println("peso " + this.peso);
        System.out.println("Precio + consumo + peso " + this.precio);
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
    
    
    
}
