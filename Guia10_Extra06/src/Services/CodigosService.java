/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class CodigosService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<Integer, String> codigos = new HashMap();

    public void ingresarCodigos(int a) {

        for (int i = 0; i < a; i++) {
            System.out.println("Ingrese un codigo Postal");
            Integer codigo = leer.nextInt();
            System.out.println("Ingrese la ciudad a la que corresponde");
            String ciudad = leer.next();

            codigos.put(codigo, ciudad);
        }

    }

    public void mostrarListado() {

//        codigos.keySet().forEach((key)-> {
//            System.out.println(key + " " +         );
//            
//    });
        for (Map.Entry<Integer, String> entry : codigos.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + " Valor: " + value);
        }

    }

    public void buscarCodigo() {

        System.out.println("Ingrese un codigo a BUSCAR");
        Integer llave = leer.nextInt();

        if (codigos.containsKey(llave)) {
            String valor = codigos.get(llave);
            System.out.println("Key " + llave + " Ciudad " + valor);
        }

    }

    public void mostrarCodigo() {

        System.out.println("Ingrese un codigo a MOSTRAR");
        Integer llave = leer.nextInt();

        if (codigos.containsKey(llave)) {
            String valor = codigos.get(llave);
            System.out.println("Codigo " + llave + " Ciudad " + valor);

        } else {
            System.out.println("El codigo ingresado no corresponde a un codigo existente");
        }

    }

    public void eliminarCodigo() {

        for (int i = 0; i < 3; i++) {

            System.out.println("Ingrese un codigo a BORRAR");
            Integer llave = leer.nextInt();

            if (codigos.containsKey(llave)) {
                String valor = codigos.get(llave);
                System.out.println("Codigo " + llave + " Ciudad " + valor);
                codigos.remove(llave);
            } else {
                System.out.println("El codigo ingresado no corresponde a un codigo existente");
            }
        }
    }
}
