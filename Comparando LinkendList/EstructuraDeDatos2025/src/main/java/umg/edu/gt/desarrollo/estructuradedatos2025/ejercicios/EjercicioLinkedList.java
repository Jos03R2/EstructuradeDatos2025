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
    
    
}
