public class WorkSchendule {
    public static void main(String[] args) {
        int day = 7;
        boolean holiday = false;

        if (day <= 6 && holiday) {
            System.out.println("Woooho, no work!");
        } else if  (day >= 6 || holiday) {
            System.out.println("It's the weekend, no work!");
        } else {
            System.out.println("Wake up at 7:00");
        }

    }
}
