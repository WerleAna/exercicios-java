import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        
       System.out.println("Welcome the Quiz from game of thrones!!");
        
       Scanner scanner = new Scanner(System.in);

       int points = 0;

        System.out.println("QUESTION 1: In Season One, who fell out of a window and lost the use of their legs?" + 
        "\n a) Shireen Baratheon" +
        "\n b) Jaime Lannister" + 
        "\n c) Bran Stark" + 
        "\n d) Arya Stark");
        String answerOne = scanner.nextLine();
        // c
        // 5 points

         System.out.println("QUESTION 2: Which of these were Stark? (select two)" + 
        "\n a) Jon" +
        "\n b) Robb" + 
        "\n c) Cersei" + 
        "\n d) Ramsey");
        String answerTwo = scanner.nextLine();
        
        //b e d
        // 10 points

        System.out.println("QUESTION 3: Who was known as the 'Mother of Dragons'" + 
        "\n a) Sansa Stark" +
        "\n b) Cersei Lannister" + 
        "\n c) Daenerys Targaryen" + 
        "\n d) Margaery Tyrell");
        String answerThree = scanner.nextLine();
        // c
        // 5 points
        if (answerOne. equals("c")) {
            points += 5;
        } else {
           points = 0;
        }
        
        if (answerTwo. equals("b")) {
            points += 10;
        } else {
            points += 0;
        }

        if (answerThree. equals("c")) {
            points += 5;
        } else {
           points = 0;
        }

       if (points >= 15) {
        System.out.println("Wow, you know your stuff!");
       } else if ( points < 15) {
        System.out.println("Not bad");
       } else {
        System.out.println("Better luck next time!");
       }


        scanner.close();
    }
}
