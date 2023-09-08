// Implementación de un nuevo tipo de arma: Rifle.
class Rifle implements IArma {
    @Override
    public void disparar() {
        System.out.println("El jugador dispara con un rifle.");
    }
}