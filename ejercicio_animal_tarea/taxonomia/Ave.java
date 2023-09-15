public abstract class Ave  extends Animal{
    protected double envergaduraAlas;
    protected boolean isMigratoria;
    protected String colorPlumaje;


    
    public Ave(String nombre, String habitad, double peso, String alimentacion, double envergaduraAlas,
            boolean isMigratoria, String colorPlumaje) {
        super(nombre, habitad, peso, alimentacion);
        this.envergaduraAlas = envergaduraAlas;
        this.isMigratoria = isMigratoria;
        this.colorPlumaje = colorPlumaje;
    }
    
}
