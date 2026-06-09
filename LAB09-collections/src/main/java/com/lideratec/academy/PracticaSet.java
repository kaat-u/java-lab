package com.lideratec.academy;

import java.util.HashSet;
import java.util.Set;

public class PracticaSet  {

    public void mostrarSet(){

        Set<String> codigos = new HashSet<>();

        codigos.add("P001");
        codigos.add("P002");
        codigos.add("P001");

        System.out.println(codigos); // [P001, P002]
        System.out.println(codigos.size()); // 2
    }

}
