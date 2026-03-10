package DIP1;



public class OrderService {
    private NotificationService notificacion;

    public OrderService(NotificationService notificacionService) {
        this.notificacion = notificacionService;
    }

    public void crearPedido(){
        System.out.println("Creando Pedido");
        notificacion.enviar("Tu pedido fue creado");
    }
}
