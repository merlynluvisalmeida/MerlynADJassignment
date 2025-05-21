package arrayList;
import java.util.ArrayList;
public class ArrayList1b2 {





    public static void main(String[] args) {
        // Creating an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors to the list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        // Display original list
        System.out.println("Original color list: " + colors);

        // Removing the 2nd element (index 1)
        if (colors.size() > 1) {
            String removedByIndex = colors.remove(1);
            System.out.println("Removed element at index 1: " + removedByIndex);
        } else {
            System.out.println("List does not have enough elements to remove index 1.");
        }

        // Removing "Blue" by value (if it still exists)
        boolean removedBlue = colors.remove("Blue");
        if (removedBlue) {
            System.out.println("Removed color 'Blue' by value.");
        } else {
            System.out.println("Color 'Blue' was not found in the list.");
        }

        // Display updated list
        System.out.println("Updated color list: " + colors);
    }
}
