
public class JavaMart {
    
    public static void main(String [] args) {
   

   
    
    double wallet = 100;

    int ToyDoll = 10;
     System.out.println("Can I get this doll?");
   if (wallet >= ToyDoll) {
        System.out.println(">>: Sure!\n");
        wallet -= ToyDoll;
    } else {
        System.out.println(">>: Sorry, I have only " + wallet + "$");
    }

    int ToyCar = 10;

 if (wallet >= ToyCar) {
        System.out.println(">>: Sure!\n");
        wallet -= ToyCar;
    } else {
        System.out.println(">>: Sorry, I have only " + wallet + "$");
    }
 
    double phone = 99.9;

    if (wallet >= phone) {
        System.out.println(">>: Sure!\n");
        wallet -= phone;
    } else {
        System.out.println(">>: Sorry, I have only " + wallet + "$");
    }
}
}
