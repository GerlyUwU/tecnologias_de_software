public class Boton {
    private Lampara lampara;

    public Boton(Lampara lampara) {
        this.lampara = lampara;
    }

    public void apretar(boolean ocho) {
        if (ocho) {
            lampara.encender();
        } else {
            lampara.apagar();
        }
    }

}
