import java.util.Scanner;

public class SignUp{
    public static void main (String [] args) {

        System.out.println("\nWelcome. Thank you for taking the survey!");

        Scanner scanner = new Scanner(System.in);
        

        System.out.println("\nWhat is your first name?");
        String name = scanner.nextLine();

        System.out.println("\nWhat is your last name?");
        String lastName = scanner.nextLine();

        System.out.println("\nHow old are you?");
        int age = scanner.nextInt();

        System.out.println("\nMake a username");
        scanner.nextLine();
        String userName = scanner.nextLine();

        System.out.println("\nWhat city do you live in?");
        String city = scanner.nextLine();

        System.out.println("\nWhat country is that?");
        String country = scanner.nextLine();
     
        scanner.close();
        

        System.out.println("\nThank you for joining JavaGram!");
        System.out.println("\nHere is the information you entered");
        System.out.println("\tFirst name: " + name);
        System.out.println("\tLast name: " + lastName);
        System.out.println("\tYour age: " + age);
        System.out.println("\tYour username: " + userName);
        System.out.println("\tCity you live: " + city);
        System.out.println("\tCountry you live: " + country);
    }
}
