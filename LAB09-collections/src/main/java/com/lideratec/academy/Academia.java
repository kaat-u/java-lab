package com.lideratec.academy;

import java.util.HashSet;
import java.util.Set;

public class Academia {

    public void almacenarCodigo() {

        Set<String> academia = new HashSet<>(); // [P30, P40, P10, P20]
        academia.add("P10");
        academia.add("P20");
        academia.add("P30");
        academia.add("P40");
        academia.add("P30");

        System.out.println(academia);
    }
}
