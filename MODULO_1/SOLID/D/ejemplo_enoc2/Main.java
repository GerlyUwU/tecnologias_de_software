public class Main {
    public static void main(String[] args) {
        INotificacion correo = new CorreoElectronico();
        INotificacion mensajeTxt = new MensajeTxt();


        Notificador notificadorCorreo = new Notificador(correo);
        Notificador notificadorMensajeTxt = new Notificador(mensajeTxt);

        notificadorCorreo.enviarNotificacion("Mensaje de prueba por ccrreo.");
        notificadorMensajeTxt.enviarNotificacion("Mensaje de prueba por msj de txt.");
    }
}