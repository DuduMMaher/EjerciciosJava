/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class FechaService {
    
    Scanner leer = new Scanner(System.in);
    
    public Date fechaNacimiento(){
        
        System.out.print("Ingrese dia de su nacimiento ");
        int dia= leer.nextInt();
        System.out.print("Ingrese el mes en que nacio ");
        int mes = leer.nextInt();
        System.out.print("Ingrese el año ");
        int anio = leer.nextInt();
        
        return new Date(anio-1900, mes-1, dia);
        
    }

public Date fechaActual(){
    
    return new Date();
}

public int diferencia(Date a, Date b){
    
    int anio1 = a.getYear();
    int anio2 = b.getYear();
    
    
    return anio2-anio1;
    
    
}

}
