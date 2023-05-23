/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07_ej04.Entidades;

import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {

    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int calcularArea() {

        return base * altura;

    }

    public int calcularPerimetro() {

        return (base + altura) * 2;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void imprimeRectangulo() {

        for (int i = 0; i < altura; i++) {

            if (i == 0 || i == (altura - 1)) {

                for (int j = 0; j < base; j++) {
                    System.out.print("* ");
                }
            } else {

                for (int j = 0; j < base; j++) {
                    if (j == 0 || j == (base - 1)) {
                        System.out.print("* ");

                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("");
 }

    public void crearRectangulo() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Base y Altura del rectangulo");
        base = leer.nextInt();
        altura = leer.nextInt();

    }

}
