public class Tip {
   public static void main(String[] args) {
    tipTheWaiter(53.50);

   } 

   public static void tipTheWaiter( double account){
    double tip = account * 0.15;

    System.out.println("Tip is " + tip);
   }

}
