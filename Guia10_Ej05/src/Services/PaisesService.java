/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Pais;
import java.util.TreeSet;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class PaisesService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public Pais cargarPais(){
     
        System.out.println("Ingrese el Nombre del Pais");
        String nombre = leer.next();
        
        return new Pais(nombre);
        
    }
    
    public void mostrarPaises(TreeSet paises){
        
        for (Object paise : paises) {
            System.out.println(paise);
        }
        System.out.println("");
    }
    
   
    
    
    
    
    
}
