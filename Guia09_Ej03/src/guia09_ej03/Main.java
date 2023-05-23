/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia09_ej03;

import Servicios.ArregloService;

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
   
        
        ArregloService as = new ArregloService();
        
    
    double[] a = new double[50];
    double[] b = new double[20];
    
    as.inicializarA(a);
    as.inicializarB(a, b);
    as.mostrar(a);
    as.mostrar(b);
    as.ordenar(a);
    
    }
    
}
