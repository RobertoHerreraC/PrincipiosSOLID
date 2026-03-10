package DIP1;

public class SmsNotification implements NotificationService {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}
