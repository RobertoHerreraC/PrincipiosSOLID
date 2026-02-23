package SRP1;

public class CalculadoraPedido {
    public double calcularTotal(Pedido pedido){
        double total = 0;
        for (Item item : pedido.getItems()){
            total += item.getPrecio() * item.getCantidad();
        }

        return total;
    }
}
