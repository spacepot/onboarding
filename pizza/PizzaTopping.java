package pizza;

//Description:	This class extends PizzaBase and builds the base and toppings.

public class PizzaTopping extends PizzaBase
{
	public PizzaTopping(String Name, double Cost)	//Pizza topping constructor.
	{
		setName(Name);			//Sets the object's name using a set method.
		setCost(Cost);			//Sets the object's cost using a set method.
	}

}
