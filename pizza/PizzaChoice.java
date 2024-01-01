package pizza;

//Description:	This class will us to choose the pizza topping and base 

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaChoice
{
	private static ArrayList<PizzaBase> bases = new ArrayList<PizzaBase>();		//Array List for the pizza base menu.
	private static ArrayList<PizzaTopping> tops = new ArrayList<PizzaTopping>();	//Array List for the pizza topping menu.
	private static Scanner keyboard;						//Initialize scanner for user input.
	private static int bInput;							//Integer for user base selection.
	private static int tInput;							//Integer for user topping selection.
	
	public static void addBase(PizzaBase base)					//Method for adding bases to the base menu.
	{
		bases.add(base);
	}
	
	public static void addTop(PizzaTopping topping)					//Method for adding toppings to the topping menu.
	{
		tops.add(topping);
	}
		
	public static void main(String[] args) 						//Main method.
	{
		
		Pizza pizza = new Pizza();						//Creates new pizza object according to the pizza class.
		//************Adds pizza bases to the base menu************//
		addBase(new PizzaTopping("Soft",5.50));
		addBase(new PizzaTopping("Standard",7.00));
				
		baseMenu(pizza);							//Calls the bases menu.
		
		try
		{
		baseChoice(pizza);							//Tries the baseChoice method.
		}		
        catch(IllegalArgumentException iae)						//Catches error thrown by the baseChoice method.
		{
        		System.out.println("Invalid selection, please select again");	//Shows user error method.
        		baseChoice(pizza);						//Continues baseChoice method.
		}
		
		//************Adds pizza toppings to topping menu************//
		//**************************Sauces**************************//
		
		addTop(new PizzaTopping("Tomato", 1.00));
		addTop(new PizzaTopping("Corn", 1.25));
		addTop(new PizzaTopping("Mushroom", 0.50));
		
		toppingMenu(pizza);							//Calls the topping menu method.
		try
		{
		toppingChoice(pizza);							//Tries the toppingChoice method.
		}
        catch(IllegalArgumentException iae)						//Catches the error thrown by toppingChoice method.
		{		
        		System.out.println("Invalid selection, please select again");	//Shows user error message.
        		toppingChoice(pizza);						//Continues toppingChoice method.
		}
		pizza.total();								//Calls total method that shows summary of pizza bases, toppings and price.
	}
	
	public static void baseMenu(Pizza pizza)					//Method for printing table of pizza bases (printing array list).
	{
		int i = 1;								//Int i for labelling bases for user.
		keyboard = new Scanner(System.in);					//Declaring keyboard as scanner, else null pointer exception will occur.
		
		System.out.println("Pizza base selection");											
		String newLine = System.getProperty("line.separator");			//Initialize "newLine" to enter a newline when entered in a system.out statement.
		System.out.print("\t------------------------------------" + newLine);	//Prints top border.
		System.out.format("\t%15s%21s", "-Bases-",  "-Price- "+ newLine);	//Prints header for the table.
		System.out.print("\t------------------------------------" + newLine);	//Prints border.
		
		for(PizzaBase base : bases)									//for loop for every pizza base in bases menu.
		{
			System.out.printf(newLine + "\t%5s. %-15s:%10s", i, base.getName(), base.getCost());	//Prints every pizza base and its price.
			i++;											//Adds 1 to i for base labeling.
		}
		
		System.out.print(newLine + "\t------------------------------------" + newLine);			//Prints border.
	}
	
	public static void baseChoice(Pizza pizza)								//Method for choosing the base.
	{	
		System.out.println("Please enter your choice of base by entering its respective number.");	//System out message for user.
		bInput = keyboard.nextInt();									//Uses user input as bInput.

		if(bInput<1||bInput>2)										//If statement for if the input is not valid.
		{
			throw new IllegalArgumentException("\nMust enter a number between 1 and 2.\nPlease run again.");	//Throws exception.
		}
		else if(bInput == 1)										//Else if loop for setting the pizza base.
		{
			pizza.setPizzaBase(new PizzaTopping("Soft", 5.50));				//Creates new pizza base and sets it for pizza.
			System.out.println("You've selected 'Soft'.\n");					//Confirmation message for user.
		}
		else if(bInput == 2)
		{
			pizza.setPizzaBase(new PizzaTopping("Standard", 7));				//Creates new pizza base and sets it for pizza.
			System.out.println("You've selected 'Standard'.\n");					//Confirmation message for user.
		}
		
		pizza.setbInput(bInput);									//Sets bInput .		
	}
	
	public static void toppingMenu(Pizza pizza)								//Method for printing table of pizza toppings (printing array list).
	{
		int i = 1;											//Int i for labelling bases for user.
		
		System.out.println("Pizza topping selection");
		String newLine = System.getProperty("line.separator");						//Initialize "newLine" to enter a newline when entered in a system.out statement.
		System.out.print("\t------------------------------------" + newLine);				//Prints top border.
		System.out.format("\t%15s%21s", "-Toppings-",  "-Price- "+ newLine);				//Prints header for the table.
		System.out.print("\t------------------------------------" + newLine);				//Prints border.
		
		for(PizzaTopping topping : tops)								//for loop for every pizza topping.
		{
			System.out.printf(newLine + "\t%5s. %-15s:%10s", i, topping.getName(), topping.getCost());	//Prints every pizza topping and its price.
			i++;											//Adds 1 to i for base labeling.
		}
		
		System.out.print(newLine + "\t------------------------------------" + newLine);			//Prints border.
	}
	
	public static void toppingChoice(Pizza pizza)								//Method for topping selection.
	{	
		System.out.println("Please select your toppings by entering their respective numbers."		//Print out statement for user.
					+ "\nEnter 0 at any time to end the selection.\n");	
		do												//Do while loop for while tInput does not equal 0.
		{
			tInput = keyboard.nextInt();								//Takes user input as tInput.
			pizza.settInput(tInput);								//Sets tInput.
		if(tInput<-1||tInput>3)									//If tInput is outside of selection throws error message.
		{
			throw new IllegalArgumentException("\nMust enter a number between 0 and 2.\nPlease run again.");
		}	
		else if(tInput == 0)										//Else if statement for topping selection.
		{
			System.out.println("End of topping selection.");					//If 0 is entered, break.
			break;
		}
		else if(tInput == 1)										//Topping selections.
		{
			pizza.addTopping(new PizzaTopping("Tomato", 1.00));				//Creates new topping and adds to pizza.
			System.out.println("You've selected 'Tomato'.");					//Confirmation message.
		}
		else if(tInput == 2)
		{
			pizza.addTopping(new PizzaTopping("Corn", 1.25));
			System.out.println("You've selected 'Corn'.");
		}
		else if(tInput == 3)
		{
			pizza.addTopping(new PizzaTopping("Mushroom", .50));
			System.out.println("You've selected 'Mushroom'.");
		}
		} while(tInput != 0);	//If tInput is 0 then do...while loop ends.
	}
	
}
