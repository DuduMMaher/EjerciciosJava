/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dudum
 */
import java.io.IOException;
import java.util.Scanner;

public class ClearScreenExample {

    public static void main(String[] args) {

        String opc1 = "Dolares";
        String opc2 = "Libras";
        String opc3 = "Yenes";

 //       menu(opc1, opc2, opc3);

 
 Scanner leer = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("");
        System.out.println(opc1);
        System.out.println(opc2);
        System.out.println(opc3);
        System.out.println("");
        System.out.println("Presione ENTER para continuar");
        String d = leer.nextLine();
 
 
 borrarPantalla(opc1);
 
 
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException ex) {
            System.out.println("Error al limpiar la pantalla: " + ex.getMessage());
        }
    }

    public static void menu(String a, String b, String c) {

        Scanner leer = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("");
        System.out.println("Presione ENTER para continuar");
        String d = leer.next();

    }

   
    public static void borrarPantalla(String a) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    
    
}
