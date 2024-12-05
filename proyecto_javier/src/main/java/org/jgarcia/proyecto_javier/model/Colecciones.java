package org.jgarcia.proyecto_javier.model;

import java.util.Map;

public class Colecciones {

    public static final Map<String, String> listaGeneros = Map.of(
            "F", "Femenino",
            "M", "Masculino",
            "O", "Otro"
    );

    public static final Map<String, Pais> listaPaises = Map.of(
            "es", new Pais("España", "Castellano", "34", true, "espania.jpg"),
            "fr", new Pais("Francia", "Francés", "33", false, "francia.jpg"),
            "it", new Pais("Italia", "Italiano", "39", false, "italia.jpg"),
            "pt", new Pais("Portugal", "Portugués", "351", false, "portugal.jpg"),
            "en", new Pais("Reino Unido", "Inglés", "44", true, "reino_unido.jpg")
    );

    public static final Map<String, String> listaMusicas = Map.of(
            "E", "Electrónica",
            "F", "Funky",
            "N", "New age",
            "P", "Pop",
            "R", "Rock"
    );

    public static final Map<String, String> listaAficiones = Map.of(
            "D", "Deporte",
            "L", "Lectura",
            "P", "Pintura",
            "V", "Viajes"
    );

    public static Map<String, String> getListaGeneros() {
        return listaGeneros;
    }

    public static Map<String, Pais> getListaPaises() {
        return listaPaises;
    }

    public static Map<String, String> getListaMusicas() {
        return listaMusicas;
    }

    public static Map<String, String> getListaAficiones() {
        return listaAficiones;
    }
}
