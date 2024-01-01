package present;

public class PresentTest {
    public static void main(String[] args) {
        Present present = new Present("Red");

        //Adding or Removing Sweets to the present
        present.addRandomSweet(3);
        present.addChocholate(4, 100, 5);
        present.addCandy(3, 70, 7);
        present.addMarmalade(2, 75, 2.99);
        present.removeCandy(2);
        present.removeChocolate(2); 
        present.removeMarmalade(1);

        //Changing color of the package
        present.changePackaging("Blue");

        //Sorting based on Price
        present.sort();
        
        //Displaying the details of the present
        present.show();

    }
}
