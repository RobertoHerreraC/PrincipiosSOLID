package DIP1;

import SRP1.EmailService;

public class DIP1 {
    static void main() {
        NotificationService email = new EmailNotification();
        OrderService order = new OrderService(email);
        order.crearPedido();
    }
}
