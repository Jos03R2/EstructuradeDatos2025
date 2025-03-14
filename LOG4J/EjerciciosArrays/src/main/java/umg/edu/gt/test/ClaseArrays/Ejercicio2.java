/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.test.ClaseArrays;

/**
 *
 * @author Liam Rosario
 */

import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejercicio2 {
    private static final Logger log = LogManager.getLogger(Ejercicio2.class);

    public static int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            ordenarDiagonal(mat, i, 0, m, n);
        }
        for (int j = 1; j < n; j++) {
            ordenarDiagonal(mat, 0, j, m, n);
        }
        return mat;
    }

    private static void ordenarDiagonal(int[][] mat, int fila, int col, int m, int n) {
        List<Integer> diagonal = new ArrayList<>();
        int i = fila, j = col;

        while (i < m && j < n) {
            diagonal.add(mat[i][j]);
            i++;
            j++;
        }

        Collections.sort(diagonal);

        i = fila;
        j = col;
        int index = 0;
        while (i < m && j < n) {
            mat[i][j] = diagonal.get(index++);
            i++;
            j++;
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = {
            {3, 3, 1, 1},
            {2, 2, 1, 2},
            {1, 1, 1, 2}
        };

        int[][] mat2 = {
            {11, 25, 66, 1, 69, 7},
            {23, 55, 17, 45, 15, 52},
            {75, 31, 36, 44, 58, 8},
            {22, 27, 33, 25, 68, 4},
            {84, 28, 14, 11, 5, 50}
        };

        log.info("Matriz 1 ordenada:");
        imprimirMatriz(diagonalSort(mat1));

        log.info("Matriz 2 ordenada:");
        imprimirMatriz(diagonalSort(mat2));
    }

    private static void imprimirMatriz(int[][] mat) {
        for (int[] fila : mat) {
            log.info(Arrays.toString(fila));
        }
    }
}

