package Entities;

/**
 *
 * @author CASA
 */
public class Estudiante extends Persona{
    
    protected int cursoMat;

    public Estudiante() {
    }

    public Estudiante(int cursoMat, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.cursoMat = cursoMat;
    }

    public int getCursoMat() {
        return cursoMat;
    }

    public void setCursoMat(int cursoMat) {
        this.cursoMat = cursoMat;
    }

    @Override
    public String toString() {
        return "Estudiante{" + super.toString() + "cursoMat=" + cursoMat + '}';
    }

    @Override
    public void cambioEstadoCivil() {
        super.cambioEstadoCivil(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void nuevaMat (){
        
    }
    
}
