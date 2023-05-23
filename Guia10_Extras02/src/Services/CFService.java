/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class CFService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Iterator<CantanteFamoso> it;
    
    
    public CantanteFamoso crearCantante(){
        
        System.out.println("Ingrese el nombre del Cantante");
        String nombre = leer.next();
        System.out.println("Ingrese su Disco mas vendido");
        String disco = leer.next();
        
        
        
        return new CantanteFamoso(nombre, disco);
    }
    
    public boolean eliminarCantante(ArrayList lista){
        
        it = lista.iterator();
        boolean ref=false;
        System.out.println("Ingrese el nombre del cantante a Eliminar");
        String nombre = leer.next();
        
        
        while (it.hasNext()) {
            String nombre2 = (String) it.next().getNombre();
            if (nombre2.equalsIgnoreCase(nombre)){
                it.remove();
                ref=true;
           }
        }
        
        return ref;
    }
    
    public void mostrarCantantes(ArrayList lista){
        
        for (Object object : lista) {
            CantanteFamoso valor = (CantanteFamoso) object;
            System.out.println("Cantante " + valor.getNombre() + " Disco Mas Vendido: " + valor.getDiscoConMasVentas());
        }
        
        
        
        
    }
    
}
