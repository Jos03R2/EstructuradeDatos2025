README explicando comparacion de LinkendList

//Clase Linkendlist

-----------Método eliminarDuplicados-------
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

//**va a usar un HashSet llamado seen para almacenar 
los numeros unicos encontrados.
usa un Iterator<Integer> para recorrer la lista.
Si el número ya estaba en seen, lo elimina de la
lista usando iterator.remove().
Retorna la lista sin duplicados.


------------Método invertirLista-----------
public static void invertirLista(LinkedList<String> lista) {
    int size = lista.size();
    for (int i = 0; i < size / 2; i++) {
        String temp = lista.get(i);
        lista.set(i, lista.get(size - 1 - i));
        lista.set(size - 1 - i, temp);
    }
}
//** Invierte la lista sin usar estructuras adicionales.
Itera solo hasta la mitad de la lista, intercambiando 
elementos simétricos.

-----------Método intercalarListasOrdenadas----------
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
//**lo que va a hacer es intercala dos listas ordenadas en 
una nueva lista también ordenada.

Usa iteradores para recorrer ambas listas al mismo tiempo.
y va a comparar los elementos actuales y agrega el menor a
 la lista resultado.

------------------Pruebas Unitarias---------------------

//testEliminarDuplicados
@Test
void testEliminarDuplicados() {
    LinkedList<Integer> lista = new LinkedList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
    LinkedList<Integer> resultado = eliminarDuplicados(lista);
    assertEquals(Arrays.asList(1, 2, 3, 4, 5), resultado);
}
//**Verificara que eliminarduplicados elimina correctamente los valores repetidos.


//testInvertirLista
@Test
void testInvertirLista() {
    LinkedList<String> lista = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
    invertirLista(lista);
    assertEquals(Arrays.asList("D", "C", "B", "A"), lista);
}
//**este va a confirmar que invertirlista invierte correctamente los elementos.


//testIntercalarListasOrdenadas
@Test
void testIntercalarListasOrdenadas() {
    LinkedList<Integer> lista1 = new LinkedList<>(Arrays.asList(1, 3, 5));
    LinkedList<Integer> lista2 = new LinkedList<>(Arrays.asList(2, 4, 6));
    LinkedList<Integer> resultado = intercalarListasOrdenadas(lista1, lista2);
    assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), resultado);
}
//** va a comprobar que intercalarListasOrdenadas devuelva la lista correctamente ordenada

//test que falla
@Test
void testForzarFallo() {
    LinkedList<Integer> lista = new LinkedList<>(Arrays.asList(1, 1, 2, 3));
    LinkedList<Integer> resultado = eliminarDuplicados(lista);
    assertNotEquals(Arrays.asList(1, 1, 2, 3), resultado); 
}
//**este va a asegurarse que elimine los duplicados


Al darle test file saldra:
Lista original: [1, 2, 2, 3, 4, 4, 5]
Lista sin duplicados: [1, 2, 3, 4, 5]
Lista original: [A, B, C, D]
Lista invertida: [D, C, B, A]
Intercalación de listas ordenadas: [1, 2, 3, 4, 5, 6]
