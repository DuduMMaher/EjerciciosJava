/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class PaisService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pais cargarPais(){
        
        System.out.println("Ingrese un pais");
        String nombre= leer.next();
        
        return new Pais(nombre);
        
    }
    
    public void mostrarPaises(HashSet paises){
        
        Comparator<Pais> comparaPais = new Comparator<Pais>() {
            @Override
            public int compare(Pais t, Pais t1) {
                return t.getPais().compareTo(t1.getPais());
            }
        };
        
        
        ArrayList<Pais> paisList = new ArrayList(paises);
        
        paisList.sort(comparaPais);
       
        for (Pais pais : paisList) {
            System.out.println(pais);
        }
        System.out.println("");
        
        
    }
    
}
