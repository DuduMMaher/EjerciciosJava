/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia08_extra203;

import Entidades.Pass;
import Servicios.PassServicios;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Guia08_Extra203 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
    
        Pass ps=new Pass("", "Carlos", 22109651);
        
        PassServicios pss = new PassServicios();
        
        pss.crearPass(ps);
        
        int opc;
        
        
        
        do {
        System.out.println("MENU");
        System.out.println("----------");
        System.out.println("1.- Modificar Password");
        System.out.println("2.- Modificar Nombre");
        System.out.println("3.- Modificar DNI");
        System.out.println("4.- Ver Datos");
        System.out.println("5.- Salir");
        opc=leer.nextInt();
        
        switch (opc){
            case 1:
                pss.modificarPass(ps);
                break;
            case 2:
                pss.modificarNombre(ps);
                break;
            case 3:
                pss.modificarDni(ps);
                break;
            case 4:
                pss.mostrarDatos(ps);
                break;
        }
        
        
        
        } while (opc != 5);
    }
    
}
