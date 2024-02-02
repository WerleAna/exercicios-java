import java.util.Scanner;

public class Bank {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        
        System.out.println(" Are you here to get a mortgage? (yes or no)");
        String option = scanner.nextLine();

        if (option.equals ("yes")) {
            System.out.println("\nGreat! " +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");
            double cashSavings = scanner.nextDouble();
            double debtCard = scanner.nextDouble();
          

         System.out.println("\nHow many years have you worked for?");
        int ageWork = scanner.nextInt();

         System.out.println("What is your name?");
         scanner.nextLine();
         String name =scanner.nextLine();


         if (cashSavings >= 10000 && debtCard < 5000 && ageWork > 2) {
            System.out.println("Congratulations " + name + ", you have been approved!");
         } else {
            System.out.println("Sorry, you are not eligible for a mortgage");
         }
        } else {
         System.out.println("\nHave a nice day!");
        }
    scanner.close();
    }
    }

