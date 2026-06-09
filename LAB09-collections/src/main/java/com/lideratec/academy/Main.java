package com.lideratec.academy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Lenguajes de programación
            Java, Python, C#, .net
            Usar Colección
         */
        PracticaList miPrimeraLista = new PracticaList();
        miPrimeraLista.mostrarLista();

        PracticaSet miPrimerSet = new PracticaSet();
        miPrimerSet.mostrarSet();

        PracticaMap miPrimerMap = new PracticaMap();
        miPrimerMap.mostrarMap();

        Academia academia = new Academia();
        academia.almacenarCodigo();

    }
}
