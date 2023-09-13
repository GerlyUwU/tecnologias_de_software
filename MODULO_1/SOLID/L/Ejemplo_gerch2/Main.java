public class Main {

    public static void imprimirArea(Figura figura){
        double area = figura.calcularArea();
        System.out.println("el area de esta figura es: "+area);

    }

    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado(45);
        Figura circulo = new Circulo(69);

        imprimirArea(circulo);
        imprimirArea(cuadrado);
    }
    
}
