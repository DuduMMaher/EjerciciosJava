package Entities;

/**
 *
 * @author CASA
 */
public class Empleado extends Persona {
   
    protected int anioInc;
    protected int numDesp;

    public Empleado() {
    }

    public Empleado(int anioInc, int numDesp, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.anioInc = anioInc;
        this.numDesp = numDesp;
    }

    public int getAnioInc() {
        return anioInc;
    }

    public void setAnioInc(int anioInc) {
        this.anioInc = anioInc;
    }

    public int getNumDesp() {
        return numDesp;
    }

    public void setNumDesp(int numDesp) {
        this.numDesp = numDesp;
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() + "anioInc=" + anioInc + ", numDesp=" + numDesp + '}';
    }

    @Override
    public void cambioEstadoCivil() {
        super.cambioEstadoCivil(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
       
    
    public void cambioDespacho(){
        
    }
    
}
