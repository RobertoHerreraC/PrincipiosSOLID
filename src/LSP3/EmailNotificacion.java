package LSP3;

public class EmailNotificacion extends Notificacion {

    public EmailNotificacion(String mensaje) {
        super(mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Email: "+ mensaje);
    }
}
