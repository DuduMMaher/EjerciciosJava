/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11_extra01;

import Entities.Perro;
import Entities.Persona;
import Services.PPService;
import java.util.ArrayList;
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
       
         Scanner leer = new Scanner(System.in);
        
        Persona pers = new Persona();
        Perro pe = new Perro();
        PPService pps = new PPService();
        ArrayList<Persona> persArray = new ArrayList();
        ArrayList<Perro> perroArray = new ArrayList();
        
        String opc="";
        do {
            persArray.add(pps.crearPersona());
           
            System.out.println("Quiere ingresar otra persona? (S/N)");
            opc = leer.next();
            
        } while (!opc.equalsIgnoreCase("N"));
            
        do {
            perroArray.add(pps.crearPerro());
            System.out.println("Quiere ingresar otro perro? (S/N)");
            opc = leer.next();
            
        } while (!opc.equalsIgnoreCase("N"));
            
        pps.asignarPerro(persArray, perroArray);
        pps.mostrarPersonas(persArray);
        pps.mostrarPerros(perroArray);
                
        
    }
    
}
