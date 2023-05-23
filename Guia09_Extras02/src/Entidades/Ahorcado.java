/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author dudum
 */
public class Ahorcado {

    private String[] palabra;
    private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(String palabra, int intentos) {
        this.palabra = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            this.palabra[i] = palabra.substring(i, (i + 1));
        }
        this.intentos = intentos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", intentos=" + intentos + '}';
    }

}
