/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10_ej04;

import Entities.Pelicula;
import Services.PeliculaService;

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
    
    
   
    PeliculaService ps = new PeliculaService();
    
    ps.cargarPeliculas();
    ps.mostrarPeliculas();
    ps.mostrarPeliculasLargas();
    ps.ordenarPeliculasMayAMen();
    ps.ordenarPeliculasMenAMay();
    ps.ordenarXTitulo();
    ps.ordenarXDirector();
    
    
    }
    
}
