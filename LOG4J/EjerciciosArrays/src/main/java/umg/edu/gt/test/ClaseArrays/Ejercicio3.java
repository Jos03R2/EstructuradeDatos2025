/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.test.ClaseArrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejercicio3 {
    private static final Logger log = LogManager.getLogger(Ejercicio3.class);

    public static int sumaElementos(int[][] mat) {
        int suma = 0;
        for (int[] fila : mat) {
            for (int elemento : fila) {
                suma += elemento;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] mat2 = {
            {10, 20},
            {30, 40}
        };

        log.info("Suma de los elementos de la matriz 1: {}", sumaElementos(mat1));
        log.info("Suma de los elementos de la matriz 2: {}", sumaElementos(mat2));
    }
}
