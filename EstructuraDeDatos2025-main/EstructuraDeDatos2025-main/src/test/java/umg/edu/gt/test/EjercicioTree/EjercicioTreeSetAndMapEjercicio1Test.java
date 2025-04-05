/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package umg.edu.gt.test.EjercicioTree;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

public class EjercicioTreeSetAndMapEjercicio1Test {

    @Test
    public void testFrecuenciaPalabras() throws IOException {
        Path tempFile = Path.of("tempTest1.txt");
        try (FileWriter writer = new FileWriter(tempFile.toFile())) {
            writer.write("Hola mundo hola Java.");
        }

        TreeMap<String, Integer> resultado = EjercicioTreeSetAndMap.contarFrecuenciaPalabras(tempFile.toString());

        assertEquals(2, resultado.get("hola"));
        assertEquals(1, resultado.get("mundo"));
        assertEquals(1, resultado.get("java"));

        tempFile.toFile().delete();
    }

    @Test
    public void testFalloIntencionalFrecuencia() throws IOException {
        Path tempFile = Path.of("tempTestFallo.txt");
        try (FileWriter writer = new FileWriter(tempFile.toFile())) {
            writer.write("Java Java Java");
        }

        TreeMap<String, Integer> resultado = EjercicioTreeSetAndMap.contarFrecuenciaPalabras(tempFile.toString());

        assertEquals(2, resultado.get("java")); 

        tempFile.toFile().delete();
    }
}

