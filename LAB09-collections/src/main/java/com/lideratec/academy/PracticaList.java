package com.lideratec.academy;

import java.util.ArrayList;
import java.util.List;

public class PracticaList {
    public void mostrarLista() {

        List<String> lenguajes = new ArrayList<>();

        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("C#");
        lenguajes.add("Java");
        System.out.println(lenguajes);

        lenguajes.remove("C#");
        System.out.println(lenguajes); // [Java, Python, Java]

        System.out.println(lenguajes.size()); // 3

        System.out.println(lenguajes.get(0)); // Java

    }
}
