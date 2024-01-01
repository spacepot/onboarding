package bouquet;

public class BouquetCost {
    static final double priceOfRose = 4.00;
    static final double priceOfLilly= 5.00;
    static final double priceOfJasmine = 2.00;

    public static void calculatecost(int noOfRose,int noOfLilly, int noOfJasmine)
    {
       
        double totalCostOfRose = noOfRose * priceOfRose;    
        double totalCostOfLilly = noOfLilly * priceOfLilly;  
        double totalCostOfJasmine = noOfJasmine * priceOfJasmine;  

        double totalCost = totalCostOfRose + totalCostOfLilly + totalCostOfJasmine;

        System.out.println("Total Cost: " + totalCost + " Rs.");




    }
}
