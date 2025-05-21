package arrayList;
import java.util.ArrayList;
public class Arraylist1b1 {
	

	
	    public static void main(String[] args) {
	        // Creating an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding colors to the list
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Red");
	        colors.add("Orange");

	        // Displaying all the colors
	        System.out.println("Colors in the list: " + colors);

	        // Searching for "Red"
	        if (colors.contains("Red")) {
	            System.out.println("The color 'Red' is available in the list.");
	        } else {
	            System.out.println("The color 'Red' is NOT available in the list.");
	        }
	    }
	}


