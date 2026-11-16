package cl.llanquihuetourapp.data;

import cl.llanquihuetourapp.model.Tour;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList <Tour> cargarTours (Path rutaArchivo) throws IOException {

        ArrayList <Tour> listaTours = new ArrayList<>();

        try (BufferedReader lector = Files.newBufferedReader(rutaArchivo, StandardCharsets.UTF_8)){

            String linea;
            int numeroLinea = 0;

            while ((linea = lector.readLine()) != null) {
                numeroLinea++;

                if (linea.isBlank()){
                    continue;
                }

                String[] campos = linea.split(";", -1);

                if (campos.length != 5) {
                    System.err.println("Se omite linea" + numeroLinea + ": esperabamos 5 campos");
                    continue;
                }

                try {
                    String nombre = campos[0].trim();
                    String tipo = campos[1].trim();
                    Double precio = Double.parseDouble(campos[2].trim());
                    int horas = Integer.parseInt(campos[3].trim());
                    int cupos = Integer.parseInt(campos[4].trim());

                    Tour tour = new Tour(nombre, tipo, precio, horas, cupos);

                    listaTours.add(tour);

                }catch (IllegalArgumentException e) {
                    System.err.println("Se omite linea" + numeroLinea + e.getMessage());
                }

            }

        }
        return listaTours;

    }

}
