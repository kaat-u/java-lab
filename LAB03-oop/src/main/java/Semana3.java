public class Semana3 {
    public static void main(String[] args) {

        Producto prod = new Producto("Lavadora", 500);
        prod.mostrarMensaje();

        Producto.mensaje();

        double v = prod.obtenerPrecio();
        double total = 0;

        total = v * 20;

        System.out.println(total);
    }
}
