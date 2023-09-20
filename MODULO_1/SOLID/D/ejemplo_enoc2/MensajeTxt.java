public class MensajeTxt implements INotificacion{
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje de texto: " + mensaje);
    }
}