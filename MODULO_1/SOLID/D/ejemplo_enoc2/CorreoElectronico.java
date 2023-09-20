public class CorreoElectronico implements INotificacion{
    public void enviar(String mensaje) {
        System.out.println("Enviando correo electronico: " + mensaje);
    }
}
