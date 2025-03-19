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
   
class Ejercicio1Test {

    @Test
    void testRiquezaMaximaCaso1() {
        int[][] cuentas = {{1, 2, 3}, {3, 2, 1}};
        int resultado = Ejercicio1.riquezaMaxima(cuentas);
        assertEquals(6, resultado, "Error en el caso de prueba 1");
    }

    @Test
    void testRiquezaMaximaCaso2() {
        int[][] cuentas = {{1, 5}, {7, 3}, {3, 5}};
        int resultado = Ejercicio1.riquezaMaxima(cuentas);
        assertEquals(10, resultado, "Error en el caso de prueba 2");
    }

    @Test
    void testRiquezaMaximaCaso3() {
        int[][] cuentas = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int resultado = Ejercicio1.riquezaMaxima(cuentas);
        assertEquals(17, resultado, "Error en el caso de prueba 3");
    }

    @Test
    void testFallaForzada() {
        int[][] cuentas = {{2, 2, 2}, {1, 1, 1}};
        int resultado = Ejercicio1.riquezaMaxima(cuentas);
        assertEquals(5, resultado, "El test que falla.");
    }
}