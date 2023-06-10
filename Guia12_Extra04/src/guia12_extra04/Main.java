/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12_extra04;

import Entities.Persona;
import HacksDPackage.Servicios;
import Services.FacuService;
import java.util.ArrayList;
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
       
        
        
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> persArray = new ArrayList();
        FacuService fs = new FacuService();
        Servicios serv = new Servicios();
        
        int cant=0;
        
        
        
        
        int opc;
        do {
            System.out.println("MENU");
            System.out.println("--------");
            System.out.println("1.- Ingresar Personal Servicio");
            System.out.println("2.- Ingresar Profesores");
            System.out.println("3.- Ingresar Alumnos");
            System.out.println("4.- Cambio de Estado Civil");
            System.out.println("5.- Cambiar despacho Empleado");
            System.out.println("6.- Cambiar Alumno de Año");
            System.out.println("7.- Cambiar Dep de Profesor");
            System.out.println("8.- Mostrar Listado de Todas las personas");
            System.out.println("9.- Salir");

            opc = serv.validarEntero();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese cuantas personas va a ingresar");
                    cant = leer.nextInt();
                    for (int i = 0; i < cant; i++) {
                      persArray.add(fs.crearPersServ());
                    }
                    break;
                case 2:
                    System.out.println("Ingrese cuantas personas va a ingresar");
                    cant = leer.nextInt();
                    for (int i = 0; i < cant; i++) {
                      persArray.add(fs.crearProfesores());
                    }
                    break;
                case 3:
                    System.out.println("Cuantos alumnos va a Ingresar");
                    cant = leer.nextInt();
                    for (int i = 0; i < cant; i++) {
                      persArray.add(fs.crearEstudiantes());
                    }
                    break;
                case 4:
                    fs.cambiarEstado(persArray);
                    break;
                case 5:
                    fs.reasigDespEmp(persArray);
                    break;
                case 6:
                    fs.cambiarDeAnio(persArray);
                    break;
                case 7:
                    fs.cambioDeDepartamento(persArray);
                    break;
                case 8:
                    fs.mostrarPersona(persArray);
                    break;
                    
                    
    
            }
    
    
    
    } while (opc!=9);
    
}
}