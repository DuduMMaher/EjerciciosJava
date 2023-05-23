/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class ProductoService {

    Scanner leer = new Scanner(System.in);
    Producto prod = new Producto();

    public Producto cargarProducto() {

        System.out.println("Ingrese La descripcion del Producto");
        String desc = leer.next();
        System.out.println("Ingrese el precio");
        double precio = leer.nextDouble();

        return new Producto(desc, precio);

    }

    public Integer pedirKey() {
        Integer key;
        System.out.println("Ingrese el numero de Articulo");
        key = leer.nextInt();

        return key;

    }

    public void modificarPrecio(HashMap<Integer, Producto> map1) {

        Integer key = pedirKey();

//      for (Map.Entry<Integer, Producto> entry : map1.entrySet()){
//      }
        if (map1.containsKey(key)) {
            Producto valor = map1.get(key);

            System.out.println("El valor actual del Prod " + valor.getDescripcion() + " es $" + valor.getPrecio());

            System.out.println("Ingrese el nuevo precio");
            double precio = leer.nextDouble();
            valor.setPrecio(precio);
        } else {
            System.out.println("El producto ingresado no existe");
        }
      
    }

    public void borrarProducto(HashMap<Integer, Producto> map1) {

        Integer key = pedirKey();

        if (map1.containsKey(key)) {
            Producto valor = map1.get(key);

            System.out.println("El Prod " + valor.getDescripcion() + " Costo $" + valor.getPrecio());

            System.out.println("Seguro que lo quiere borrar (S/N)");
            String opc = leer.next();
            if (opc.equalsIgnoreCase("S")){
                map1.remove(key);
                System.out.println("Producto Borrado");   
            }
        } else {
            System.out.println("El producto ingresado no existe");
        }
    }

    public void mostrarProductos(HashMap<Integer, Producto> map1){
        
        map1.keySet().forEach((object) -> {
            Producto valor = map1.get(object);
            System.out.println("Art. " + object + " Desc. "+ valor.getDescripcion() + "Precio: " + valor.getPrecio());
        });
        
        
        
    }
    
    
    
}
