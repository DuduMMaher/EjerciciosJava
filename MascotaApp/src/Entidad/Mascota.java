/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author dudum
 */
public class Mascota {
    public String nombre[];
    public String apodo[];
    
    public String tipo[]; //Conejo, perro, gato, Carpincho
    public String color[];
    public int edad[];
    public boolean cola[];
    public String raza[];

    public Mascota() {
        nombre = new String[5];
        apodo = new String[5];
        tipo = new String[5];
        color = new String[5];
        edad = new int[5];
        cola = new boolean[5];
        raza = new String[5];
        
        
    }

    public Mascota(String[] nombre, String[] apodo, String[] tipo, String[] color, int[] edad, boolean[] cola, String[] raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
    }

   public void ingresasMascotas(String[] nombre, String[] apodo, String[] tipo, String[] color, int[] edad, boolean[] cola, String[] raza){
       
       this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
       
       
       
   }
  
    
    
    
    
    
    
    
}
