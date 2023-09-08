public class Bebidas {
    public String nombre; 
    public double precio;
    public String tipo;
    public double impuesto;



    public Bebidas(String nombre, double precio, String tipo, double impuesto) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.impuesto = impuesto;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public double getPrecio() {
        return precio;
    }



    public void setPrecio(double precio) {
        this.precio = precio;
    }



    public String getTipo() {
        return tipo;
    }



    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    public double getImpuesto() {
        return impuesto;
    }



    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    


    

}
