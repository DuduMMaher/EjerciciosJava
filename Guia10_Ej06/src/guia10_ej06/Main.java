/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_ej06;

import Entities.Producto;
import Services.ProductoService;
import java.util.HashMap;
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
        // TODO code application logic here
   
    
        Scanner leer = new Scanner(System.in);
        
        ProductoService ps = new ProductoService();
        HashMap<Integer, Producto> prodMap = new HashMap();
        
        
        
        Integer key =1;
        int opc;
        
        do {
            System.out.println("MENU");
            System.out.println("--------");
            System.out.println("1.- Cargar Producto");
            System.out.println("2.- Modificar Precio");
            System.out.println("3.- Borrar un Producto");
            System.out.println("4.- Mostrar Listado");
            System.out.println("");
            
            
            opc= leer.nextInt();
            
            switch (opc) {
                case 1:
                    prodMap.put(ps.pedirKey(), ps.cargarProducto());
                    break;
                case 2:
                    ps.modificarPrecio(prodMap);
                    break;
                case 3:
                    ps.borrarProducto(prodMap);
                    break;
                case 4:
                    ps.mostrarProductos(prodMap);
                    break;
                case 5:
                    break;
            }
        } while (opc!=5);
        
        
        
        
        
        
    
    
    }
    
}
