/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package umg.edu.gt.test.EjercicioTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

public class EjercicioTreeSetAndMapEjercicio3Test {

    @BeforeEach
    public void limpiar() {
        EjercicioTreeSetAndMap.resetEventos();
    }

    @Test
    public void testAgregarYListarEventos() {
        var evento1 = new EjercicioTreeSetAndMap.Evento(LocalDateTime.of(2025, 4, 15, 14, 0), "Taller ML", "Sala 3");
        var evento2 = new EjercicioTreeSetAndMap.Evento(LocalDateTime.of(2025, 5, 10, 10, 0), "Conferencia Java", "Auditorio A");

        EjercicioTreeSetAndMap.agregarEvento(evento1);
        EjercicioTreeSetAndMap.agregarEvento(evento2);

        TreeSet<EjercicioTreeSetAndMap.Evento> eventos = EjercicioTreeSetAndMap.obtenerEventos();

        assertEquals(2, eventos.size());
        assertEquals("Taller ML", eventos.first().getNombre());
    }

    @Test
    public void testProximoEvento() {
        var evento = new EjercicioTreeSetAndMap.Evento(LocalDateTime.now().plusDays(1), "Reunión", "Sala B");
        EjercicioTreeSetAndMap.agregarEvento(evento);

        var proximo = EjercicioTreeSetAndMap.obtenerProximoEvento();
        assertNotNull(proximo);
        assertEquals("Reunión", proximo.getNombre());
    }

    @Test
    public void testEventoPasadoEliminado() {
        var pasado = new EjercicioTreeSetAndMap.Evento(LocalDateTime.now().minusDays(1), "Evento pasado", "Zona 1");
        EjercicioTreeSetAndMap.agregarEvento(pasado);

        TreeSet<EjercicioTreeSetAndMap.Evento> eventos = EjercicioTreeSetAndMap.obtenerEventos();
        assertTrue(eventos.isEmpty());
    }

    @Test
    public void testFalloIntencionalNombreEvento() {
        var evento = new EjercicioTreeSetAndMap.Evento(LocalDateTime.now().plusDays(2), "Hackathon", "LAB 5");
        EjercicioTreeSetAndMap.agregarEvento(evento);

        var proximo = EjercicioTreeSetAndMap.obtenerProximoEvento();
        assertEquals("Charla AI", proximo.getNombre()); 
    }
}

