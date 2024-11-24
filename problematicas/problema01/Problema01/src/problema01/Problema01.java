/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Usuarioo
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        datos.useLocale(Locale.US);

        String nombre;
        String posicion;
        String cadena = "";
        String salida;
        String cadenaedades = "";
        
        int edad;
        int contador = 0;
        int edades = 0;
        
        double altura;
        double alturas = 0;
        
        boolean bandera = true;
        
            
        while (bandera) {
            System.out.print("Ingrese el nombre del jugador: ");
            nombre = datos.nextLine();
            
            System.out.print("Ingrese la poscion del jugador: ");
            posicion = datos.nextLine();
            
            System.out.print("Ingrese la edad del jugador: ");
            edad = datos.nextInt();
            
            System.out.print("Ingrese la altura del jugador: ");
            altura = datos.nextDouble();

            contador = contador + 1;
            cadena = String.format("%s%d. %s -%s-, edad %d,estatura %.2f\n",
                                   cadena,
                                   contador,
                                   nombre,
                                   posicion,
                                   edad,
                                   altura);

            edades = edades + edad;
            alturas = alturas + altura;
            datos.nextLine(); 
            
            System.out.print("Ingrese 'si' si desea continuar, caso contrario"
                             + " 'no': \n");
            salida = datos.nextLine();
                       cadenaedades = String.format("%s\n%s",cadenaedades,edad);

            if (salida.equals("no")) {
                bandera = false;                         
            }
        }       
        double promE = edades / contador;
        double promA = alturas / contador;

        System.out.printf("Listado de Jugadores\n%sListado de edades%s\nPromedio de edades: %.1f\n"
                         + "Promedio de estaturas: %.2f\n", 
                          cadena,
                          cadenaedades,
                          promE, 
                          promA);
    }

}



