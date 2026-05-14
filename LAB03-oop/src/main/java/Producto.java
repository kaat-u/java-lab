public class Producto {

    String nombre;
    Double precio;

    Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    void mostrarMensaje(){
        System.out.println(this.nombre);
    }

    static void mensaje(){
        System.out.println("Hola profesor querido");
    }

    double obtenerPrecio(){
        return this.precio;
    }

}
