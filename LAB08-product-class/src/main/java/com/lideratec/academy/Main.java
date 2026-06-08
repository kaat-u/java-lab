package com.lideratec.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("P001","Teclado",100.60, 10);
       /* Scanner sc = new Scanner(System.in);
        System.out.println("=== MENU ===");
        System.out.println("1. Mostrar producto");
        System.out.println("2. Validar stock");
        System.out.println("3. Obtener descuento");
        System.out.println("4. Validar nombre");
        System.out.println("Selecciona alguna opción:");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                p1.mostrarInformacion();
                break;
            case 2:
                System.out.println("Ingresa la cantidad solicitada del producto");
                int cantidad = sc.nextInt();
                if(p1.hayStock(cantidad)){
                    System.out.println("Si hay stock");
                }else{
                    System.out.println("No hay stock");
                }
                break;
            case 3:
                System.out.println("Precio final con el 10% es: " +  p1.calcularPrecioConDescuento(10));
                break;
            case 4:
                if(p1.nombreValido()){
                    System.out.println("El nombre del producto es valido");
                }else{
                    System.out.println("El nombre del producto es invalido");
                }
                break;
            default:
                System.out.println("Opcion invalidad");
        }*/


        boolean ventaRealizada = p1.vender(3);

        if(ventaRealizada){
            System.out.println("Venta realizada correctamente ");
        }else{
            System.out.println("No se pudo realizar la ventar");
        }
        p1.mostrarInformacion();


        p1.reponerStock(20);
        p1.mostrarInformacion();


        System.out.println("Clasificacion de stock: " + p1.clasificarStock());


    }
}