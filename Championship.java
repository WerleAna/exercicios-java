public class Championship {
    
  public static void main(String[] args) {
    int gryffindor = 100;
    int ravenclaw = 500; 

    int differencePoints = ( gryffindor - ravenclaw);

    if (differencePoints >= 300) {
        System.out.println("Gryffindor takes the house cup!");
    } else if (gryffindor > ravenclaw) {
        System.out.println("In second place, Gryffindor!");
    } else if (differencePoints == 100)  {
        System.out.println("In third place, Gryffindor!");
    } else {
         System.out.println("In fourth place, Gryffindor!");
    }
    }
}
