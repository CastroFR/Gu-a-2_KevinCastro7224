/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2.kevincastro;

/**
 *
 * @author MINEDUCYT
 */

import java.util.Scanner;

public class Ejercicio2KevinCastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese a continuación el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese su segundo número:");
        double num2 = scanner.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        scanner.close();
    }
}

