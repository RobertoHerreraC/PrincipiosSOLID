package LSP3;

import LSP2.Vehiculo;

public class SmsNotificacion extends Notificacion{
    public SmsNotificacion(String mensaje){
        super(mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS: "+ mensaje);
    }


}
