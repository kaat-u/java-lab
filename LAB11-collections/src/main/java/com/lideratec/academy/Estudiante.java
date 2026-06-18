package com.lideratec.academy;

public class Estudiante {

    private int codigo;
    private String nombre;
    private int edad;

    public Estudiante(int codigo, String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.codigo = codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public int getCodigo(){
        return codigo;
    }

    @Override
    public String toString(){
        return "Codigo: " + codigo + "- Nombre: " + nombre + "- Edad: " + edad;
    }
}
