package electricbill;
import java.util.*;

public class Home extends Electricity{
    static double units=0;
    static double totalFanUnits=0;
    static double totalLightUnits=0;
    static double totalTvUnits=0;
    static double totalLaptopUnits=0;
    static double totalAcUnits=0;
    static double acUnits=0;
    static int fanNum =0;
    static int lightNum =0;
    static int tvNum =0;
    static int laptopNum =0;
    static int acNum =0;

    @Override
    public void fan() {
        double fanUnit = 1;
        units = units + fanUnit;
        totalFanUnits = totalFanUnits + fanUnit;

        fanNum++;
    }

    @Override
    public void light() {
        double lightUnit = 2;
        units = units + lightUnit;
        totalLightUnits = totalLightUnits + lightUnit;
        lightNum++;
    }

    @Override
    public void tv() {
        double tvUnit = 3;
        units = units + tvUnit;
        totalTvUnits = totalTvUnits + tvUnit;
        tvNum++;
    }

    @Override
    public void laptop() {
        double laptopUnit = 4;
        units = units + laptopUnit;
        totalLaptopUnits = totalLaptopUnits + laptopUnit;
        laptopNum++;
    }

    @Override
    public void ac() {
        double acUnit = 5;
        units = units + acUnit;
        totalAcUnits = totalAcUnits + acUnit;
        acNum++;
    }

    public double returnUnits()
    {
        return units;
    }

    public static void noOfTimesUsed()
    {
        System.out.println("Total no of times Fan is switched on: "+fanNum);
        System.out.println("Total no of times Light is switched on: "+lightNum);
        System.out.println("Total no of times TV is switched on: "+tvNum);
        System.out.println("Total no of times Laptop is switched on: "+laptopNum);
        System.out.println("Total no of times AC is switched on: "+acNum);
    }

    public static void noOfUnitsUsed()
    {
        TreeMap <String,Double> deviceUnit = new TreeMap<>();
        deviceUnit.put("Fan",totalFanUnits);
        deviceUnit.put("Light",totalLightUnits);
        deviceUnit.put("Tv",totalTvUnits);
        deviceUnit.put("Laptop",totalLaptopUnits);
        deviceUnit.put("Ac",totalAcUnits);
        System.out.println("\n");
        System.out.println("Units Used:" + deviceUnit);
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
       
    noOfTimesUsed();
    noOfUnitsUsed();
    calculateBill(finalUnits);

    }
    
    
    
}
