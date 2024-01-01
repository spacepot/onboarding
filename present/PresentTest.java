package present;

public class PresentTest {
    public static void main(String[] args) {
        Present present = new Present("Red");

        present.addRandomSweet(3);
        present.addChocholate(2, 100, 5);
        present.addCandy(3, 70, 7);
        present.addMarmalade(2, 75, 2.99);
        present.removeCandy(2);

        present.sort();
        present.show();

    }
}
