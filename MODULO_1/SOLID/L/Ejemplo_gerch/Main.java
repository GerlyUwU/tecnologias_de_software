public class Main {
    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado(45, 45);
        System.out.println("area cuadrado: "+cuadrado.calcularArea());

        Figura triangulo = new Triangulo(44, 44);
        System.out.println("area triangulo: "+triangulo.calcularArea());
    }
}
