package com.sv.operacionesmatematicasws;

import com.sv.opservices.beans.ServicioOperacionesWSImpl;
import java.util.Scanner;

/**
 *
 * @author rguzm
 */
public class Operacionesmatematicasws {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicioOperacionesWSImpl servicio = new ServicioOperacionesWSImpl();

        System.out.print("Ingrese el primer número (a): ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo número (b): ");
        int b = scanner.nextInt();

        int suma = servicio.sumar(a, b);
        int resta = servicio.restar(a, b);
        int multiplicacion = servicio.multiplicar(a, b);
        double division;
        try {
            division = servicio.dividir(a, b);
        } catch (IllegalArgumentException e) {
            division = Double.NaN;  // Indicar que la división no es válida
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
