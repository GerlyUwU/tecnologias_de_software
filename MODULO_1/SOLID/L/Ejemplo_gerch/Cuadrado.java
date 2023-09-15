public class Cuadrado extends Figura {

    public Cuadrado(double lado1, double lado2) {
        super(lado1, lado2);

    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

}
