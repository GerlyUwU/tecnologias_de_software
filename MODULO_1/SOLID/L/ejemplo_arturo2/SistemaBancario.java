package MODULO_1.SOLID.L.ejemplo_arturo2;

public class SistemaBancario {
    protected int id;
    protected int saldo;
    protected String clabe;

    public SistemaBancario(int id, int saldo) {
        this.id = id;
        this.saldo = saldo;
        this.clabe = generarClabe();
    }

    private String generarClabe() {
        return String.valueOf(Math.random() * 10);
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }
}


