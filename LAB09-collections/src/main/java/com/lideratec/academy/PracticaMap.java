package com.lideratec.academy;

import java.util.HashMap;
import java.util.Map;

public class PracticaMap {

    public void mostrarMap(){

        Map<String,String> capitales = new HashMap<>(); // {PE=Lima, CL=Santiago, CO=Bogotá}
        capitales.put("PE", "Lima");
        capitales.put("CO", "Bogotá");
        capitales.put("CL", "Santiago");

        System.out.println(capitales.get("PE")); // Lima
        System.out.println(capitales);
    }
}

// Guardar mis cursos favoritos permitiendo repetidos
// Almacenar códigos únicos de productos

// Caso: Una aplicación académica necesita almacenar códigos únicos de cursos habilitados:
/*
- Elegir la colección adecuada
- Escribir la declaración de la colección
- Agregar a esa colección al menos 4 datos, incluyendo 1 repetido
- Imprimir la colección
- Explicar
 */