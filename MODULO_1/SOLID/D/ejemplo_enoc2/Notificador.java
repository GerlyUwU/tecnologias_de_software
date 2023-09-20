public class Notificador {
    private  INotificacion notificacion;

    public Notificador(INotificacion notificacion) {
        this.notificacion = notificacion;
    }

    public void enviarNotificacion(String mensaje){
        notificacion.enviar(mensaje);
    }
}
