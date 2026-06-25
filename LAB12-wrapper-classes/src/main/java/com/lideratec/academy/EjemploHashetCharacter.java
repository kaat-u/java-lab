package com.lideratec.academy;

import java.util.HashSet;

public class EjemploHashetCharacter {

    public static void main(String[] args){
        HashSet<Character> simbolos = new HashSet<>();

        simbolos.add('A');
        simbolos.add('b');
        simbolos.add('7');
        simbolos.add(' ');

        for (Character simbolo : simbolos){
            System.out.println("Caracteres almacenados: [" + simbolo + "]");
        }
    }
}
