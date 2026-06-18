package com.lideratec.academy;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>();

        Estudiante e1 = new Estudiante(1,"Pedro",20);
        Estudiante e2 = new Estudiante(2,"Rosa",18);
        Estudiante e3 = new Estudiante(3,"Antonio",25);

        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);
        System.out.println("Cantidad de estudiantes: " + estudiantes.size());

        for (Estudiante est: estudiantes){
            System.out.println(est);
        }

        Iterator<Estudiante> it = estudiantes.iterator();;

        while(it.hasNext()){
            Estudiante actual = it.next();
            System.out.println(actual);
        }

        String estudianteBuscar = "Rosa";

        for(Estudiante est : estudiantes){
            if(est.getNombre().equals(estudianteBuscar)){
                System.out.println("Estudiante encontrad " + est);
                break;
            }
        }

        estudiantes.removeIf(est -> est.getNombre().equals("Antonio"));
        System.out.println("Colección después de eliminar");

        System.out.println("Colección después de eliminar");
        for (Estudiante est : estudiantes){
            System.out.println(est);
        }

        Set<Producto> productos = new HashSet<>();

        productos.add(new Producto("Televisor", 1800));
        productos.add(new Producto("Impresora", 800));
        productos.add(new Producto("Computadora", 1900));
        productos.add(new Producto("Laptop", 9000));

        System.out.println("Cantidad de productos: " + productos.size());

        for (Producto p: productos){
            System.out.println(p);
        }


    }
}
