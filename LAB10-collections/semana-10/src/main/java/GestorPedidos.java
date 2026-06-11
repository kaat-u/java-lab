import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GestorPedidos {

    private ArrayList<String> pedidos;

    public GestorPedidos(){
        pedidos = new ArrayList<>();
    }

    public void agregarPedido(String pedido){
        pedidos.add(pedido);
    }

    public void mostrarPedidos(){
        System.out.println(pedidos);
    }

    public void insertarPedido(int indice, String pedido){
        pedidos.add(indice, pedido);
    }

    public String obtenerPedido (int indice){
        return pedidos.get(indice);
    }

    public void actualizarPedido(int indice, String nuevoPedido){
        pedidos.set(indice, nuevoPedido);
    }

    public void eliminarPorIndice(int indice){
        pedidos.remove(indice);
    }

    public boolean eliminarPorValor(String pedido){
        return pedidos.remove(pedido);
    }

    public boolean contienePedido(String pedido){
        return pedidos.contains(pedido);
    }

    public int primeraPosicion(String pedido){
        return pedido.indexOf(pedido);
    }

    public int ultimaPosicion(String pedido){
        return pedidos.lastIndexOf(pedido);
    }

    public int cantidadPedidos(){
        return pedidos.size();
    }

    public boolean estaVacia(){
        return pedidos.isEmpty();
    }

    public void limpiarPedidos(){
        pedidos.clear();
    }

    public void ordenarPedidos(){
        Collections.sort(pedidos);
    }

    public void mezclarPediods(){
        Collections.shuffle(pedidos);
    }

    public void invertirPedidos(){
        Collections.reverse(pedidos);
    }

    public int buscarPedidoOrdenado(String pedido){
        Collections.sort(pedidos);
        return Collections.binarySearch(pedidos, pedido);
    }

    public String pedidoMaximo(){
        return Collections.max(pedidos);
    }

    public String pedidoMinimo(){
        return Collections.min(pedidos);
    }

    public int contarPedido(String pedido){
        return Collections.frequency(pedidos, pedido);
    }

    public void reemplazarPedido(String actual, String nuevo){
        Collections.replaceAll(pedidos, actual, nuevo);
    }

    public void rellenarPedidos(String valor){
        Collections.fill(pedidos, valor);
    }

    public ArrayList<String> copiarPedidos(){
        ArrayList<String> destino = new ArrayList<>();
        for(int i=0; i<pedidos.size(); i++){
            destino.add("");
        }
        Collections.copy(destino, pedidos);
        return destino;
    }
}


