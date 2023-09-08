public class DescuentoMontoFijo implements Descuento{

    private double monto;


    

    public DescuentoMontoFijo(double monto) {
        this.monto = monto;
    }




    @Override
    public double aplicarDescuento(double precioOriginal) {
        // TODO Auto-generated method stub
        return precioOriginal-monto;
    }


    
}
