/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.test.ClaseArrays;

/**
 *
 * @author Liam Rosario
 */
public class Ejercicio1 {

    public static int riquezaMaxima(int[][] cuentas) {
        int maxRiqueza = 0;

        for (int[] cliente : cuentas) {
            int riquezaCliente = 0;
            for (int banco : cliente) {
                riquezaCliente += banco;
            }
            maxRiqueza = Math.max(maxRiqueza, riquezaCliente);
        }

        return maxRiqueza;
    }

    public static void main(String[] args) {
        int[][] cuentas1 = {{1, 2, 3}, {3, 2, 1}};
        int[][] cuentas2 = {{1, 5}, {7, 3}, {3, 5}};
        int[][] cuentas3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};

        System.out.println("Riqueza máxima del cliente más rico:");
        System.out.println(riquezaMaxima(cuentas1)); 
        System.out.println(riquezaMaxima(cuentas2)); 
        System.out.println(riquezaMaxima(cuentas3)); 
    }
}
