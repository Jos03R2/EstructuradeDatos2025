/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package umg.edu.gt.test.EjercicioTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EjercicioTreeSetAndMapEjercicio2Test {

    @BeforeEach
    public void limpiar() {
        EjercicioTreeSetAndMap.resetVersiones();
    }

    @Test
    public void testAgregarYObtenerVersiones() {
        int v1 = EjercicioTreeSetAndMap.agregarVersion("System.out.println('Hola Mundo');");
        int v2 = EjercicioTreeSetAndMap.agregarVersion("System.out.println('Hola Java');");

        assertEquals("System.out.println('Hola Mundo');", EjercicioTreeSetAndMap.obtenerVersion(v1));
        assertEquals("System.out.println('Hola Java');", EjercicioTreeSetAndMap.obtenerVersion(v2));
    }

    @Test
    public void testUltimaVersion() {
        EjercicioTreeSetAndMap.agregarVersion("Versión A");
        EjercicioTreeSetAndMap.agregarVersion("Versión B");

        assertEquals("Versión B", EjercicioTreeSetAndMap.obtenerUltimaVersion());
    }

    @Test
    public void testFalloIntencionalUltimaVersion() {
        EjercicioTreeSetAndMap.agregarVersion("Versión X");

        assertEquals("Versión Y", EjercicioTreeSetAndMap.obtenerUltimaVersion()); 
    }
}

