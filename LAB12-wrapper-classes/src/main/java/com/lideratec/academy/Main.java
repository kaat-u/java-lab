package com.lideratec.academy;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * Tipo primitos      clase envolventes / wrapper
        * char               Character
        * int                Integer
        * double             Double
        * boolean              Boolean
        * byte                 Byte
        * float                 Float
        * short                 Short
        * long                  Long
        * */

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("P001", "Arroz", "Bolsa de 1kg", 5.60));
        productos.add(new Producto("P002", "Aceite", "Botella de 1LT", 15.60));
        productos.add(new Producto("P003", "Azucar", "Bolsa de 1kg", 3.60));

        for(Producto producto: productos){
            System.out.println(producto);
        }


        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);


        int suma = 0;

        for(Integer nota : numeros){
            suma = Integer.sum(suma, nota);
        }

        double promedio = suma / 4.0;

        System.out.println(promedio);
        /*System.out.println("Lista de numeros:");
        System.out.println(numeros);

        System.out.println("El primer elemento: "+ numeros.get(0));
        System.out.println("El segundo elemento: "+ numeros.get(1));


        int numero1 = 25;
        int numero2 = 40;

        int suma = Integer.max(numero1, numero2);
        System.out.println(suma);
*/

    }
}