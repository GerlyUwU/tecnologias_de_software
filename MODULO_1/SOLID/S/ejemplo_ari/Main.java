public class Main {
    

    public static void main(String[] args) {
       /*  Animal animal = new Animal();
        animal.Animal("carballo", "relinchar","pura sangre", "omnivora", "Coatza");


        animal.setSonido("relinchar");
        animal.mostrarInformacion();
        animal.HacerSonido();
        */

        Animal2 animal = new Animal2();
        animal.Animal("carballo", "mujar", "frison", "herviboro", "tancochapa");
        MostrarInfo mi = new MostrarInfo();
        animal.setSonido(" relinchar");
        HacerSonido hs = new HacerSonido();
        mi.MostrarInformacion(animal.getNombre(), animal.getRaza(), animal.getAlimentacion(), animal.getHabitad());
        hs.HacerSonido(animal.getSonido());
        

    }
}
