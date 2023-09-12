public class LightWeightAnimal {

    String nombre; 
    String habitat; 
    String peso;



    public LightWeightAnimal(String nombre, String habitat, String peso) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.peso = peso;
    } 

    public static void caminar(){
        System.out.println("el animal camina");
    }

    public static void saltar(){
        System.out.println("el animal salta el obstaculo");
    }

    
    
}
