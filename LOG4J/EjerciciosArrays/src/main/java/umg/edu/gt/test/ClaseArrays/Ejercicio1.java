package umg.edu.gt.test.ClaseArrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejercicio1 {
    private static final Logger logger = LogManager.getLogger(Ejercicio1.class);

    public static int riquezaMaxima(int[][] cuentas) {
        int maxRiqueza = 0;

        for (int[] cliente : cuentas) {
            int riquezaCliente = 0;
            for (int banco : cliente) {
                riquezaCliente += banco;
            }
            maxRiqueza = Math.max(maxRiqueza, riquezaCliente);
        }

        logger.info("Riqueza máxima calculada: {}", maxRiqueza);
        return maxRiqueza;
    }

    public static void main(String[] args) {
        logger.info("Ejecutando Ejercicio1...");

        int[][] cuentas1 = {{1, 2, 3}, {3, 2, 1}};
        int[][] cuentas2 = {{1, 5}, {7, 3}, {3, 5}};
        int[][] cuentas3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};

        logger.info("Riqueza máxima del cliente más rico:");
        logger.info("Caso 1: {}", riquezaMaxima(cuentas1)); // 6
        logger.info("Caso 2: {}", riquezaMaxima(cuentas2)); // 10
        logger.info("Caso 3: {}", riquezaMaxima(cuentas3)); // 17
    }
}
