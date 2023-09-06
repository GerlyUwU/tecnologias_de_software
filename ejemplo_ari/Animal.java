public class Animal{
    private String nombre;
    private String sonido;
    private String raza;
    private String alimentacion;
    private String habitad;


    //constructor
    public void  Animal(String nombre, String sonido, String raza, String alimentacion, String habitad) {
        this.nombre = nombre;
        this.sonido = sonido;
        this.raza = raza;
        this.alimentacion = alimentacion;
        this.habitad = habitad;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getSonido() {
        return sonido;
    }


    public void setSonido(String sonido) {
        this.sonido = sonido;
    }


    public String getRaza() {
        return raza;
    }


    public void setRaza(String raza) {
        this.raza = raza;
    }


    public String getAlimentacion() {
        return alimentacion;
    }


    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }


    public String getHabitad() {
        return habitad;
    }


    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }


    public void mostrarInformacion(){
        System.out.println("el nombre del animal es: "+nombre+ " el sonido que hace se le llama: "+sonido+
        " pertenece a la raza de "+raza + " su alimentafcion es: "+alimentacion+" y su habitad es "+habitad);
    }//fin del metodo mostrar informacion del objeto en cuestion 

    public void HacerSonido(){
        System.out.println("EL sonido que hace se le llama: "+sonido);
    }
    
}