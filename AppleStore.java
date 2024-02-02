public class AppleStore {
   public static void main(String[] args){
    int numOfApples= 0;
    int numOfCustomers = 0;
    double profit = 0;

    System.out.println("You picked 500 apples from an apple orchard");
    numOfApples = 500;
    System.out.println("Time for business! You're selling each apple for 40 cents");
    profit = 0.40;
    System.out.println("One customer walked in. He bought 4 apples!");
    numOfApples -= 4;
    numOfCustomers = 1;
    profit = 0.40 * 4;
  

    System.out.println("Another customer waled in. He bought 20 apples!");
    numOfApples -= 20 ;
    numOfCustomers = 2;
    profit = 0.40 * 24;


    System.out.println("Another customer walked in. She bought 200 apples!");
    numOfApples -= 200 ;
    numOfCustomers = 3;
    profit = 0.40 * 224;
    
    
    System.out.println("Wow! So far, you made: $" + profit );
    System.out.println(numOfCustomers + " customers love your apples.");
    System.out.println("You have " + numOfApples + " apples left");
}

}
