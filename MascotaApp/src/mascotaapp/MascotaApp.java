/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp;

import Entidad.Mascota;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class MascotaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        Mascota m1 = new Mascota();
        String[] nombre =new String[5];
        String[] apodo = new String[5];
        String[] tipo = new String[5];
        String[] color = new String[5];
        int[] edad = new int[5];
        boolean[] cola = new boolean[5];
        String[] raza = new String[5];
  
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del perro Nro " + (i+1));
            nombre[i]=leer.next();
            System.out.print("Ingrese el apodo: " );
            apodo[i]=leer.next();
            System.out.print("Ingrese Tipo de perro ");
            tipo[i]= leer.next();
            System.out.print("Ingrese el Color ");
            color[i]= leer.next();
            System.out.print("Ingrese Edad de " + apodo[i]+ " ");
            edad[i]= leer.nextInt();
            System.out.print("Ingrese la raza de " + apodo[i] + " ");
            raza[i]=leer.next();
            
            
            
        }
        m1.ingresasMascotas(nombre, apodo, tipo, color, edad, cola, raza);
        
       
        
        
        System.out.println(m1.apodo[0]);
        System.out.println(m1.apodo[3]);
        
        
        
/*    public String nombre;
    public String apodo;

    public String tipo; //Conejo, perro, gato, Carpincho
    public String color;
    public int edad;
    public boolean cola;
    public String raza;
  */

        
    }
    
}
