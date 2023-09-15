public class Pato extends Animal implements INadar, IVolar, ICaminar {

    public Pato(String nombre, String habitad, double peso, String alimentacion) {
        super(nombre, habitad, peso, alimentacion);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String caminar() {
        // TODO Auto-generated method stub
       return "UN PATO PUEDE CAMINAR";
    }

    @Override
    public String volar() {
        // TODO Auto-generated method stub
        return " UN PATO PUEDE VOLAR ";
    }

    @Override
    public String nadar() {
        // TODO Auto-generated method stub
        return "UN PATO PUEDE NADAR";
    }

    
}
