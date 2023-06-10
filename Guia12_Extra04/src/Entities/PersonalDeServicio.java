package Entities;

/**
 *
 * @author CASA
 */
public class PersonalDeServicio extends Empleado {
    
    protected String seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccion, int anioInc, int numDesp, String nombre, String apellido, int dni, String estadoCivil) {
        super(anioInc, numDesp, nombre, apellido, dni, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "PersonalDeServicio{" + super.toString() + "seccion=" + seccion + '}';
    }

    @Override
    public void cambioDespacho() {
        super.cambioDespacho(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void cambioEstadoCivil() {
        super.cambioEstadoCivil(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void cambioDeSeccion (){
        
    }
    
}
