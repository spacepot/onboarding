package present;



public class Packaging {
    private String color;

    public Packaging() {
        color = "red";
    }

    public Packaging(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color of the package: " + color;
    }

}
