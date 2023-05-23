/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_extra01;

import Services.EnterosService;

/**
 *
 * @author dudum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    
    EnterosService es = new EnterosService();
    
    
    es.cargarNumeros();
    es.mostrarLista();
        System.out.println("La suma total de los numeros ingresados es de " + es.sumarNumeros());
        
        double prom = ((double)es.sumarNumeros()/(double)es.contarNumeros());
        System.out.println("El promedio es de " + String.format("%.2f", prom));
    
    
    
    }
    
}
