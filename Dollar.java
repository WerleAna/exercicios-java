public class Dollar {
    public static void main (String [] args){
    double sales = 24309.65;
    double profit = 18562.18;
    double refunds = 688.78;
    double shipping = 1233.57;

    int roundingSales = (int) sales;
    int roundingProfit = (int) profit;
    int roundingRefunds = (int) refunds;
    int roudingShipping = (int) shipping;

    System.out.println("The number of sales is " + roundingSales);
    System.out.println("The number of profit is " + roundingProfit);
    System.out.println("The number of refunds is " + roundingRefunds);
    System.out.println("The number of shipping is " + roudingShipping);
    }
    
}
