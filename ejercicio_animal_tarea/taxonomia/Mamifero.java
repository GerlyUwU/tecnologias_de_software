public abstract class Mamifero  extends Animal{
    
    protected String tipoPelaje;

    public Mamifero(String nombre, String habitad, double peso, String alimentacion, String tipoPelaje) {
        super(nombre, habitad, peso, alimentacion);
        this.tipoPelaje = tipoPelaje;
    }
    

 

    
}
