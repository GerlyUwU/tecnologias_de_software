public class Main{

public static void main(String[] args) {
    DescuentoPorPorcentaje descuento1 = new DescuentoPorPorcentaje(10);
    DescuentoMontoFijo descuentoFijo = new DescuentoMontoFijo(10);
    


    descuentoFijo.aplicarDescuento(50);
    

    System.out.println(descuentoFijo.aplicarDescuento(50));
    System.out.println(descuento1.aplicarDescuento(100));
}


}

