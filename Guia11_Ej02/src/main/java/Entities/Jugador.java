/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author dudum
 */
public class Jugador {

    private int id;
    private String jugador;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, boolean mojado) {
        this.id = id;
        this.jugador = "Jugador " + id;
        this.mojado = mojado;
    }

    public boolean disparo(RevolverDeAgua r) {

        boolean mojo = false;

        mojo = r.mojar();

        if (mojo) {
            System.out.println("Disparo Efectivo");
        } else {
            System.out.println("Disparo Fallido");
        }
        wait(2000);

        return mojo;
    }

    public String getJugador() {
        return jugador;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public static void wait(int ms) {

        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public String toString() {
        return jugador + ", mojado=" + mojado;
    }

}
