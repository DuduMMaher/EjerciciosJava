/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07_extra03.Entidades;

import java.util.Scanner;

/**
 *
 * @author dudum
 */
public class Juego {

    private int numero1;

    public Juego() {
    }

    public Juego(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void iniciarJuego() {

        Scanner leer = new Scanner(System.in);

        int h = 1;
        int h1=1;
        int cont1 = 0;
        int intentos=0;
        int numero2;
        String vuelta="";
        boolean ref1;
        int[] ganados = new int[2];
        
        do {
            h1++;
            h++;
            ref1 = true;
            System.out.println("JUGADOR N° " + ((h % 2) + 1));
            h++;
            System.out.println("");
            if ((h1%2)==0){
            System.out.println("Ingrese cant de Intentos");
            intentos = leer.nextInt();
            }
            System.out.println("Ingrese el numero a adivinar");

            numero1 = leer.nextInt();

            for (int i = 0; i < 20; i++) {
                System.out.println("");
            }
            System.out.println("");
            System.out.println("JUGADOR N° " + ((h % 2) + 1));

            for (int i = 0; i < intentos; i++) {
                System.out.println("Intento N° " + (i + 1));
                numero2 = leer.nextInt();
                cont1++;
                
               
                
                if (numero2 == numero1) {
                    System.out.println("GANASTE!!!");
                    System.out.println("Lo lograste en " + cont1 + " intentos");
                    ganados[(h % 2)]++;
                    ref1 = false;
                    break;
                }
                if (numero2>numero1){
                    System.out.println("MAS BAJO !!!");
                } else {
                    System.out.println("MAS ALTO !!!");
                }
            
            }
            h++;
            if (ref1) {
                System.out.println("Lastima!!! Se terminaron los intentos");
                System.out.println("El numero correcto era " + numero1);
            }
            if ((h1%2)==1){
            do {
                System.out.println("Desean volver a jugar?? (S/N)");
                vuelta = leer.next();
                vuelta = vuelta.toLowerCase();
            } while ((!vuelta.equals("n")) && (!vuelta.equals("s")));
            } else {
                vuelta="s";
            }
            cont1 = 0;
        } while (vuelta.equals("s"));
        System.out.println("El jugador 1 gano " + ganados[0] + " veces");
        System.out.println("El judador 2 gano " + ganados[1] + " veces");
    }

}
