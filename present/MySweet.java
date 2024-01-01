package present;

interface Sweet {
    void setWeight(double weight);

    void setPrice(double price);

    double getWeight();

    String getName();

    double getPrice();
}



public class MySweet implements Sweet {
    private String name = "Sweet";
    private double weight;
    private double price;

    public MySweet() {
        weight = 500;
        price = 15.89;
    }

    public MySweet(String name, double weight, double price) {
        if (price > 0 && weight > 0 && isValidString(name)) {
            this.name = name;
            this.weight = weight;
            this.price = price;
        }
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%15s %10s %10s", name, weight, price);
    }

    protected void setName(String name) {
        if (isValidString(name)) {
            this.name = name;
        }
    }

    protected boolean isValidString(String string) {
        return string != null && !string.isEmpty();
    }
}

