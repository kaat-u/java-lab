package com.lideratec.academy;

public class Producto {

    String codigo;
    String nombre;
    double precio;
    int stock;

    Producto(String codigo, String nombre, double precio, int stock){

        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }


    public void mostrarInformacion(){
        System.out.println("Codigo " + codigo);
        System.out.println("Nombre " + nombre);
        System.out.println("Precio " + precio);
        System.out.println("Stock " + stock);
    }

    public boolean hayStock(int cantidad){
        return stock>=cantidad;
    }

    public double calcularPrecioConDescuento(double porcentajeDescuento){
        double descuento = precio * porcentajeDescuento/100;
        double precioFinal = precio - descuento;
        return Math.round(precioFinal*100.0)/100.0;
    }

    public boolean nombreValido(){
        return nombre != null && !nombre.trim().isEmpty();
    }

    public boolean vender(int cantidad){
        if(cantidad > 0 && stock >= cantidad){
            stock = stock - cantidad;
            return true;
        }else{
            return false;
        }
    }

    public void reponerStock(int cantidad){
        if(cantidad > 0){
            stock = stock +cantidad;
        }else{
            System.out.println("La cantidad a reponer debe ser nayor a cero");
        }
    }

    public String clasificarStock(){
        if(stock <=3){
            return "Stock bajo";
        }else if(stock <=10){
            return "Stock medio";
        }else{
            return "Stock alto";
        }
    }
}
