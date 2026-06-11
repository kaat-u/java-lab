import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {
        System.out.println("Entorno de java listo: ");

        GestorPedidos gestor = new GestorPedidos();
        gestor.agregarPedido("Pedido A");
        gestor.agregarPedido("Pedido B");
        gestor.agregarPedido("Pedido C");

        gestor.insertarPedido(1, "Pedido Urgente");
        gestor.mostrarPedidos();
        gestor.actualizarPedido(1, "Pedido del profesor");
        System.out.println(gestor.obtenerPedido(1));

        gestor.eliminarPorIndice(0);
        gestor.mostrarPedidos();

        gestor.eliminarPorValor("Pedido B");
        gestor.mostrarPedidos();

        System.out.println(gestor.primeraPosicion("Pedido 1"));

        System.out.println("Cantidad: " + gestor.cantidadPedidos());
        System.out.println("Esta vacía: " + gestor.estaVacia());

        // gestor.limpiarPedidos();

        // System.out.println("Cantidad después de limpiar es: " + gestor.cantidadPedidos());
        // System.out.println("Esta vacía después de limpiar: " + gestor.estaVacia());

        gestor.ordenarPedidos();
        gestor.mostrarPedidos();

        gestor.invertirPedidos();
        gestor.mostrarPedidos();

        gestor.mezclarPediods();
        gestor.mostrarPedidos();

        System.out.println("Posición buscada: " + gestor.buscarPedidoOrdenado("Pedido B"));
        System.out.println("Máximo es: " + gestor.pedidoMaximo());
        System.out.println("Mínimo es: " + gestor.pedidoMinimo());


        System.out.println("Veces que se repite el pedido B: " + gestor.contienePedido("Pedido B"));
        gestor.reemplazarPedido("Pedido B", "Pedido B - Revisando");

        ArrayList<String> copiar = gestor.copiarPedidos();
        System.out.println("Copia: " + copiar);

        gestor.rellenarPedidos("Pedido 1");
        gestor.mostrarPedidos();
    }
}
