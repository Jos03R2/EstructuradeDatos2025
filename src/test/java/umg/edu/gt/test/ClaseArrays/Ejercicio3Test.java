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

public class Ejercicio3Test {
    
    @Test
    public void testSumaElementos_Caso1() {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int resultado = Ejercicio3.sumaElementos(matriz);
        assertEquals(45, resultado, "La suma de los elementos de la matriz sera 45");
    }
    
    @Test
    public void testSumaElementos_Caso2() {
        int[][] matriz = {
            {10, 20},
            {30, 40}
        };
        int resultado = Ejercicio3.sumaElementos(matriz);
        assertEquals(100, resultado, "La suma de los elementos de la matriz sera 100");
    }
    
    @Test
    public void testSumaElementos_MatrizVacia() {
        int[][] matriz = {};
        int resultado = Ejercicio3.sumaElementos(matriz);
        assertEquals(0, resultado, "La suma de una matriz vacía debería ser 0");
    }
    
    @Test
    public void testSumaElementos_FalloIntencional() {
        int[][] matriz = {
            {1, 2},
            {3, 4}
        };
        int resultado = Ejercicio3.sumaElementos(matriz);
        assertEquals(15, resultado, " test diseñado para fallar"); 
    }
}
