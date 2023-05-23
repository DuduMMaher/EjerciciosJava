/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


import PersonaService.PersonaService;
import java.util.Date;

/**
 *
 * @author dudum
 */
public class Persona {
   
    PersonaService ps = new PersonaService();
    
    
    private String Nombre;
    private Date nacimiento;

    public Persona() {
    }

    public Persona(String Nombre) {
        this.Nombre = Nombre;
      this.nacimiento = ps.fechaNacimiento();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", nacimiento=" + nacimiento + '}';
    }
    
    
    
}
