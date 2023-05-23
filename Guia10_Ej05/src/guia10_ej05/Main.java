/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_ej05;

import Entities.Pais;
import Services.PaisesService;
import java.util.Scanner;
import java.util.TreeSet;

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
    
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
    
    Pais p = new Pais();
    PaisesService ps= new PaisesService();
    
    TreeSet<Pais> paisesSet = new TreeSet();
    String opc = "";
    
        do {
            
            
            paisesSet.add(ps.cargarPais());
            
            
            
            System.out.println("Desea Ingresar otro Pais? (S/N)");
            opc = leer.next();
            
        } while (!opc.toUpperCase().equals("N"));
        
    
    ps.mostrarPaises(paisesSet);
    
    
    
    
    }
    
}
