package cl.llanquihuetourapp.service;

import cl.llanquihuetourapp.model.Tour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class GestorColecciones {

    public void historialTours(ArrayList<Tour> listaTours) {

        Stack <String> historial = new Stack<>();

       for (Tour tour : listaTours){
           historial.push(tour.getNombre());
       }

        System.out.println("\n Historial: " + historial);

        System.out.println("\n Ultimo tour consultado: " + historial.peek());

        System.out.println("\n Se elimino del historial: " + historial.pop());

        System.out.println("\n El historial esta vacio? " + historial.isEmpty());

        System.out.println("\n Historial Actualizado: " + historial);
    }

    public void buscarTour (ArrayList<Tour> listaTours) {

        HashMap <String, Tour> buscar = new HashMap<>();

        //Recorrer el ArrayList
        for (Tour tour : listaTours) {
            buscar.put(tour.getNombre(), tour);
        }

        //buscar por el nombre

        String nombreBuscado = "Paseo Lago Llanquihue";

        if (buscar.containsKey(nombreBuscado)){
            Tour encontrado = buscar.get(nombreBuscado);
            System.out.println("\n Tour encontrado: " + encontrado);

        } else {
            System.out.println("\n No se encontro el tour: " + nombreBuscado);
        }

        //Recorrer mapa
        System.out.println("\n - - - TOURS EN EL MAPA - - -");
        for (String nombre : buscar.keySet()) {
            System.out.println(nombre + " -> " + buscar.get(nombre));
        }

    }

}
