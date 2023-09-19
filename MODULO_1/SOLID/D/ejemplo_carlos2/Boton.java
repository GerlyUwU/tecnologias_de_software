public class Boton {
    
    private Interruptor interruptor;

    public Boton(Interruptor interruptor) {
        this.interruptor=interruptor;
    }

    public void estado(boolean isEncendido) {
        if (isEncendido) {
            interruptor.encender();
        } else {
            interruptor.apagar();
        }
    }

}
