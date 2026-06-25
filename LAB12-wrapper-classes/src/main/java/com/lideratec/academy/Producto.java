package com.lideratec.academy;

public class Producto {

    String codigo;
    String descripcion;
    String presentacion;
    double precio;

    public Producto(String codigo, String descripcion, String presentacion, double precio){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.presentacion = presentacion;
        this.precio = precio;
    }

    @Override
    public String toString(){
        return codigo + " - " + descripcion + " - "  + presentacion + " - s/." + precio;
    }
}
