/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.Scanner;



/**
 *
 * @author dudum
 */
public class Embarcacion {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected Cliente cliente;
    protected String matricula;
    protected Integer eslora;
    protected Integer fabricacion;
    

    public Embarcacion() {
    }

    public Embarcacion(Cliente cliente, String matricula, Integer eslora, Integer fabricacion) {
        this.cliente=cliente;
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(Integer fabricacion) {
        this.fabricacion = fabricacion;
    }
    
    public double calcularCosto(Embarcacion emb, int totDias){
        
        return emb.getEslora()*10*totDias;
        
        
    }
    
    

    @Override
    public String toString() {
        return "Embarcacion{" + "cliente=" + cliente + ", matricula=" + matricula + ", eslora=" + eslora + ", fabricacion=" + fabricacion + '}';
    }

    
    
    
    
    
    
}
