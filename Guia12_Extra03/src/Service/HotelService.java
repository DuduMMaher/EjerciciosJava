/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entities.Alojamiento;
import Entities.Camping;
import Entities.Hotel4;
import Entities.Hotel5;
import Entities.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author dudum
 */
public class HotelService {

    public void ordenarPorPrecio(ArrayList<Alojamiento> aloja) {

        ArrayList<Alojamiento> hoteles = new ArrayList();

        for (Alojamiento aux : aloja) {
            if (aux instanceof Hotel4) {
                hoteles.add(aux);
                continue;
            }
            if (aux instanceof Hotel5) {
                hoteles.add(aux);
            }
        }
        
        Comparator<Alojamiento> comparaPrecio = new Comparator<Alojamiento>() {
            @Override
            public int compare(Alojamiento t, Alojamiento t1) {
                if (((Hotel4)t1).getPrecioHab() > ((Hotel4)t).getPrecioHab()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(hoteles, comparaPrecio);
        for (Alojamiento aux : hoteles) {
            System.out.println(aux);
        }
    }

    public void mostrarCampConResto(ArrayList<Alojamiento> alojaArray) {
        
        for (Alojamiento aux : alojaArray) {
            if (aux instanceof Camping) {
                if (((Camping)aux).isRestaurnt()) {
                    System.out.println(aux);
                }
            }
        }
    
    }

    public void residenciasConDesc(ArrayList<Alojamiento> alojaArray) {
        
        for (Alojamiento aux : alojaArray) {
            if (aux instanceof Residencia) {
                if (((Residencia)aux).isDescGremios()) {
                    System.out.println(aux);
                }
            }
        }
    
    }
    
    
}
