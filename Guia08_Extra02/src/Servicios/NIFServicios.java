/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class NIFServicios {
    
    Scanner leer = new Scanner(System.in);
    
    
    
    public NIF ingresarDni(char[] vector, int proximoDni){
        
        System.out.println("Ingrese DNI");
        long dni= leer.nextLong();
        
           char nif=crearNif(dni, vector);
        
        return new NIF(dni, nif);
    }    
    
    public char crearNif(long dni, char[] vector){
        
        int resto = ((int) dni%23);
        
        char nif = vector[resto];
        
        return nif;
        
        
    }
    
    public char[] crearVector() {
        
          char[] vector = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    
    return vector;
    
    }
    public void mostrar(NIF n){
        
        System.out.println(n.getDni() + "-" + n.getNif());
        
    }

    public int buscarProximo(NIF[] n) {
        
        int i=0;
        
        while (n[i] != (null)) {
            i++;
        }
        
        
        return i;
        }


}
