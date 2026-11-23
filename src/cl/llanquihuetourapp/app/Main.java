package cl.llanquihuetourapp.app;

import cl.llanquihuetourapp.data.GestorDatos;
import cl.llanquihuetourapp.model.Tour;
import cl.llanquihuetourapp.service.GestorColecciones;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Path ruta = Path.of("src/resources/tours.txt");
        GestorDatos gestor = new GestorDatos();

        try {
            ArrayList<Tour> listaDeTours = gestor.cargarTours(ruta);
            System.out.println("----- CATALOGO DE TOURS -----");
            System.out.println("TOURS CARGADOS: " + listaDeTours.size());

            System.out.println("\n---Todos los Tours---");
            for (Tour tour : listaDeTours) {
                System.out.println(tour);
            }

            //Colecciones
            GestorColecciones gestorColecciones = new GestorColecciones();

            //Stack
            System.out.println("\n ===== HISTORIAL (STACK) =====");
            gestorColecciones.historialTours(listaDeTours);

            //HashMap
            System.out.println("\n ===== BUSCAR POR NOMBRE (HASHMAP) =====");
            gestorColecciones.buscarTour(listaDeTours);

            System.out.println("\n--- TOURS CON PRECIO MAYOR A 25000 ---");

            Boolean hayPreciosAltos = false;

            for (Tour tour : listaDeTours){
                if (tour.getPrecio() > 25000){
                    System.out.println(tour);
                    hayPreciosAltos = true;
                }
            }

            if (!hayPreciosAltos){
                System.out.println("No se encontraron precios altos");
            }
        }catch (IOException e) {
            System.err.println("No se pudo leer el archivo" + ruta.toAbsolutePath());
            System.err.println("Detalle: " + e.getMessage());
        }

    }
}