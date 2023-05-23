/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia08_ej01;

import Servicios.CuentaBancariaServicios;
import java.util.Scanner;

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
    
    
    Scanner leer = new Scanner(System.in);
    CuentaBancariaServicios cb1 = new CuentaBancariaServicios();
    int opc;
    
    
    do {
            
        
        
        System.out.println("MENU");
        System.out.println("");
        
        System.out.println("1.- Ingresar datos");
        System.out.println("2.- Deposito");
        System.out.println("3.- Retiro de Dinero");
        System.out.println("4.- Retiro Rapido");
        System.out.println("5.- Ver Saldo");
        System.out.println("6.- Ver datos de Cuenta");
        System.out.println("7.- Salir");
        
        opc=leer.nextInt();
        
            System.out.println();
        
        switch (opc){
            case 1:
                cb1.crearCuenta();
                break;
            case 2:
                cb1.ingresarDinero();
                break;
            case 3:
                cb1.retiroDinero();
                break;
            case 4:
                cb1.retiroRapido();
                break;   
            case 5:
                cb1.mostrarSaldo();
                
                break;
            case 6:
                cb1.mostrarDatos();
                break;
            case 7:
                break;
                
        }
        } while (opc!=7);
    
    
    
    }
    
}
