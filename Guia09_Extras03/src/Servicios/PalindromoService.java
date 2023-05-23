/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

/**
 *
 * @author dudum
 */
public class PalindromoService {
    
    
    
    public boolean compararPalabras(String palabra){
    
        String palabra2="";
        boolean palindromo=false;
        
        
        for (int i = 0; i < palabra.length(); i++) {
            palabra2= palabra2.concat(palabra.substring(palabra.length()-1-i, palabra.length()-i));
        }
        
        if (palabra2.equals(palabra)) {
            palindromo=true;
        } else {
            palindromo=false;
        }
        return palindromo;
    }
}
