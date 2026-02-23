package SRP1;

public class PedidoValidator {

    public void validar(Pedido pedido) {
        if(pedido.getItems().isEmpty()){
            throw new RuntimeException("El pedido debe tener pedidos");
        }
    }
}
