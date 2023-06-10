/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12_extra03;

import Entities.Edificio;
import Entities.EdificioDeOficinas;
import Entities.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author dudum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    ArrayList<Edificio> edif = new ArrayList();
    
    
    Polideportivo pol1 = new Polideportivo("Deportivo Jose", true, 20, 3, 150);
    Polideportivo pol2 = new Polideportivo("Deportivo Pedro", false, 120, 3, 250);
    EdificioDeOficinas eof1 = new EdificioDeOficinas(5, 25, 5, 25,15, 50);
    EdificioDeOficinas eof2 = new EdificioDeOficinas(8, 20, 8, 18, 24, 40);
    
    edif.add(pol1);
    edif.add(pol2);
    edif.add(eof1);
    edif.add(eof2);
    
    int cont=0;
    
        for (Edificio aux : edif) {
            if (aux instanceof Polideportivo) {
                System.out.println("Superficie= " + ((Polideportivo)aux).calcularSuperfie(aux));
                System.out.println("Volumen= " + ((Polideportivo)aux).calcularVolumen(aux));
                if (((Polideportivo) aux).isTechado()){
                    System.out.println("El edificio esta techado");
                    cont++;
                } else {
                    System.out.println("El edificio NO esta techado");
                }
            }
            if (aux instanceof EdificioDeOficinas) {
                System.out.println("Superficie= " + ((EdificioDeOficinas)aux).calcularSuperfie(aux));
                System.out.println("Volumen= " + ((EdificioDeOficinas)aux).calcularVolumen(aux));
                System.out.println("Cant personas por piso: " + ((EdificioDeOficinas) aux).getPersonas());
                System.out.println("Cant total personas en el edificio: " + ((EdificioDeOficinas) aux).getPersonas()*((EdificioDeOficinas) aux).getPisos());
            }
            System.out.println("");
        }
    
        System.out.println("La cant de Polideportivos techados es de: " + cont);
    
    }
    
}
