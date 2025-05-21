package linkedList;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedList1c2 {
	

	
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colors = new LinkedList<>();

	        // Add colors to the list
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display the original list
	        System.out.println("Original LinkedList: " + colors);

	        // Get a descending iterator
	        Iterator<String> reverseIterator = colors.descendingIterator();

	        // Iterate and print elements in reverse order
	        System.out.println("Iterating in reverse order:");
	        while (reverseIterator.hasNext()) {
	            System.out.println(reverseIterator.next());
	        }
	    }
	}


