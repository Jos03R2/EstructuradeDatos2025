/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package umg.edu.gt.test.ClaseArrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1Test {
    private static final Logger logger = LogManager.getLogger(Ejercicio1Test.class);

    @Test
    void testRiquezaMaximaCaso1() {
        int[][] cuentas = {{1, 2, 3}, {3, 2, 1}};
        int resultado = Ejercicio1.riquezaMaxima(cuentas);
        logger.info("Test Caso 1 - Esperado: 6, Obtenido: {}", resultado);
        assertEquals(6, resultado, "Error en el caso de prueba 1");
    }

    @Test
    void testRiquezaMaximaCaso2() {
        int[][] cuentas = {{1, 5}, {7, 3}, {3, 5}};
        int resultado = Ejercicio1.riquezaMaxima(cuentas);
        logger.info("Test Caso 2 - Esperado: 10, Obtenido: {}", resultado);
        assertEquals(10, resultado, "Error en el caso de prueba 2");
    }

    @Test
    void testRiquezaMaximaCaso3() {
        int[][] cuentas = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int resultado = Ejercicio1.riquezaMaxima(cuentas);
        logger.info("Test Caso 3 - Esperado: 17, Obtenido: {}", resultado);
        assertEquals(17, resultado, "Error en el caso de prueba 3");
    }

    @Test
    void testFallaForzada() {
        int[][] cuentas = {{2, 2, 2}, {1, 1, 1}};
        int resultado = Ejercicio1.riquezaMaxima(cuentas);
        logger.info("Test Falla Forzada - Esperado: 5, Obtenido: {}", resultado);
        assertEquals(6, resultado, "El test que falla.");

    }
}
