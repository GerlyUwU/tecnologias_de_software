public class Paloma extends Animal implements IVolar, ICaminar {

    public Paloma(String nombre, String habitad, double peso, String alimentacion) {
        super(nombre, habitad, peso, alimentacion);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String caminar() {
        // TODO Auto-generated method stub
        return "UNA PALOMA PUEDE CAMINAR";
    }

    @Override
    public String volar() {
        // TODO Auto-generated method stub
        return "UNA PALOMA PUEDE VOLAR";
    }

    
}
