public class HeavyWeightAnimal {

    String nombre;
    String habitad;
    String peso;

    public HeavyWeightAnimal(String nombre, String habitad, String peso) {
        this.nombre = nombre;
        this.habitad = habitad;
        this.peso = peso;
    }

    public static void caminar() {
        System.out.println("el elefante camina");
    }

    public void agujero() {
        HeavyWeightAnimal.caminar();

    }
}