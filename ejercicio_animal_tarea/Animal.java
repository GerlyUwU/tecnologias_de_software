public abstract class Animal {
    protected String nombre; 
    protected String habitad; 
    protected double peso;
    protected String alimentacion;


    public Animal(String nombre, String habitad, double peso, String alimentacion) {
        this.nombre = nombre;
        this.habitad = habitad;
        this.peso = peso;
        this.alimentacion = alimentacion;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getHabitad() {
        return habitad;
    }


    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    public String getAlimentacion() {
        return alimentacion;
    }


    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    




}
