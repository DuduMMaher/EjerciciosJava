/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Empleado;
import Entities.Estudiante;
import Entities.Persona;
import Entities.PersonalDeServicio;
import Entities.Profesor;
import HacksDPackage.Servicios;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class FacuService {

    Servicios serv = new Servicios();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public PersonalDeServicio crearPersServ() {

        System.out.print("Ingrese el Apellido: ");
        String apellido = serv.apellido();
        System.out.println(apellido);
        serv.wait(100);
        System.out.print("Ingrese el Nombre: ");
        String nombre = serv.nombre();
        System.out.println(nombre);
        serv.wait(100);
        System.out.print("Ingrese DNI: ");
        int dni = serv.generarDni();
        System.out.println(dni);
        serv.wait(100);
        System.out.print("Estado Civil: ");
        String estadoCivil = serv.estadoCivil();
        System.out.println(estadoCivil);
        serv.wait(100);
        
        System.out.print("Seccion en que trabaja: ");
        String seccion = serv.personalServicio();
        System.out.println(seccion);
        serv.wait(100);
        System.out.print("Año ingreso: ");
        int anioInc = serv.anio(1985, 2023);
        System.out.println(anioInc);
        serv.wait(100);
        System.out.print("Ingrese Num de Despacho: ");
        int numDesp = serv.numero(50);
        System.out.println(numDesp);
        serv.wait(100);
        System.out.println("");

        return new PersonalDeServicio(seccion, anioInc, numDesp, nombre, apellido, dni, estadoCivil);
    }

    public Profesor crearProfesores() {
// (String departamento, int anioInc, int numDesp, String nombre, String apellido, int dni, String estadoCivil)
        System.out.print("Ingrese el Apellido: ");
        String apellido = serv.apellido();
        System.out.println(apellido);
        serv.wait(100);
        System.out.print("Ingrese el Nombre: ");
        String nombre = serv.nombre();
        System.out.println(nombre);
        serv.wait(100);
        System.out.print("Ingrese DNI: ");
        int dni = serv.generarDni();
        System.out.println(dni);
        serv.wait(100);
        System.out.print("Estado Civil: ");
        String estadoCivil = serv.estadoCivil();
        System.out.println(estadoCivil);
        serv.wait(100);
        System.out.print("Ingrese Departamento: ");
        String departamento = serv.materia();
        System.out.println(departamento);
        serv.wait(100);
        System.out.print("Año ingreso: ");
        int anioInc = serv.anio(1985, 2023);
        System.out.println(anioInc);
        serv.wait(100);
        System.out.print("Ingrese Num de Despacho: ");
        int numDesp = serv.numero(50);
        System.out.println(numDesp);
        serv.wait(100);
        System.out.println("");

        return new Profesor(departamento, anioInc, numDesp, nombre, apellido, dni, estadoCivil);
    }

    public Estudiante crearEstudiantes() {

        // (String cursoMat, String nombre, String apellido, int dni, String estadoCivil)      
        System.out.print("Ingrese el Apellido: ");
        String apellido = serv.apellido();
        System.out.println(apellido);
        serv.wait(100);
        System.out.print("Ingrese el Nombre: ");
        String nombre = serv.nombre();
        System.out.println(nombre);
        serv.wait(100);
        System.out.print("Ingrese DNI: ");
        int dni = serv.generarDni();
        System.out.println(dni);
        serv.wait(100);
        System.out.print("Estado Civil: ");
        String estadoCivil = serv.estadoCivil();
        System.out.println(estadoCivil);
        serv.wait(100);
        System.out.println("Ingrese en que año cursa");
        int cursoMat = serv.numero(7);
        System.out.println("");

        return new Estudiante(cursoMat, nombre, apellido, dni, estadoCivil);
    }

    public void mostrarPersona(ArrayList<Persona> persArray) {

        for (Persona aux : persArray) {
            System.out.println(aux);
        }

    }

    public void cambiarEstado(ArrayList<Persona> persArray) {

        System.out.println("A quien le quiere cambiar el Estado Civil?");
        System.out.print("Ingrese el DNI: ");
        int dni = serv.validarEntero();
        boolean ref = false;
        Persona pers = new Persona();

        for (Persona aux : persArray) {
            if (aux.getDni() == dni) {
                System.out.println("El estado civil actual es " + aux.getEstadoCivil());
                System.out.println("");
                System.out.println("Estados Civiles");
                serv.mostrarEstadoCivil();
                System.out.print("Ingrese el nuevo estado civil: ");
                int nuevoEstado = leer.nextInt();
                String estado = serv.elegirEstadoCivil(nuevoEstado);
                aux.setEstadoCivil(estado);
                ref = true;
                pers = aux;
                break;
            }
        }
        if (!ref) {
            System.out.println("Ingreso un DNI incorrecto");
            serv.wait(500);
        } else {
            System.out.println("El estado cambio correctamente");
            System.out.println(pers);
        }

    }

    public void reasigDespEmp(ArrayList<Persona> persArray) {

        System.out.println("A quien le quiere reasignar el depacho?");
        System.out.print("Ingrese el DNI: ");
        int dni = serv.validarEntero();
        boolean ref = false;
        Persona pers = new Persona();

        for (Persona aux : persArray) {
            if (aux instanceof Empleado) {

                if (aux.getDni() == dni) {
                    System.out.println("El Despacho actual es " + ((Empleado) aux).getNumDesp());
                    System.out.println("");
                    System.out.print("Ingrese el nuevo Despacho: ");
                    int nuevoDesp = serv.validarEntero();
                    ((Empleado) aux).setNumDesp(nuevoDesp);
                    ref = true;
                    pers = aux;
                    break;
                }
            }
        }
        if (!ref) {
            System.out.println("Ingreso un DNI incorrecto");
            serv.wait(500);
        } else {
            System.out.println("El estado cambio correctamente");
            System.out.println(pers);
        }

    }

    public void cambiarDeAnio(ArrayList<Persona> persArray) {
        
        System.out.println("A quien le quiere cambiar de Matriula?");
        System.out.print("Ingrese el DNI: ");
        int dni = serv.validarEntero();
        
        boolean ref = false;
        Persona pers = new Persona();
    
        for (Persona aux : persArray) {
            if (aux instanceof Estudiante) {

                if (aux.getDni() == dni) {
                    System.out.println("El Año actual es " + ((Estudiante) aux).getCursoMat());
                    System.out.println("");
                    System.out.print("Ingrese el nuevo Año: ");
                    int nuevoAnio = serv.validarEntero();
                    ((Estudiante) aux).setCursoMat(nuevoAnio);
                    ref = true;
                    pers = aux;
                    break;
                }
            }
        }
        if (!ref) {
            System.out.println("Ingreso un DNI incorrecto");
            serv.wait(500);
        } else {
            System.out.println("El estado cambio correctamente");
            System.out.println(pers);
        }

    }

    public void cambioDeDepartamento(ArrayList<Persona> persArray) {
        
        System.out.println("A quien desea cambiar de Departamento?");
        System.out.print("Ingrese el DNI: ");
        int dni = serv.validarEntero();
        boolean ref = false;
        Persona pers = new Persona();

        for (Persona aux : persArray) {
            if (aux instanceof Profesor) {
            if (aux.getDni() == dni) {
                System.out.println("El departamento actual es " + ((Profesor)aux).getDepartamento());
                System.out.println("");
                System.out.println("Departamentos");
                serv.mostrarMateria();
                System.out.print("Ingrese nueva materia a dictar: ");
                int nuevaMateria = serv.validarEntero();
                String materia = serv.elejirMateria(nuevaMateria);
                ((Profesor)aux).setDepartamento(materia);
                ref = true;
                pers = aux;
                break;
            }
            }
        }
        if (!ref) {
            System.out.println("Ingreso un DNI incorrecto");
            serv.wait(500);
        } else {
            System.out.println("El estado cambio correctamente");
            System.out.println(pers);
        }

    
    }

}
