package present;



public class Candy extends MySweet {
    public Candy() {
        super();
        super.setName("Eclairs");
    }

    public Candy(double weight, double price) {
        super("Eclairs", weight, price);
    }
}
