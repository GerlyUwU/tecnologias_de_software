package MODULO_1.SOLID.L.ejemplo_arturo2;

public class Main {
    public static void main(String[] args) {
        System.out.println("===============XXXXXXXXXXXXXXXXXXXXX============");
        SistemaBancario sistema = new SistemaBancario(1, 5000000);
        System.out.println("LA CLABE DE ESTA CUENTA ES: "+sistema.getClabe());
        System.out.println("EL SALDO INVERTIDO ES: "+sistema.getSaldo());
        System.out.println("____________fin del programa :) _________________");
        System.out.println("==============XXXXXXXXXXXXXXXXXXXXXX============");
    }
    
}
