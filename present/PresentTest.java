package present;

public class PresentTest {
    public static void main(String[] args) {
        Present present = new Present("Red");

        //Adding or Removing Sweets to the present
        present.addRandomSweet(2);
        present.addChocholate(4, 100, 5);
        present.addCandy(4, 70, 4);
        present.addMarmalade(4, 150, 10);
        present.removeCandy(1);
        present.removeChocolate(1); 
        present.removeMarmalade(1);

        //Changing color of the package
        present.changePackaging("Blue");

        //Sorting based on Price
        present.sort();

        //Displaying the details of the present
        present.show();

    }
}
