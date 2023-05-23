/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Cadena;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class CadenaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {

        System.out.println("Ingrese una frase");
        String frase = leer.next();

        return new Cadena(frase);
    }

    public void mostrarVocales(Cadena c) {

        char letra;
        int cont = 0;

        for (int i = 0; i < c.getLongitud(); i++) {
            letra = c.getFrase().toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                cont++;
            }
        }

        System.out.println("La cantidad de vocales en la frase es de: " + cont);

    }

    public void invertirFrase(Cadena c) {

        for (int i = 0; i < c.getLongitud(); i++) {
            System.out.print(c.getFrase().charAt(c.getLongitud() - i - 1));
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena c) {

        System.out.println("Ingrese un caracter para ver cuantas veces se repite");
        char letter = leer.next().toLowerCase().charAt(0);
        int cont = 0;

        for (int i = 0; i < c.getLongitud(); i++) {

            if (c.getFrase().toLowerCase().charAt(i) == letter) {
                cont++;
            }
        }
        System.out.println("La letra " + letter + " se repite " + cont + " veces");
    }

    public void compararLongitud(Cadena c) {

        System.out.println("Ingrese una frase para comparar longitud");
        String frase2 = leer.next();

        Integer long2 = frase2.length();
        Integer long3 = c.getLongitud();
        
        int resultado = long2.compareTo(long3);
        
        int resultado2 = long2-c.getLongitud();
        
        System.out.println(resultado);

        if (resultado == -1) {
            System.out.println("La nueva frase ingresada es menor a la existente");
            System.out.println("Es " + (resultado2 * (-1)) + " caracteres menor");
        }
        if (resultado == 1) {
            System.out.println("La nueva frase ingresada es MAYOR a la existente");
            System.out.println("Es " + (resultado2) + " caracteres mayor");
        }
        if (resultado == 0) {
            System.out.println("Las frases tienen la misma Longitud");
        }

    }

    public void unirFrases(Cadena c) {
        System.out.println("Ingrese una frase para unir a la existente");
        String frase2 = leer.next();

        System.out.println(c.getFrase().concat(frase2));
    }

    public void reemplazar(Cadena c) {

        System.out.println("Ingrese la letra a reemplazar");
        char letra1 = leer.next().charAt(0);
        System.out.println("Ingrese la letra por la cual reemplazar");
        char letra2 = leer.next().charAt(0);
        String fraseNueva = "";
        char letra3;

//        for (int i = 0; i < c.getLongitud(); i++) {
//            if (c.getFrase().toLowerCase().charAt(i) == letra1) {
//                fraseNueva = fraseNueva.concat(String.valueOf(letra2));
//            } else {
//                letra3 = c.getFrase().charAt(i);
//                fraseNueva = fraseNueva.concat(String.valueOf(letra3));
//            }
//        }
//        System.out.println(fraseNueva);
//   
// System.out.println("Ingrese una letra para remplazar la letra a");
//        char letra=leer.next().toLowerCase().charAt(0);

        String replace_frase = c.getFrase().replace(letra1, letra2);

        System.out.println("La frase remplazada es "+ replace_frase);
     }
    public boolean contiene(Cadena c) {

        System.out.println("Ingrese la letra a ver si existe en la frase");
        return c.getFrase().contains(leer.next());
    }

}
