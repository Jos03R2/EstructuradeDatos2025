package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;

public class EjercicioTreeSetAndMap {

    //* EJERCICIO 1: Análisis de Frecuencia de Palabras (TreeMap)
    public static TreeMap<String, Integer> contarFrecuenciaPalabras(String pathArchivo) {
        TreeMap<String, Integer> frecuenciaPalabras = new TreeMap<>();

        try {
            String contenido = Files.readString(Paths.get(pathArchivo));
            contenido = contenido.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]", "").toLowerCase(); // limpia puntuación

            String[] palabras = contenido.split("\\s+");

            for (String palabra : palabras) {
                if (palabra.isBlank()) continue;
                frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
            }

        } catch (IOException e) {
            System.out.println("Error leyendo el archivo: " + e.getMessage());
        }

        return frecuenciaPalabras;
    }

    //* EJERCICIO 2: Rastreador de Versiones de Código (TreeMap)
    private static TreeMap<Integer, String> versionesCodigo = new TreeMap<>();
    private static int ultimaVersion = 0;

    public static int agregarVersion(String contenido) {
        ultimaVersion++;
        versionesCodigo.put(ultimaVersion, contenido);
        return ultimaVersion;
    }

    public static String obtenerVersion(int version) {
        return versionesCodigo.get(version);
    }

    public static String obtenerUltimaVersion() {
        return versionesCodigo.get(ultimaVersion);
    }

    public static boolean eliminarVersion(int version) {
        return versionesCodigo.remove(version) != null;
    }

    public static void resetVersiones() {
        versionesCodigo.clear();
        ultimaVersion = 0;
    }

   //** EJERCICIO 3: Sistema de Gestión de Eventos (TreeSet)
    private static TreeSet<Evento> eventos = new TreeSet<>();

    public static void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public static TreeSet<Evento> obtenerEventos() {
        eliminarEventosPasados();
        return new TreeSet<>(eventos); // copia segura
    }

    public static Evento obtenerProximoEvento() {
        eliminarEventosPasados();
        return eventos.isEmpty() ? null : eventos.first();
    }

    private static void eliminarEventosPasados() {
        LocalDateTime ahora = LocalDateTime.now();
        eventos.removeIf(e -> e.getFecha().isBefore(ahora));
    }

    public static void resetEventos() {
        eventos.clear();
    }

  
    public static class Evento implements Comparable<Evento> {
        private LocalDateTime fecha;
        private String nombre;
        private String ubicacion;

        public Evento(LocalDateTime fecha, String nombre, String ubicacion) {
            this.fecha = fecha;
            this.nombre = nombre;
            this.ubicacion = ubicacion;
        }

        public LocalDateTime getFecha() {
            return fecha;
        }

        public String getNombre() {
            return nombre;
        }

        public String getUbicacion() {
            return ubicacion;
        }

        @Override
        public int compareTo(Evento otro) {
            return this.fecha.compareTo(otro.fecha);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Evento)) return false;
            Evento evento = (Evento) o;
            return Objects.equals(fecha, evento.fecha) &&
                   Objects.equals(nombre, evento.nombre) &&
                   Objects.equals(ubicacion, evento.ubicacion);
        }

        @Override
        public int hashCode() {
            return Objects.hash(fecha, nombre, ubicacion);
        }

        @Override
        public String toString() {
            return "\"" + nombre + "\", " + fecha + ", " + ubicacion;
        }
    }
}


