/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package umg.edu.gt.test.ClaseArrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Liam Rosario
 */

class Ejercicio2Test {

    @Test
    void testDiagonalSort_Caso1() {
        int[][] input = {
            {3, 3, 1, 1},
            {2, 2, 1, 2},
            {1, 1, 1, 2}
        };

        int[][] expected = {
            {1, 1, 1, 1},
            {1, 2, 2, 2},
            {1, 2, 3, 3}
        };
        assertArrayEquals(expected, Ejercicio2.diagonalSort(input));
    }

    @Test
    void testDiagonalSort_Caso2() {
        int[][] input = {
            {11, 25, 66, 1, 69, 7},
            {23, 55, 17, 45, 15, 52},
            {75, 31, 36, 44, 58, 8},
            {22, 27, 33, 25, 68, 4},
            {84, 28, 14, 11, 5, 50}
        };
        int[][] expected = {
            {5, 17, 4, 1, 7, 8},
            {11, 11, 25, 15, 52, 50},
            {14, 23, 27, 44, 58, 69},
            {22, 28, 31, 36, 66, 68},
            {75, 55, 33, 45, 84, 25}
        };

        assertArrayEquals(expected, Ejercicio2.diagonalSort(input));
    }

    @Test
    void testDiagonalSort_Fallido() {
        int[][] input = {
            {3, 3, 1, 1},
            {2, 2, 1, 2},
            {1, 1, 1, 2}
        };

        
        int[][] expected = {
            {3, 3, 1, 1},
            {2, 2, 1, 2},
            {1, 1, 1, 2}
        };

        assertArrayEquals(expected, Ejercicio2.diagonalSort(input));
    }
}
