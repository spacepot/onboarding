package present;



public class Marmalade extends MySweet {
    public Marmalade() {
        super();
        super.setName("Nutella");
    }

    public Marmalade(double weight, double price) {
        super("Nutella", weight, price);
    }
}
