package arrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1b3 {




    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the list
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Display the original list
        System.out.println("Original color list: " + colors);

        // Sort the list
        Collections.sort(colors);

        // Display the sorted list
        System.out.println("Sorted color list: " + colors);
    }
}
