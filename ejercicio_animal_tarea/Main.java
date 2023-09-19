public class Main{
    public static void main(String[] args) {
        Tiburon tiburon1 = new Tiburon("gerly", "oceano", 34, "personas");
        System.out.println("nombre: "+tiburon1.getNombre()+" habitad: "+tiburon1.getHabitad()+" peso: "+tiburon1.getPeso()+" alimentacion: "+tiburon1.getAlimentacion());
        Pato pato1 = new Pato("juan", "lago", 15, "omnivora");
        

    }

    public static void mostrarInformacion(Animal o){
        System.out.println(o.alimentacion+o.habitad+o.peso);
    }
}