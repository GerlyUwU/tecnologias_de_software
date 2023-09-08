public class DescuentoPorPorcentaje implements Descuento {

    private double porcentaje;




    
    public DescuentoPorPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }





    @Override
    public double aplicarDescuento(double precioOriginal) {
        // TODO Auto-generated method stub
        return precioOriginal-(precioOriginal*(porcentaje/100));
    }

    
}
