public class Main {
   public static void main(String[] args) {
   Interruptor smartv = new Tv();
   Interruptor lamparalsca = new Lampara();

   Boton boton = new Boton(lamparalsca);
   boton.estado(true);
   
   } 
}
