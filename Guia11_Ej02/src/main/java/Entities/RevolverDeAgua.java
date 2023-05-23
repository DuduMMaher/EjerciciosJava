/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.Random;

/**
 *
 * @author dudum
 */
public class RevolverDeAgua {

    private int posicionActual;
    private int posicionAgua;

    public void llenarRevolver() {

        Random rand = new Random();

        posicionActual = rand.nextInt(6);
        posicionAgua = rand.nextInt(6);

    }

    public boolean mojar() {

        boolean moja = false;

        if (posicionActual == posicionAgua) {
            moja = true;
        }
        return moja;
    }

    public void siguienteChorro() {

        if (posicionActual < 5) {
            posicionActual++;
        } else {
            posicionActual = 0;
        }

    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua \n" + "Posicion Actual= " + posicionActual + ", Posicion Agua= " + posicionAgua;
    }

}
