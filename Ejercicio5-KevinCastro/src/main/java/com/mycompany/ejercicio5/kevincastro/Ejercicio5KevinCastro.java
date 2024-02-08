/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5.kevincastro;

/**
 *
 * @author MINEDUCYT
 */
import java.util.Scanner;

public class Ejercicio5KevinCastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();

        double area = calcularArea(radio);
        double volumen = calcularVolumen(radio);

        System.out.println("El área de la esfera es: " + area);
        System.out.println("El volumen de la esfera es: " + volumen);

        scanner.close();
    }

    public static double calcularArea(double radio) {
        double pi = 3.141592653;
        double area = pi * radio * radio;
        return area;
    }

    public static double calcularVolumen(double radio) {
        double pi = 3.141592653;
        double volumen = (4.0 / 3.0) * pi * radio * radio * radio;
        return volumen;
    }
}

