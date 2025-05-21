package arrayList;
import java.util.ArrayList;
import java.util.List;
public class ArrayList1b4 {
	

	
	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors to the list
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display the original list
	        System.out.println("Original color list: " + colors);

	        // Extract 1st and 2nd elements using subList (index 0 to 2, exclusive of end index)
	        if (colors.size() >= 2) {
	            List<String> subColors = colors.subList(0, 2);
	            System.out.println("Extracted sublist (1st and 2nd elements): " + subColors);
	        } else {
	            System.out.println("List does not have enough elements for subList extraction.");
	        }
	    }
	}


