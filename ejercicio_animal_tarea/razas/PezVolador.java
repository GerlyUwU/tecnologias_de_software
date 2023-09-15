public class PezVolador extends Pez  implements IVolar,INadar{

    public PezVolador(String nombre, String habitad, double peso, String alimentacion, int númeroDeAletas,
            double velocidadNatación, double profundidadPreferida) {
        super(nombre, habitad, peso, alimentacion, númeroDeAletas, velocidadNatación, profundidadPreferida);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String volar() {
        // TODO Auto-generated method stub
        return "UN PEZ VOLADOR (SORPRENDENTEMENTE) PUEDE VOLAR !!!";
    }

    @Override
    public String nadar() {
        // TODO Auto-generated method stub
        return "UN PEZ VOLADOR PUEDE NADAR";
        
    }

    



    
}
