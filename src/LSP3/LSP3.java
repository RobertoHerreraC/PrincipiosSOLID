package LSP3;

public class LSP3 {
    static void main() {
        NotificacionService notificacionService = new NotificacionService();
        Notificacion email = new EmailNotificacion("Se envia por email");
        Notificacion sms = new SmsNotificacion("Se envia por sms");
        notificacionService.enviarNotificacion(email);
        notificacionService.enviarNotificacion(sms);

    }
}
