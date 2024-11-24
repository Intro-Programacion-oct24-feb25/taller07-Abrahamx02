/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Usuarioo
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double resultado = 1.0;
        int denominador = 3;
        int i = 0;

        System.out.print("Secuencia: 1 ");

        while (i < 7) {
            if (i % 2 == 0) {

                System.out.print("- 1/" + denominador + " ");
                resultado = resultado - 1.0 / denominador;

            } else {

                System.out.print("+ 1/" + denominador + " ");
                resultado = resultado + 1.0 / denominador;
            }

            denominador = denominador + 2;
            i = i + 1;
        }

        System.out.println("\nResultado de la serie: " + resultado);
    }
}
