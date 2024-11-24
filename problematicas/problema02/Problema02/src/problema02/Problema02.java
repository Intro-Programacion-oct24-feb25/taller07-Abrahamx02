/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /*
Generar e imprimir la siguiente serie:
2
6
12
20
30
42
56
72
90
110
 */
package problema02;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Usuarioo
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        datos.useLocale(Locale.US);
        int num = 2;
        int incremento = 4;
        int limit = 10;
        int contador = 1;

        System.out.println("Serie numerica:");
        while (contador <= limit) {

            System.out.println(num);

            num = num + incremento;

            incremento = incremento + 2;

            contador = contador + 1;
        }
    }
}
