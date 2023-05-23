/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class PerroService {
    
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Iterator itPerros;
    
    public void crearListado( HashSet<String> razas){
        
        
        
        
        String opc;
        int cont=1;
        
        do {
            System.out.println("Ingrese una la raza del Perro Nro " + cont);
            String razaPerro = leer.next();
            razas.add(razaPerro);
            
            
            System.out.println("Desea Ingresar otro perro? (S/N)");
            opc= leer.next();
            cont++;
            
        } while (!opc.equalsIgnoreCase("N"));
    }

    public void mostrarRazas(HashSet<String> razas) {
        
        int cont=1;
        
        for (String raza : razas) {
            System.out.println("Perro " + cont + " " + raza);
            cont++;
        }
        
        System.out.println("");
        
    }

    public void eliminarPerro(HashSet<String> razas) {
        
        itPerros = razas.iterator();
        boolean ref=false;
        
        System.out.println("Ingrese la Raza del Perro a Eliminar");
        String razaPerro = leer.next();
        while (itPerros.hasNext()) {
            if (itPerros.next().equals(razaPerro)){
                itPerros.remove();
                System.out.println("La raza ha sido Eliminada");
                ref=true;
                
            }
        }
        if (!ref) {
            System.out.println("La raza ingresada no existe en el listado");
            
        }
    }

    public void ordenarListado(HashSet<String> razas) {
        
        
        ArrayList<String> listaPerros = new ArrayList<String>(razas);
        
        Collections.sort(listaPerros);
        
        for (String listaPerro : listaPerros) {
            System.out.println(listaPerro);
        }
        
    }
    
    
    
}
