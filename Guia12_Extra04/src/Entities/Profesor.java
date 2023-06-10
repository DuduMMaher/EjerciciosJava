package Entities;

/**
 *
 * @author CASA
 */
public class Profesor extends Empleado{
    
    protected String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, int anioInc, int numDesp, String nombre, String apellido, int dni, String estadoCivil) {
        super(anioInc, numDesp, nombre, apellido, dni, estadoCivil);
        this.departamento = departamento;
    }

   

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" + super.toString() + "departamento=" + departamento + '}';
    }

    @Override
    public void cambioEstadoCivil() {
        super.cambioEstadoCivil(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void cambioDeDepartamento (){
        
    }
    
}
