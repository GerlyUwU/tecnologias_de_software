public class Triangulo extends Figura {

    public Triangulo(double lado1, double lado2) {
        super(lado1, lado2);
    }

    @Override
    public double calcularArea(){
        return (lado1*lado2)/2;
    }

    
}
