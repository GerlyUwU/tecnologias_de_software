public class Main{

    public static void main(String[] args) {
        System.out.println("hi");


        Bebidas pecsi = new Bebidas("pecsi", 10, "azucarada", 1.16);
        float precioFinal = (float)(pecsi.getPrecio()*pecsi.getImpuesto());

        System.out.println("LA BEBIDA "+pecsi.getNombre()+" tipo: "+pecsi.tipo+" precio: "+precioFinal);
    }
}