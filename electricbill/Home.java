package electricbill;

public class Home extends Electricity{
    static double units=0;
    @Override
    public void fan() {
        double fanUnit = 1;
        units = units + fanUnit;
        
    }

    @Override
    public void light() {
        double lightUnit = 2;
        units = units + lightUnit;
        
    }

    @Override
    public void tv() {
        double tvUnit = 3;
        units = units + tvUnit;
        
    }

    @Override
    public void laptop() {
        double laptopUnit = 4;
        units = units + laptopUnit;
        
    }

    @Override
    public void ac() {
        double acUnit = 5;
        units = units + acUnit;
        
    }

    public double returnUnits()
    {
        return units;
    }

    public static void main(String[] args) 						//Main method.
	{
    Home switchOn = new Home();
    
    switchOn.fan();
    switchOn.laptop();
    switchOn.fan();
    switchOn.tv();
    switchOn.tv();
    switchOn.light();
    switchOn.laptop();
    switchOn.laptop();
    switchOn.fan();
    switchOn.tv();
    switchOn.tv();
    switchOn.light();
    switchOn.fan();
    switchOn.tv();
    switchOn.tv();
    switchOn.light();
    switchOn.laptop();
    switchOn.fan();
    switchOn.tv();
    switchOn.tv();


    double finalUnits = switchOn.returnUnits();
   
    calculateBill(finalUnits);

    }
    
    
    
}
