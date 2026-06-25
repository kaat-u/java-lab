package com.lideratec.academy;


import java.util.ArrayList;

public class EjemploArrayListInteger {


    public static void main(String[] args){
        ArrayList<Integer> notas = new ArrayList<>();

        notas.add(14);
        notas.add(18);
        notas.add(16);


        for (Integer nota: notas){
            if(nota >=15){
                System.out.println("Nota aprobatoria" + nota);
            }
        }
    }
}
