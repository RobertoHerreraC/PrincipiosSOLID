package DIP1;

public class EmailNotification implements NotificationService {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando email..."+ mensaje);
    }
}
