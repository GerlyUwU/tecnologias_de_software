package MODULO_1.SOLID.L.ejemplo_arturo;

public class BancaMovil{
    private int id; 
    private int saldo; 
    private String clabe;
    private String version; 
    private String oS; 



  

    public BancaMovil(int id, int saldo, String version, String oS) {
        this.id = id;
        this.saldo = saldo;
        this.version = version;
        this.oS = oS;
        this.clabe=generarClabe();
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getoS() {
        return oS;
    }

    public void setoS(String oS) {
        this.oS = oS;
    }
    

    
}