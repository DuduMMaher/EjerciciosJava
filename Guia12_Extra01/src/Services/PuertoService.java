/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.AMotor;
import Entities.Alquiler;
import Entities.Cliente;
import Entities.Embarcacion;
import Entities.Velero;
import Entities.Yate;
import HacksDPackage.Servicios;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class PuertoService {

    Servicios serv = new Servicios();
    
    

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler crearAlquiler(ArrayList<Cliente> cliente, ArrayList<Embarcacion> emb) {

       
        System.out.print("Ingrese su DNI: ");
        int dni = serv.validarEntero();
        if (!clienteExiste(cliente, dni)) {
            cliente.add(crearCliente(dni));
        };
        System.out.print("Ingrese Fecha Inicio(dd/mm/aaaa): ");
        String fechaI = leer.next();
        LocalDate fecha = stringToLocalDate(fechaI);
        System.out.print("Ingrese Fecha Finalizacion(dd/mm/aaaa): ");
        String fechaF = leer.next();
        LocalDate dev = stringToLocalDate(fechaF);
        System.out.print("Numero de Amarra: ");
        int amarre = serv.validarEntero();
        emb.add(ingresarEmbarcacion(cliente.get(indexCliente(cliente, dni))));
        int totDias = (int) ChronoUnit.DAYS.between(fecha, dev);
        double costo=0.0;
        if (emb.get(emb.size() -1) instanceof Velero) {
        Velero vel = (Velero)emb.get(emb.size() -1);
           costo= vel.calcularCosto(emb.get(emb.size() -1), totDias);
        }
        if (emb.get(emb.size() -1) instanceof AMotor) {
        AMotor mot = (AMotor)emb.get(emb.size() -1);
           costo= mot.calcularCosto(emb.get(emb.size() -1), totDias);
        }
        if (emb.get(emb.size() -1) instanceof Yate) {
        Yate yat = (Yate)emb.get(emb.size() -1);
           costo= yat.calcularCosto(emb.get(emb.size() -1), totDias);
        }
        if (emb.get(emb.size() -1) instanceof Embarcacion) {
        Embarcacion em = (Embarcacion)emb.get(emb.size() -1);
           costo= em.calcularCosto(emb.get(emb.size() -1), totDias);
        }
        
        return new Alquiler(cliente.get(indexCliente(cliente, dni)), fecha, dev, amarre, emb.get(emb.size()-1), costo);
    }

    public static LocalDate stringToLocalDate(String date) {
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate localDate;
        try {
            localDate = LocalDate.parse(date, dateTimeFormatter);
        } catch (DateTimeParseException e) {
            return null;
        }
        return localDate;
    }

    

    private boolean clienteExiste(ArrayList<Cliente> client, int dni) {

        boolean ref = false;

        for (Cliente aux : client) {
            if (aux.getDni() == dni) {
                ref = true;
                break;
            }
        }
        return ref;
    }

    private int indexCliente(ArrayList<Cliente> cliente, int dni) {

        int index = -1;

        do {
            index++;
        } while (cliente.get(index).getDni() != dni);

        return index;
    }
    
   
    private Cliente crearCliente(int dni) {

        System.out.print("Apellido y nombre: ");
        String nombre = serv.apellidoNombre();
        System.out.println(nombre);
        serv.wait(1000);
        return new Cliente(dni, nombre);

    }

    private Embarcacion ingresarEmbarcacion(Cliente cliente) {

        Integer potencia=0;
        Integer camarotes=0;
        System.out.print("Ingrese Matricula:");
        String matricula = leer.next();
        System.out.print("Eslora: ");
        Integer eslora = serv.validarEntero();
        System.out.print("Año Fabricacion: ");
        Integer fabricacion = serv.validarEntero();
        System.out.print("Cant Mastiles: ");
        Integer mastiles = serv.validarEntero();
        if (mastiles == 0) {
            System.out.print("Potencia motor: ");
            potencia = serv.validarEntero();
            System.out.print("Cant Camarotes: ");
            camarotes = serv.validarEntero();
        }
        if (mastiles != 0) {
            return new Velero(mastiles, cliente, matricula, eslora, fabricacion);
        }
        if (camarotes ==0) {
            return new AMotor (potencia, cliente, matricula, eslora, fabricacion);
        }
        if (camarotes !=0){
            return new Yate(cliente, matricula, eslora, fabricacion,potencia, camarotes);
        }
        
       return new Embarcacion (cliente, matricula, eslora, fabricacion);
    }

    public void verListaClientes(ArrayList<Cliente> cliente) {
        
        for (Cliente aux : cliente) {
            System.out.println(aux);
        }
    }

    public void verListaAlquileres(ArrayList<Alquiler> alq) {
        
    
        for (Alquiler aux : alq) {
            System.out.println(aux);
        }
    }

    public void verListaEmbarcaciones(ArrayList<Embarcacion> emb) {
        
        for (Embarcacion aux : emb) {
            System.out.println(aux);
           
        }
    
    
    }

}
