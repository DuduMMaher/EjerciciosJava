/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia09_ej01;

import Entities.Cadena;
import Services.CadenaServicios;

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
   
    CadenaServicios cs= new CadenaServicios();
    Cadena c1 = cs.crearCadena();
   
    cs.mostrarVocales(c1);
    cs.invertirFrase(c1);
    cs.vecesRepetido(c1);
    cs.compararLongitud(c1);
    cs.unirFrases(c1);
    cs.reemplazar(c1);
    if (cs.contiene(c1)){
        System.out.println("La frase contiene la letra indicada");
    }else {
        System.out.println("No contiene");
    }
    
    }
    
}
