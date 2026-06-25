package com.lideratec.academy;

public class MetodosInteger {

    public static void main(String[] args) {
        int a = 12;
        int b = 20;
        String texto = "35";


        int mayor = Integer.max(a, b);
        int menor = Integer.min(a, b);
        int suma = Integer.sum(a, b);

        int convertido = Integer.parseInt(texto);
        String comoTexto = Integer.toString(a);
        Integer objeto = Integer.valueOf(b);

        System.out.println("El mayor es " + mayor);
        System.out.println("El menor es " + menor);
        System.out.println("La suma es " + suma);
        System.out.println("Texto convertido a int es "+ convertido);
        System.out.println("Entero convertido a string es " + comoTexto);
        System.out.println("Obejeto integer: " + objeto);


    }
}
