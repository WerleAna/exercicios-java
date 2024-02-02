public class AskJava {
    public static void main (String [] args) {

        double change = 3.50;
        double price = 2.50;

        int capacityElevator = 6;
        int passengers = 8;

        String gain = "Xbox";
        String expect = "PS5";

        int guests = 18;
        int confirmedPresence = 18;

        double candidateOneVotes = 1.500;
        double candidateTwoVotes = 3.000;
        
        System.out.println("Me: Hi Java, do I have enough change to buy chips?");
        System.out.println("Java: " + (change >= price) + "\n");

        System.out.println("Hi Java, can the elevator hold everyone?");
        System.out.println("Java: " + (capacityElevator >= passengers ) + "\n");
    
        System.out.println("Me: Hi Java, will my friend be happy?");
        System.out.println("Java: " + (gain.equals(expect)) + "\n");

        System.out.println("Hi Java, can everyone attend my dinner party?");
        System.out.println("Java: " + (guests == confirmedPresence)  + "\n");

        System.out.println("Hi Java, will I win the election?");
        System.out.println("Java: " + (candidateOneVotes >= candidateTwoVotes) + "\n");
    }
}

