public class Animal{
    String nombre; 
    String habitad; 
    String peso; 




    public Animal(String nombre, String habitad, String peso) {
        this.nombre = nombre;
        this.habitad = habitad;
        this.peso = peso;
    }
    public static void caminar(){
        System.out.println("el animal camina");
    }
    public static void saltar(){
        System.out.println("el animal salta la zanja");
    }
    
    public  static void saltarAgujero(){
         Animal.saltar();
    Animal.caminar();
    
    }
    

   

    }


