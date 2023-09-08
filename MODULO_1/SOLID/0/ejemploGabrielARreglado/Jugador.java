// Clase Player que utiliza una instancia de Weapon.
class Jugador {
    private IArma armaActual;

    // Constructor que toma una instancia de Weapon.
    public Jugador(IArma arma) {
        this.armaActual = arma;
    }

    // Método para que el jugador dispare.
    public void disparo() {
        armaActual.disparar();
    }
}