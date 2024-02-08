/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1.kevincastro;

/**
 *
 * @author MINEDUCYT
 */

import java.util.Scanner;

public class Ejercicio1KevinCastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una palabra: ");
        String palabra = scanner.next();

        System.out.println("Introduzca un número: ");
        int numero = scanner.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println(palabra);
        }

        scanner.close();
    }
}


