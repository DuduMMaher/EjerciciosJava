/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia08_extra01;

import Entidades.Raices;
import Servicios.RaicesServicios;

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
    
        
        RaicesServicios rs = new RaicesServicios();
        Raices r1 = rs.insertarValores();
        
        double disc=rs.getDiscriminante(r1);
        rs.calcular(r1);
    
    
    }
    
}
