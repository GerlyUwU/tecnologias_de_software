public class Gato extends Animal implements ICaminar {

    public Gato(String nombre, String habitad, double peso, String alimentacion) {
        super(nombre, habitad, peso, alimentacion);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String caminar() {
        // TODO Auto-generated method stub
        return "EL GATO PUEDE CAMINAR";
    }
    
}
