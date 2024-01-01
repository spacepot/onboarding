package electricbill;

public abstract class Electricity {

    public abstract void fan();
    public abstract void light();
    public abstract void tv();
    public abstract void laptop();
    public abstract void ac();

    static double calculateBill(double units)
    {
        double billToPay = 0;  
          
        // check whether units are less than 100  
        if(units < 100)  
        {  
            billToPay = units*1.20;  
        }  
        // check whether the units are less than 300  
        else if(units < 300){  
            billToPay = 100*1.20+(units - 100)*2;  
        }  
        // check whether the units are greater than 300  
        else if(units > 300)  
        {  
            billToPay = 100*1.20+200*2+(units - 300)*3;  
        }  
        System.out.println("\n");
        System.out.println("Total Bill to pay:" + billToPay); 
        // returned result  
        return billToPay; 
        
    }
     
}
