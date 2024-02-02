import java.util.Scanner;

public class Chatbot {
    public static void main (String [] args){

    System.out.println("Learn The Part >>: Java Chatbot");

    Scanner scanner = new Scanner(System.in);

    System.out.println("Hello! What is your name?");
    String name = scanner.nextLine();

    System.out.println("Hello! " + name + " I'm Javabot. Where are you from?");
    String city = scanner.nextLine();

    System.out.println("I hear it's beautiful at " + city + " I'm from a place called Oracle");
    System.out.println("How old are you?");
    int age = scanner.nextInt();

    System.out.println("So you're " + age + ", cool. I'm 400 years old");
    int ageJava = 400;
    int ageUser = age;
    int difference = ageJava/ ageUser;

    System.out.println("This means I'm " + difference + " times older than you");
    System.out.println("Enough about me. What's you favorite language?");
    scanner.nextLine();
    String language = scanner.nextLine();

    System.out.println(language + ", that's great! Nice chatting with you " + name + " I have to log off now. See ya!");

    scanner.close();
    }
}
