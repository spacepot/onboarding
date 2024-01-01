package pizza;

//Description:	This class models a pizza base.

public class PizzaBase 
{
	private String Name;				//Declare cost name.
	private double Cost;				//Declare base cost.
	
	public PizzaBase()				//Constructor for pizza base.
	{
		setName(Name);				//Sets object's name using a setter method.
		setCost(Cost);				//Sets object's cost using a setter method.
		
	}
	
	public String getName()				//Base name getter method.
	{
		return Name;
	}
	
	public void setName(String Name)		//Base name setter method.
	{
		this.Name = Name;			//Base name in this method = Base name throughout this class.
	}
	
	public double getCost()				//Base cost getter method.
	{
		return Cost;				//Base cost in this method = Base cost throughout this class.
	}
	
	public void setCost(double Cost)		//Base cost setter method.
	{
		this.Cost = Cost;
	}
	
	

}
