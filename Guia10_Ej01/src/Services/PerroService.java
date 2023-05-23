/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class PerroService {
    
    ArrayList<String> perros = new ArrayList();
    
    Scanner leer = new Scanner(System.in);
    
    Iterator <String> itPerros;
    
    
    public void crearPerros(){
    String opc;
    int cont=1;
    
    
     do {
            System.out.println("Ingrese la Raza del Perro Nro " + cont);
            cont++;
            perros.add(leer.next());
            System.out.println("Desea agregar otro perro? (S/N)");
            opc= leer.next().toUpperCase();
        } while (!opc.equals("N"));
   
        
    
       
    }
    
    
    public boolean siEstaPerro(){
        
        itPerros = perros.iterator();
        
        boolean ref=false;
        
        System.out.println("Ingrese el perro a buscar");
        String buscar = leer.next();
        while(itPerros.hasNext()){
            if (itPerros.next().equals(buscar)) {
                itPerros.remove();
                ref=true;
            }
        }
        return ref;
    }
   
    public void mostrarPerros(){
    
    for (String perro : perros) {
            System.out.println(perro);
        }
}

    @Override
    public String toString() {
        return "PerroService{" + "perros=" + perros + '}';
    }
    
}
