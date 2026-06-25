package com.lideratec.academy;

public class MetodosCharacter {

    public static void main(String[] args){
        char c1 = 'A';
        char c2 = 'b';
        char c3 = '7';
        char c4 = ' ';

        System.out.println("c1 es una letra " +  Character.isLetter(c1));
        System.out.println("c3 es un digito " +  Character.isDigit(c3));
        System.out.println("c4 es espacio " + Character.isWhitespace(c4));
        System.out.println("C2 en mayuscula " +  Character.toUpperCase(c2));
        System.out.println("c1 en minuscula " +  Character.toLowerCase(c1));

        System.out.println("c2 es minuscula " +  Character.isLowerCase(c2));


    }
}
