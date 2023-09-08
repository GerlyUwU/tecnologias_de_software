public class Main {
    public static void main(String[] args) {
        // Crear un jugador con una pistola.
        Jugador jugador01 = new Jugador(new Pistola());

        // El jugador dispara con la pistola.
        jugador01.disparo ();

        // Cambiar el arma del jugador a un rifle sin modificar la clase Player.
        jugador01 = new Jugador(new Rifle());

        // El jugador dispara con el rifle.
        jugador01.disparo();
    }
}
