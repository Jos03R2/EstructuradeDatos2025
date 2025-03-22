/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;

import java.util.LinkedList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> lista1 = new LinkedList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        System.out.println("Lista original: " + lista1);
        System.out.println("Lista sin duplicados: " + EjercicioLinkedList.eliminarDuplicados(lista1));

        LinkedList<String> lista2 = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println("Lista original: " + lista2);
        EjercicioLinkedList.invertirLista(lista2);
        System.out.println("Lista invertida: " + lista2);

        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(1, 3, 5));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(2, 4, 6));
        System.out.println("Listas intercaladas: " + EjercicioLinkedList.intercalarListasOrdenadas(l1, l2));
    }
}
