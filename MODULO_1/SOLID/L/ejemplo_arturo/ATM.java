package MODULO_1.SOLID.L.ejemplo_arturo;

public class ATM {
    public int id; 
    public int saldo; 
    private String clabe;
    private String region; 



    public ATM(int id, int saldo) {
        this.id = id;
        this.saldo = saldo;
        this.clabe = generarClabe();
    } 

    private String generarClabe(){
        return String.valueOf(Math.random()*10);
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

     

    
    
}
