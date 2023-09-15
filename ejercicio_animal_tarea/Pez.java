public abstract class Pez extends Animal {
    protected int númeroDeAletas;
    protected double velocidadNatación;
    protected double profundidadPreferida;


    
    public Pez(String nombre, String habitad, double peso, String alimentacion, int númeroDeAletas,
            double velocidadNatación, double profundidadPreferida) {
        super(nombre, habitad, peso, alimentacion);
        this.númeroDeAletas = númeroDeAletas;
        this.velocidadNatación = velocidadNatación;
        this.profundidadPreferida = profundidadPreferida;
    }

    
}
