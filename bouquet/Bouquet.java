package bouquet;
import java.util.Scanner;

public class Bouquet {
    private static Scanner keyboard;
    private static int roseInput;
    private static int lillyInput;
    private static int jasmineInput;
    public static void main(String[] args) 						//Main method.
	{
    
        keyboard = new Scanner(System.in);					//Declaring keyboard as scanner, else null pointer exception will occur.
		
		System.out.println("Bouquet Menu");
        System.out.println("1.Rose");
        System.out.println("2.Lilly");
        System.out.println("3.Jasmine");
        System.out.println("Please enter number of Roses needed in Bouquet.");	//System out message for user.
		roseInput = keyboard.nextInt();	
        System.out.println("Please enter number of Lilly needed in Bouquet.");	//System out message for user.
		lillyInput = keyboard.nextInt();	
        System.out.println("Please enter number of Jasmine needed in Bouquet.");	//System out message for user.
		jasmineInput = keyboard.nextInt();	
        System.out.println("You've selected " + roseInput + " Roses, " + lillyInput + " Lillies & " + jasmineInput + " Jasmines");

        BouquetCost.calculatecost(roseInput,lillyInput,jasmineInput);


    
    }
    
}
