public class Delfin extends Animal implements INadar{

    public Delfin(String nombre, String habitad, double peso, String alimentacion) {
        super(nombre, habitad, peso, alimentacion);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String nadar() {
        // TODO Auto-generated method stub
        return "EL DELFIN PUEDE NADAR";
    }
    
}
