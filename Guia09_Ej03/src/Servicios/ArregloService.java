/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author dudum
 */
public class ArregloService {
    
    public void inicializarA(double[] a){
        
        Random q = new Random();
        
        
        
        for (int i = 0; i < 50; i++) {
            int x=q.nextInt(10000);
            a[i] = (double) x/100;
            
        }
//        Arrays.fill(a, q.nextInt(100));
//        
        
    }
    
    public void mostrar(double[] c){
        
        
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        System.out.println("");
    }
   public void ordenar(double[] c){
       
     //  Arrays.sort(c, Collections.reverseOrder());
      
       Arrays.sort(c);       
       
       double[] d = new double[c.length];
       
       for (int i = 0; i < c.length; i++) {
        d[c.length-1-i] = c[i];
       }
       for (int i = 0; i < c.length; i++) {
           System.out.println(d[i]);
       }
   }
       
       public void inicializarB(double[] a, double [] b){
    
        System.arraycopy(a, 0, b, 0, 10);
        Arrays.fill(b, 10, 20, 0.5);
       }
   }  
       
   
   
   
   
   
   
   
    
    

