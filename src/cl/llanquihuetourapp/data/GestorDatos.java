package cl.llanquihuetourapp.data;

import cl.llanquihuetourapp.model.Guia;
import cl.llanquihuetourapp.model.Tour;
import cl.llanquihuetourapp.model.Transporte;

import javax.swing.table.TableRowSorter;
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

                if (linea.isBlank()) {
                    continue;
                }

                String[] campos = linea.split(";", -1);

                if (campos.length != 11) {
                    System.err.println("Se omite linea" + numeroLinea + ": esperabamos 11 campos");
                    continue;
                }

                try {
                    //Datos del tour
                    String nombre = campos[0].trim();
                    String tipo = campos[1].trim();
                    Double precio = Double.parseDouble(campos[2].trim());
                    int horas = Integer.parseInt(campos[3].trim());
                    int cupos = Integer.parseInt(campos[4].trim());

                    //Datos del guia
                    Guia guia = new Guia(campos[5].trim(), Integer.parseInt(campos[6].trim()), campos[7].trim());

                    //Datos del transporte
                    Transporte transporte = new Transporte(campos[8].trim(), campos[9].trim(), Integer.parseInt(campos[10]));

                    Tour tour = new Tour(nombre, tipo, precio, horas, cupos, guia, transporte);

                    listaTours.add(tour);

                } catch (NumberFormatException e) {
                    System.err.println("Se omite linea" + numeroLinea + ": hay un numero que no es valido");
                } catch (IllegalArgumentException e) {
                    System.err.println("Se omite linea" + numeroLinea + e.getMessage());

                }
            }

        }
        return listaTours;
    }
}
