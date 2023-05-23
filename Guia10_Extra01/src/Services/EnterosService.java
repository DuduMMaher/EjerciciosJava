/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class EnterosService {

    Scanner leer = new Scanner(System.in);
    ArrayList<Integer> nums = new ArrayList();

    public void cargarNumeros() {

        System.out.println("Ingere un num entero");
        Integer num = leer.nextInt();
        while (num != (-99)) {

            nums.add(num);
            num = leer.nextInt();
        }
    }

    public void mostrarLista() {

        nums.forEach((num) -> {
            System.out.println(num);
        });

    }
    
    public int sumarNumeros(){
        
        int suma = 0;
        
        for (Integer num : nums) {
            suma= suma+num;
        }
        return suma;
        
        
    }

    public int contarNumeros() {
       int suma = 0;
        
        for (Integer num : nums) {
            suma++;
        }
        return suma;
        
        
    }

}
