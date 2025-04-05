/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */



/**
 *
 * @author Liam Rosario
 */
package umg.edu.gt.test.EjercicioTree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import umg.edu.gt.EjercicioTree;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class EjercicioTreeTest {

    private String crearArchivoPrueba(String contenido) throws IOException {
        String ruta = "test_texto.txt";
        FileWriter escritor = new FileWriter(ruta);
        escritor.write(contenido);
        escritor.close();
        return ruta;
    }

    @Test
    public void testFrecuenciaCorrecta() throws IOException {
        String texto = "Hola mundo hola";
        String ruta = crearArchivoPrueba(texto);

        Map<String, Integer> resultado = EjercicioTree.contarFrecuenciaPalabras(ruta);

        assertEquals(2, resultado.get("hola"));
        assertEquals(1, resultado.get("mundo"));
    }

    @Test
    public void testFrecuenciaConPuntuacion() throws IOException {
        String texto = "¡Hola, mundo! ¿Hola?";
        String ruta = crearArchivoPrueba(texto);

        Map<String, Integer> resultado = EjercicioTree.contarFrecuenciaPalabras(ruta);

        assertEquals(2, resultado.get("hola"));
        assertEquals(1, resultado.get("mundo"));
    }

    @Test
    public void testFalloEsperado() throws IOException {
        String texto = "uno dos tres tres";
        String ruta = crearArchivoPrueba(texto);

        Map<String, Integer> resultado = EjercicioTree.contarFrecuenciaPalabras(ruta);

        // Este test está forzado a fallar
        assertEquals(1, resultado.get("tres")); // Debería ser 2, así que fallará
    }
}
