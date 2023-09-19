public class Main {
   public static void main(String[] args) {
    Tv televisor = new Tv();
    Lampara lampara  = new Lampara();
    Boton gura = new Boton(lampara);

gura.apretar(true);
   } 
}
