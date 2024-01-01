package present;



public class Chocolate extends MySweet {
    public Chocolate() {
        super();
        super.setName("Dairy Milk");
    }

    public Chocolate(double weight, double price) {
        super("Dairy Milk", weight, price);
    }
}
