public class Main{
    public static void main(String[] args) {
        Bebidas bebidas1 = new BebidasAzucarada("pecsi", 10, null, 2);
        System.out.println("la bebida es: "+bebidas1.getNombre()+" el precio es; "+bebidas1.precioTotal());
    }
}