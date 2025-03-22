package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EjercicioLinkedList {
    
	//xvz
	
    public static LinkedList<Integer> eliminarDuplicados(LinkedList<Integer> lista) {
        Set<Integer> seen = new HashSet<>();
        Iterator<Integer> iterator = lista.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (!seen.add(num)) {
                iterator.remove();
            }
        }
        return lista;
    }
    
    // Problema 2: Invertir la lista sin usar otra estructura
    public static void invertirLista(LinkedList<String> lista) {
        int size = lista.size();
        for (int i = 0; i < size / 2; i++) {
            String temp = lista.get(i);
            lista.set(i, lista.get(size - 1 - i));
            lista.set(size - 1 - i, temp);
        }
    }
    
    // Problema 3: Intercalar dos listas ordenadas en una nueva lista ordenada
    public static LinkedList<Integer> intercalarListasOrdenadas(LinkedList<Integer> lista1, LinkedList<Integer> lista2) {
        LinkedList<Integer> resultado = new LinkedList<>();
        Iterator<Integer> it1 = lista1.iterator();
        Iterator<Integer> it2 = lista2.iterator();
        Integer val1 = it1.hasNext() ? it1.next() : null;
        Integer val2 = it2.hasNext() ? it2.next() : null;
        
        while (val1 != null || val2 != null) {
            if (val2 == null || (val1 != null && val1 <= val2)) {
                resultado.add(val1);
                val1 = it1.hasNext() ? it1.next() : null;
            } else {
                resultado.add(val2);
                val2 = it2.hasNext() ? it2.next() : null;
            }
        }
        return resultado;
    }
    
    // Tests
    @Test
    void testEliminarDuplicados() {
        LinkedList<Integer> lista = new LinkedList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        LinkedList<Integer> resultado = eliminarDuplicados(lista);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), resultado);
    }
    
    @Test
    void testInvertirLista() {
        LinkedList<String> lista = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
        invertirLista(lista);
        assertEquals(Arrays.asList("D", "C", "B", "A"), lista);
    }
    
    @Test
    void testIntercalarListasOrdenadas() {
        LinkedList<Integer> lista1 = new LinkedList<>(Arrays.asList(1, 3, 5));
        LinkedList<Integer> lista2 = new LinkedList<>(Arrays.asList(2, 4, 6));
        LinkedList<Integer> resultado = intercalarListasOrdenadas(lista1, lista2);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), resultado);
    }
    
    @Test
    void testForzarFallo() {
        LinkedList<Integer> lista = new LinkedList<>(Arrays.asList(1, 1, 2, 3));
        LinkedList<Integer> resultado = eliminarDuplicados(lista);
        assertNotEquals(Arrays.asList(1, 1, 2, 3), resultado); 
    }
}
