/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4.kevincastro;

/**
 *
 * @author MINEDUCYT
 */

import java.util.Scanner;

public class Ejercicio4KevinCastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del rectángulo:");
        double longitud = scanner.nextDouble();

        System.out.println("Ingrese la anchura del rectángulo:");
        double anchura = scanner.nextDouble();

        double perimetro = calcularPerimetro(longitud, anchura);
        double area = calcularArea(longitud, anchura);

        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);

        scanner.close();
    }

    public static double calcularPerimetro(double longitud, double anchura) {
        return 2 * longitud + 2 * anchura;
    }

    public static double calcularArea(double longitud, double anchura) {
        return longitud * anchura;
    }
}


