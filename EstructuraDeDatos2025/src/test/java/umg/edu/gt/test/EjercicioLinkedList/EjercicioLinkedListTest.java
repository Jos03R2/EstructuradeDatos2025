/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package umg.edu.gt.test.EjercicioLinkedList;

import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.Arrays;

public class EjercicioLinkedListTest {

    @Test
    void testEliminarDuplicados() {
        LinkedList<Integer> lista = new LinkedList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        LinkedList<Integer> resultado = EjercicioLinkedList.eliminarDuplicados(lista);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), resultado);
    }

    @Test
    void testInvertirLista() {
        LinkedList<String> lista = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
        EjercicioLinkedList.invertirLista(lista);
        assertEquals(Arrays.asList("D", "C", "B", "A"), lista);
    }

    @Test
    void testIntercalarListasOrdenadas() {
        LinkedList<Integer> lista1 = new LinkedList<>(Arrays.asList(1, 3, 5));
        LinkedList<Integer> lista2 = new LinkedList<>(Arrays.asList(2, 4, 6));
        LinkedList<Integer> resultado = EjercicioLinkedList.intercalarListasOrdenadas(lista1, lista2);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), resultado);
    }

    
    // --------esta es el que va a fallar------
    @Test
    void testForzarFallo() {
        LinkedList<Integer> lista = new LinkedList<>(Arrays.asList(1, 1, 2, 3));
        LinkedList<Integer> resultado = EjercicioLinkedList.eliminarDuplicados(lista);
        assertNotEquals(Arrays.asList(1, 1, 2, 3), resultado); 
    }
}
