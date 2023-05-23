/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia09_ej02;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;

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
   
    
    ParDeNumeros pdn = new ParDeNumeros();
    ParDeNumerosService pdns= new ParDeNumerosService();
    
    pdns.mostrarValores(pdn);
    int valor=pdns.devolverMayor(pdn);
    pdns.calcularPotencia(pdn, valor);
    pdns.calculaRaiz(pdn, valor);
    
    
    
    
    
    }
    
}
