/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia09_ej06;

import Entidades.Curso;
import Servicios.CursoServicios;
import java.util.Scanner;

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
        Scanner leer = new Scanner(System.in);
        
    Curso[] c= new Curso[100];
    CursoServicios cs= new CursoServicios();
    
//    int pv= cs.buscarPrimerVacio(c);
//    c[pv]=cs.crearCurso();
    int cont=0;
    int opc;
        do {
            System.out.println("MENU");
            System.out.println("-------");
            System.out.println("1.- Crear Curso");
            System.out.println("2.- Calcular ganancia semanal");
            System.out.println("3.- Calcular Todas las ganacias");
            System.out.println("4.- Mostrar info del curso");
            System.out.println("5.- Salir");
            opc= leer.nextInt();
            
            switch (opc) {
                case 1:
                    int x=cs.buscarPrimerVacio(c);
                    if (x==101){
                        System.out.println("Ya no se pueden cargar mas cursos");
                        break;
                    }
                    c[x]=cs.crearCurso();
                    break;
                case 2:
                    int bc = cs.buscarCurso(c);
                    if (bc==101){
                        System.out.println("El grupo ingresado no existe");
                        break;
                    }
                    cs.calcularGanancia(c[bc]);
                    break;
                case 3:
                    for (int i = 0; i < cs.buscarPrimerVacio(c); i++) {
                        cs.calcularGanancia(c[i]);
                        cont++;
                    }
                    if (cont==0){
                        System.out.println("Todavia no hay cargado ningun Curso");
                        
                    }
                    break;
                case 4:
                    cs.mostrarCurso(c[cs.buscarCurso(c)]);
                    break;
                case 5:
                    break;
                default:
                    throw new AssertionError();
            }
            
            
        } while (opc!=5);
        
        for (int i = 0; i < cs.buscarPrimerVacio(c); i++) {
            System.out.println(c[i].toString());
        }
        
    }
    
}
